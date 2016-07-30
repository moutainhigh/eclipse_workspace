/*
 * Entagged Audio Tag library
 * Copyright (c) 2003-2005 Rapha�l Slinckx <raphael@slinckx.net>
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *  
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package com.hadeslee.audiotag.audio;

import com.hadeslee.audiotag.audio.exceptions.CannotReadException;
import com.hadeslee.audiotag.audio.exceptions.CannotWriteException;
import com.hadeslee.audiotag.audio.exceptions.InvalidAudioFrameException;
import com.hadeslee.audiotag.audio.exceptions.ReadOnlyFileException;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;

import com.hadeslee.audiotag.audio.flac.FlacFileReader;
import com.hadeslee.audiotag.audio.flac.FlacFileWriter;
import com.hadeslee.audiotag.audio.generic.AudioFileModificationListener;
import com.hadeslee.audiotag.audio.generic.AudioFileReader;
import com.hadeslee.audiotag.audio.generic.AudioFileWriter;
import com.hadeslee.audiotag.audio.generic.ModificationHandler;
import com.hadeslee.audiotag.audio.generic.Utils;
import com.hadeslee.audiotag.audio.ogg.OggFileReader;
import com.hadeslee.audiotag.audio.ogg.OggFileWriter;
import com.hadeslee.audiotag.audio.mp3.MP3FileReader;
import com.hadeslee.audiotag.audio.mp3.MP3FileWriter;
import com.hadeslee.audiotag.tag.TagException;

/**
 * <p/>
 * The main entry point for the Tag Reading/Writing operations, this class will
 * select the appropriate reader/writer for the given file.
 * </p>
 * <p/>
 * It selects the appropriate reader/writer based on the file extension (case
 * ignored).
 * </p>
 * <p/>
 * Here is an simple example of use:
 * </p>
 * <p/>
 * <code>
 * AudioFile audioFile = AudioFileIO.read(new File("audiofile.mp3")); //Reads the given file.<br/>
 * int bitrate = audioFile.getBitrate(); //Retreives the bitrate of the file.<br/>
 * String artist = audioFile.getTag().getFirstArtist(); //Retreive the artist name.<br/>
 * audioFile.getTag().setGenre("Progressive Rock"); //Sets the genre to Prog. Rock, note the file on disk is still unmodified.<br/>
 * AudioFileIO.write(audioFile); //Write the modifications in the file on disk.
 * </code>
 * </p>
 * <p/>
 * You can also use the <code>commit()</code> method defined for
 * <code>AudioFile</code>s to achieve the same goal as
 * <code>AudioFileIO.write(File)</code>, like this:
 * </p>
 * <p/>
 * <code>
 * AudioFile audioFile = AudioFileIO.read(new File("audiofile.mp3"));<br/>
 * audioFile.getTag().setGenre("Progressive Rock");<br/>
 * audioFile.commit(); //Write the modifications in the file on disk.<br/>
 * </code>
 * </p>
 *
 * @author Raphael Slinckx
 * @version $Id: AudioFileIO.java,v 1.8 2007/10/30 11:41:20 paultaylor Exp $
 * @see AudioFile
 * @see Tag
 * @since v0.01
 */
public class AudioFileIO
{

    //Logger
    public static Logger logger = Logger.getLogger("com.hadeslee.jaudiotagger.audio");

    // !! Do not forget to also add new supported extensions to AudioFileFilter
    // !!

    /**
     * This field contains the default instance for static use.
     */
    private static AudioFileIO defaultInstance;

    /**
     * <p/>
     * Delete the tag, if any, contained in the given file.
     * </p>
     *
     * @param f The file where the tag will be deleted
     * @throws CannotWriteException If the file could not be written/accessed, the extension
     *                              wasn't recognized, or other IO error occured.
     */
    public static void delete(AudioFile f) throws CannotReadException, CannotWriteException
    {
        getDefaultAudioFileIO().deleteTag(f);
    }

    /**
     * This method returns the default isntance for static use.<br>
     *
     * @return The default instance.
     */
    public static AudioFileIO getDefaultAudioFileIO()
    {
        if (defaultInstance == null)
        {
            defaultInstance = new AudioFileIO();
        }
        return defaultInstance;
    }

    /**
     * <p/>
     * Read the tag contained in the given file.
     * </p>
     *
     * @param f The file to read.
     * @return The AudioFile with the file tag and the file encoding infos.
     * @throws CannotReadException If the file could not be read, the extension wasn't
     *                             recognized, or an IO error occured during the read.
     */
    public static AudioFile read(File f)
            throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException
    {
        return getDefaultAudioFileIO().readFile(f);
    }

    /**
     * <p/>
     * Write the tag contained in the audiofile in the actual file on the disk.
     * </p>
     *
     * @param f The AudioFile to be written
     * @throws CannotWriteException If the file could not be written/accessed, the extension
     *                              wasn't recognized, or other IO error occured.
     */
    public static void write(AudioFile f) throws CannotWriteException
    {
        getDefaultAudioFileIO().writeFile(f);
    }

    /**
     * This member is used to broadcast modification events to registered
     */
    private final ModificationHandler modificationHandler;

    // These tables contains all the readers/writers associated with extension
    // as a key
    private Map<String, AudioFileReader> readers = new HashMap<String, AudioFileReader>();
    private Map<String, AudioFileWriter> writers = new HashMap<String, AudioFileWriter>();


    /**
     * Creates an instance.
     */
    public AudioFileIO()
    {
        this.modificationHandler = new ModificationHandler();
        prepareReadersAndWriters();
    }

    /**
     * Adds an listener for all file formats.
     *
     * @param listener listener
     */
    public void addAudioFileModificationListener(
            AudioFileModificationListener listener)
    {
        this.modificationHandler.addAudioFileModificationListener(listener);
    }

    /**
     * <p/>
     * Delete the tag, if any, contained in the given file.
     * </p>
     *
     * @param f The file where the tag will be deleted
     * @throws CannotWriteException If the file could not be written/accessed, the extension
     *                              wasn't recognized, or other IO error occured.
     */
    public void deleteTag(AudioFile f) throws CannotReadException, CannotWriteException
    {
        String ext = Utils.getExtension(f.getFile());

        Object afw = writers.get(ext);
        if (afw == null)
        {
            throw new CannotWriteException(
                    "No Deleter associated to this extension: " + ext);
        }

        ((AudioFileWriter) afw).delete(f);
    }

    /**
     * Creates the readers and writers.
     */
    private void prepareReadersAndWriters()
    {

        // Tag Readers
        readers.put(SupportedFileFormat.OGG.getFilesuffix(), new OggFileReader());
        readers.put(SupportedFileFormat.FLAC.getFilesuffix(), new FlacFileReader());
        readers.put(SupportedFileFormat.MP3.getFilesuffix(), new MP3FileReader());

        // Tag Writers
        writers.put(SupportedFileFormat.OGG.getFilesuffix(), new OggFileWriter());
        writers.put(SupportedFileFormat.FLAC.getFilesuffix(), new FlacFileWriter());
        writers.put(SupportedFileFormat.MP3.getFilesuffix(), new MP3FileWriter());

        // Register modificationHandler
        Iterator it = writers.values().iterator();
        while (it.hasNext())
        {
            AudioFileWriter curr = (AudioFileWriter) it.next();
            curr.setAudioFileModificationListener(this.modificationHandler);
        }
    }

    /**
     * <p/>
     * Read the tag contained in the given file.
     * </p>
     *
     * @param f The file to read.
     * @return The AudioFile with the file tag and the file encoding infos.
     * @throws CannotReadException If the file could not be read, the extension wasn't
     *                             recognized, or an IO error occured during the read.
     */
    public AudioFile readFile(File f)
            throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException
    {
        String ext = Utils.getExtension(f);

        AudioFileReader afr = readers.get(ext);
        if (afr == null)
        {
            throw new CannotReadException(
                    "No Reader associated to this extension: " + ext);
        }

        return afr.read(f);
    }

    /**
     * Removes an listener for all file formats.
     *
     * @param listener listener
     */
    public void removeAudioFileModificationListener(
            AudioFileModificationListener listener)
    {
        this.modificationHandler.removeAudioFileModificationListener(listener);
    }

    /**
     * <p/>
     * Write the tag contained in the audiofile in the actual file on the disk.
     * </p>
     *
     * @param f The AudioFile to be written
     * @throws CannotWriteException If the file could not be written/accessed, the extension
     *                              wasn't recognized, or other IO error occured.
     */
    public void writeFile(AudioFile f) throws CannotWriteException
    {
        String ext = Utils.getExtension(f.getFile());

        AudioFileWriter afw = writers.get(ext);
        if (afw == null)
        {
            throw new CannotWriteException(
                    "No Writer associated to this extension: " + ext);
        }

        afw.write(f);
    }
}
