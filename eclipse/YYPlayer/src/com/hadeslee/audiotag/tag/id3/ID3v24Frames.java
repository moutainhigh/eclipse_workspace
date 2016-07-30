/*
 * Jaudiotagger Copyright (C)2004,2005
 *
 * This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public  License as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this library; if not,
 * you can get a copy from http://www.opensource.org/licenses/lgpl-license.php or write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package com.hadeslee.audiotag.tag.id3;

import com.hadeslee.audiotag.tag.TagFieldKey;

import java.util.EnumMap;

/**
 * Defines ID3v24 frames and collections that categorise frames.
 *
 * <p>You can include frames here that are not officially supported as long as they can be used within an
 * ID3v24Tag
 * 
 * @author Paul Taylor
 * @version $Id: ID3v24Frames.java,v 1.12 2007/11/13 14:24:31 paultaylor Exp $
 */
public class ID3v24Frames extends ID3Frames
{
    /**
     * Frame IDs begining with T are text frames, & with W are url frames
     */
    public static final String FRAME_ID_ACCOMPANIMENT = "TPE2";
    public static final String FRAME_ID_ALBUM = "TALB";
    public static final String FRAME_ID_ALBUM_SORT_ORDER = "TSOA";
    public static final String FRAME_ID_ARTIST = "TPE1";
    public static final String FRAME_ID_ATTACHED_PICTURE = "APIC";
    public static final String FRAME_ID_AUDIO_ENCRYPTION = "AENC";
    public static final String FRAME_ID_AUDIO_SEEK_POINT_INDEX = "ASPI";
    public static final String FRAME_ID_BPM = "TBPM";
    public static final String FRAME_ID_COMMENT = "COMM";
    public static final String FRAME_ID_COMMERCIAL_FRAME = "COMR";
    public static final String FRAME_ID_COMPOSER = "TCOM";
    public static final String FRAME_ID_CONDUCTOR = "TPE3";
    public static final String FRAME_ID_CONTENT_GROUP_DESC = "TIT1";
    public static final String FRAME_ID_COPYRIGHTINFO = "TCOP";
    public static final String FRAME_ID_ENCODEDBY = "TENC";
    public static final String FRAME_ID_ENCODING_TIME = "TDEN";
    public static final String FRAME_ID_ENCRYPTION = "ENCR";
    public static final String FRAME_ID_EQUALISATION2 = "EQU2";
    public static final String FRAME_ID_EVENT_TIMING_CODES = "ETCO";
    public static final String FRAME_ID_FILE_OWNER = "TOWN";
    public static final String FRAME_ID_FILE_TYPE = "TFLT";
    public static final String FRAME_ID_GENERAL_ENCAPS_OBJECT = "GEOB";
    public static final String FRAME_ID_GENRE = "TCON";
    public static final String FRAME_ID_GROUP_ID_REG = "GRID";
    public static final String FRAME_ID_HW_SW_SETTINGS = "TSSE";
    public static final String FRAME_ID_INITIAL_KEY = "TKEY";
    public static final String FRAME_ID_INVOLVED_PEOPLE = "TIPL";
    public static final String FRAME_ID_ISRC = "TSRC";
    public static final String FRAME_ID_LANGUAGE = "TLAN";
    public static final String FRAME_ID_LENGTH = "TLEN";
    public static final String FRAME_ID_LINKED_INFO = "LINK";
    public static final String FRAME_ID_LYRICIST = "TEXT";
    public static final String FRAME_ID_MEDIA_TYPE = "TMED";
    public static final String FRAME_ID_MOOD = "TMOO";
    public static final String FRAME_ID_MPEG_LOCATION_LOOKUP_TABLE = "MLLT";
    public static final String FRAME_ID_MUSICIAN_CREDITS = "TMCL";
    public static final String FRAME_ID_MUSIC_CD_ID = "MCDI";
    public static final String FRAME_ID_ORIGARTIST = "TOPE";
    public static final String FRAME_ID_ORIGINAL_RELEASE_TIME = "TDOR";
    public static final String FRAME_ID_ORIG_FILENAME = "TOFN";
    public static final String FRAME_ID_ORIG_LYRICIST = "TOLY";
    public static final String FRAME_ID_ORIG_TITLE = "TOAL";
    public static final String FRAME_ID_OWNERSHIP = "OWNE";
    public static final String FRAME_ID_ARTIST_SORT_ORDER = "TSOP";
    public static final String FRAME_ID_PLAYLIST_DELAY = "TDLY";
    public static final String FRAME_ID_PLAY_COUNTER = "PCNT";
    public static final String FRAME_ID_POPULARIMETER = "POPM";
    public static final String FRAME_ID_POSITION_SYNC = "POSS";
    public static final String FRAME_ID_PRIVATE = "PRIV";
    public static final String FRAME_ID_PRODUCED_NOTICE = "TPRO";
    public static final String FRAME_ID_PUBLISHER = "TPUB";
    public static final String FRAME_ID_RADIO_NAME = "TRSN";
    public static final String FRAME_ID_RADIO_OWNER = "TRSO";
    public static final String FRAME_ID_RECOMMENDED_BUFFER_SIZE = "RBUF";
    public static final String FRAME_ID_RELATIVE_VOLUME_ADJUSTMENT2 = "RVA2";
    public static final String FRAME_ID_RELEASE_TIME = "TDRL";
    public static final String FRAME_ID_REMIXED = "TPE4";
    public static final String FRAME_ID_REVERB = "RVRB";
    public static final String FRAME_ID_SEEK = "SEEK";
    public static final String FRAME_ID_SET = "TPOS";
    public static final String FRAME_ID_SET_SUBTITLE = "TSST";
    public static final String FRAME_ID_SIGNATURE = "SIGN";
    public static final String FRAME_ID_SYNC_LYRIC = "SYLT";
    public static final String FRAME_ID_SYNC_TEMPO = "SYTC";
    public static final String FRAME_ID_TAGGING_TIME = "TDTG";
    public static final String FRAME_ID_TERMS_OF_USE = "USER";
    public static final String FRAME_ID_TITLE = "TIT2";
    public static final String FRAME_ID_TITLE_REFINEMENT = "TIT3";
    public static final String FRAME_ID_TITLE_SORT_ORDER = "TSOT";
    public static final String FRAME_ID_TRACK = "TRCK";
    public static final String FRAME_ID_UNIQUE_FILE_ID = "UFID";
    public static final String FRAME_ID_UNSYNC_LYRICS = "USLT";
    public static final String FRAME_ID_URL_ARTIST_WEB = "WOAR";
    public static final String FRAME_ID_URL_COMMERCIAL = "WCOM";
    public static final String FRAME_ID_URL_COPYRIGHT = "WCOP";
    public static final String FRAME_ID_URL_FILE_WEB = "WOAF";
    public static final String FRAME_ID_URL_OFFICIAL_RADIO = "WORS";
    public static final String FRAME_ID_URL_PAYMENT = "WPAY";
    public static final String FRAME_ID_URL_PUBLISHERS = "WPUB";
    public static final String FRAME_ID_URL_SOURCE_WEB = "WOAS";
    public static final String FRAME_ID_USER_DEFINED_INFO = "TXXX";
    public static final String FRAME_ID_USER_DEFINED_URL = "WXXX";
    public static final String FRAME_ID_YEAR = "TDRC";

    public static final String FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES = "TSO2";
    public static final String FRAME_ID_COMPOSER_SORT_ORDER_ITUNES = "TSOC";
    public static final String FRAME_ID_IS_COMPILATION = "TCMP";

    //TODO this is temporary to provide backwards comptability
    public static final String FRAME_ID_PERFORMER_SORT_OWNER =  FRAME_ID_ARTIST_SORT_ORDER;
    public static final String FRAME_ID_TITLE_SORT_OWNER = FRAME_ID_TITLE_SORT_ORDER;

    protected EnumMap<TagFieldKey, ID3v24FieldKey> tagFieldToId3 = new EnumMap<TagFieldKey,ID3v24FieldKey>(TagFieldKey.class);

    private static ID3v24Frames id3v24Frames;

    public static ID3v24Frames getInstanceOf()
    {
        if (id3v24Frames == null)
        {
            id3v24Frames = new ID3v24Frames();
        }
        return id3v24Frames;
    }

    private ID3v24Frames()
    {
        supportedFrames.add(FRAME_ID_ACCOMPANIMENT);
        supportedFrames.add(FRAME_ID_ALBUM);
        supportedFrames.add(FRAME_ID_ALBUM_SORT_ORDER);
        supportedFrames.add(FRAME_ID_ARTIST);
        supportedFrames.add(FRAME_ID_ATTACHED_PICTURE);
        supportedFrames.add(FRAME_ID_AUDIO_ENCRYPTION);
        supportedFrames.add(FRAME_ID_AUDIO_SEEK_POINT_INDEX);
        supportedFrames.add(FRAME_ID_BPM);
        supportedFrames.add(FRAME_ID_COMMENT);
        supportedFrames.add(FRAME_ID_COMMERCIAL_FRAME);
        supportedFrames.add(FRAME_ID_COMPOSER);
        supportedFrames.add(FRAME_ID_CONDUCTOR);
        supportedFrames.add(FRAME_ID_CONTENT_GROUP_DESC);
        supportedFrames.add(FRAME_ID_COPYRIGHTINFO);
        supportedFrames.add(FRAME_ID_ENCODEDBY);
        supportedFrames.add(FRAME_ID_ENCODING_TIME);
        supportedFrames.add(FRAME_ID_ENCRYPTION);
        supportedFrames.add(FRAME_ID_EQUALISATION2);
        supportedFrames.add(FRAME_ID_EVENT_TIMING_CODES);
        supportedFrames.add(FRAME_ID_FILE_OWNER);
        supportedFrames.add(FRAME_ID_FILE_TYPE);
        supportedFrames.add(FRAME_ID_GENERAL_ENCAPS_OBJECT);
        supportedFrames.add(FRAME_ID_GENRE);
        supportedFrames.add(FRAME_ID_GROUP_ID_REG);
        supportedFrames.add(FRAME_ID_HW_SW_SETTINGS);
        supportedFrames.add(FRAME_ID_INITIAL_KEY);
        supportedFrames.add(FRAME_ID_INVOLVED_PEOPLE);
        supportedFrames.add(FRAME_ID_ISRC);
        supportedFrames.add(FRAME_ID_LANGUAGE);
        supportedFrames.add(FRAME_ID_LENGTH);
        supportedFrames.add(FRAME_ID_LINKED_INFO);
        supportedFrames.add(FRAME_ID_LYRICIST);
        supportedFrames.add(FRAME_ID_MEDIA_TYPE);
        supportedFrames.add(FRAME_ID_MOOD);
        supportedFrames.add(FRAME_ID_MPEG_LOCATION_LOOKUP_TABLE);
        supportedFrames.add(FRAME_ID_MUSIC_CD_ID);
        supportedFrames.add(FRAME_ID_ORIGARTIST);
        supportedFrames.add(FRAME_ID_ORIGINAL_RELEASE_TIME);
        supportedFrames.add(FRAME_ID_ORIG_FILENAME);
        supportedFrames.add(FRAME_ID_ORIG_LYRICIST);
        supportedFrames.add(FRAME_ID_ORIG_TITLE);
        supportedFrames.add(FRAME_ID_OWNERSHIP);
        supportedFrames.add(FRAME_ID_ARTIST_SORT_ORDER);
        supportedFrames.add(FRAME_ID_PLAYLIST_DELAY);
        supportedFrames.add(FRAME_ID_PLAY_COUNTER);
        supportedFrames.add(FRAME_ID_POPULARIMETER);
        supportedFrames.add(FRAME_ID_POSITION_SYNC);
        supportedFrames.add(FRAME_ID_PRIVATE);
        supportedFrames.add(FRAME_ID_PRODUCED_NOTICE);
        supportedFrames.add(FRAME_ID_PUBLISHER);
        supportedFrames.add(FRAME_ID_RADIO_NAME);
        supportedFrames.add(FRAME_ID_RADIO_OWNER);
        supportedFrames.add(FRAME_ID_RECOMMENDED_BUFFER_SIZE);
        supportedFrames.add(FRAME_ID_RELATIVE_VOLUME_ADJUSTMENT2);
        supportedFrames.add(FRAME_ID_RELEASE_TIME);
        supportedFrames.add(FRAME_ID_REMIXED);
        supportedFrames.add(FRAME_ID_REVERB);
        supportedFrames.add(FRAME_ID_SEEK);
        supportedFrames.add(FRAME_ID_SET);
        supportedFrames.add(FRAME_ID_SET_SUBTITLE);
        supportedFrames.add(FRAME_ID_SIGNATURE);
        supportedFrames.add(FRAME_ID_SYNC_LYRIC);
        supportedFrames.add(FRAME_ID_SYNC_TEMPO);
        supportedFrames.add(FRAME_ID_TAGGING_TIME);
        supportedFrames.add(FRAME_ID_TERMS_OF_USE);
        supportedFrames.add(FRAME_ID_TITLE);
        supportedFrames.add(FRAME_ID_TITLE_REFINEMENT);
        supportedFrames.add(FRAME_ID_TITLE_SORT_ORDER);
        supportedFrames.add(FRAME_ID_TRACK);
        supportedFrames.add(FRAME_ID_UNIQUE_FILE_ID);
        supportedFrames.add(FRAME_ID_UNSYNC_LYRICS);
        supportedFrames.add(FRAME_ID_URL_ARTIST_WEB);
        supportedFrames.add(FRAME_ID_URL_COMMERCIAL);
        supportedFrames.add(FRAME_ID_URL_COPYRIGHT);
        supportedFrames.add(FRAME_ID_URL_FILE_WEB);
        supportedFrames.add(FRAME_ID_URL_OFFICIAL_RADIO);
        supportedFrames.add(FRAME_ID_URL_PAYMENT);
        supportedFrames.add(FRAME_ID_URL_PUBLISHERS);
        supportedFrames.add(FRAME_ID_URL_SOURCE_WEB);
        supportedFrames.add(FRAME_ID_USER_DEFINED_INFO);
        supportedFrames.add(FRAME_ID_USER_DEFINED_URL);
        supportedFrames.add(FRAME_ID_YEAR);

        //Extension
        extensionFrames.add(FRAME_ID_IS_COMPILATION);
        extensionFrames.add(FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES);
        extensionFrames.add(FRAME_ID_COMPOSER_SORT_ORDER_ITUNES);

        //Common
        commonFrames.add(FRAME_ID_ARTIST);
        commonFrames.add(FRAME_ID_ALBUM);
        commonFrames.add(FRAME_ID_TITLE);
        commonFrames.add(FRAME_ID_GENRE);
        commonFrames.add(FRAME_ID_TRACK);
        commonFrames.add(FRAME_ID_YEAR);
        commonFrames.add(FRAME_ID_COMMENT);

        //Binary
        binaryFrames.add(FRAME_ID_ATTACHED_PICTURE);
        binaryFrames.add(FRAME_ID_AUDIO_ENCRYPTION);
        binaryFrames.add(FRAME_ID_ENCRYPTION);
        binaryFrames.add(FRAME_ID_EQUALISATION2);
        binaryFrames.add(FRAME_ID_EVENT_TIMING_CODES);
        binaryFrames.add(FRAME_ID_GENERAL_ENCAPS_OBJECT);
        binaryFrames.add(FRAME_ID_RELATIVE_VOLUME_ADJUSTMENT2);
        binaryFrames.add(FRAME_ID_RECOMMENDED_BUFFER_SIZE);
        binaryFrames.add(FRAME_ID_UNIQUE_FILE_ID);
        // Map frameid to a name
        idToValue.put(FRAME_ID_ACCOMPANIMENT, "Text: Band/Orchestra/Accompaniment");
        idToValue.put(FRAME_ID_ALBUM, "Text: Album/Movie/Show title");
        idToValue.put(FRAME_ID_ALBUM_SORT_ORDER, "Album sort order");
        idToValue.put(FRAME_ID_ARTIST, "Text: Lead artist(s)/Lead performer(s)/Soloist(s)/Performing group");
        idToValue.put(FRAME_ID_ATTACHED_PICTURE, "Attached picture");
        idToValue.put(FRAME_ID_AUDIO_ENCRYPTION, "Audio encryption");
        idToValue.put(FRAME_ID_AUDIO_SEEK_POINT_INDEX, "Audio seek point index");
        idToValue.put(FRAME_ID_BPM, "Text: BPM (Beats Per Minute)");
        idToValue.put(FRAME_ID_COMMENT, "Comments");
        idToValue.put(FRAME_ID_COMMERCIAL_FRAME, "Commercial Frame");
        idToValue.put(FRAME_ID_COMPOSER, "Text: Composer");
        idToValue.put(FRAME_ID_CONDUCTOR, "Text: Conductor/Performer refinement");
        idToValue.put(FRAME_ID_CONTENT_GROUP_DESC, "Text: Content group description");
        idToValue.put(FRAME_ID_COPYRIGHTINFO, "Text: Copyright message");
        idToValue.put(FRAME_ID_ENCODEDBY, "Text: Encoded by");
        idToValue.put(FRAME_ID_ENCODING_TIME, "Text: Encoding time");
        idToValue.put(FRAME_ID_ENCRYPTION, "Encryption method registration");
        idToValue.put(FRAME_ID_EQUALISATION2, "Equalization (2)");
        idToValue.put(FRAME_ID_EVENT_TIMING_CODES, "Event timing codes");
        idToValue.put(FRAME_ID_FILE_OWNER, "Text:File Owner");
        idToValue.put(FRAME_ID_FILE_TYPE, "Text: File type");
        idToValue.put(FRAME_ID_GENERAL_ENCAPS_OBJECT, "General encapsulated datatype");
        idToValue.put(FRAME_ID_GENRE, "Text: Content type");
        idToValue.put(FRAME_ID_GROUP_ID_REG,"Group ID Registration");
        idToValue.put(FRAME_ID_HW_SW_SETTINGS, "Text: Software/hardware and settings used for encoding");
        idToValue.put(FRAME_ID_INITIAL_KEY, "Text: Initial key");
        idToValue.put(FRAME_ID_INVOLVED_PEOPLE, "Involved people list");
        idToValue.put(FRAME_ID_ISRC, "Text: ISRC (International Standard Recording Code)");
        idToValue.put(FRAME_ID_LANGUAGE, "Text: Language(s)");
        idToValue.put(FRAME_ID_LENGTH, "Text: Length");
        idToValue.put(FRAME_ID_LINKED_INFO, "Linked information");
        idToValue.put(FRAME_ID_LYRICIST, "Text: Lyricist/text writer");
        idToValue.put(FRAME_ID_MEDIA_TYPE, "Text: Media type");
        idToValue.put(FRAME_ID_MOOD, "Text: Mood");
        idToValue.put(FRAME_ID_MPEG_LOCATION_LOOKUP_TABLE, "MPEG location lookup table");
        idToValue.put(FRAME_ID_MUSIC_CD_ID, "Music CD Identifier");
        idToValue.put(FRAME_ID_ORIGARTIST, "Text: Original artist(s)/performer(s)");
        idToValue.put(FRAME_ID_ORIGINAL_RELEASE_TIME, "Text: Original release time");
        idToValue.put(FRAME_ID_ORIG_FILENAME, "Text: Original filename");
        idToValue.put(FRAME_ID_ORIG_LYRICIST, "Text: Original Lyricist(s)/text writer(s)");
        idToValue.put(FRAME_ID_ORIG_TITLE, "Text: Original album/Movie/Show title");
        idToValue.put(FRAME_ID_OWNERSHIP, "Ownership");
        idToValue.put(FRAME_ID_ARTIST_SORT_ORDER, "Performance Sort Order");
        idToValue.put(FRAME_ID_PLAYLIST_DELAY, "Text: Playlist delay");
        idToValue.put(FRAME_ID_PLAY_COUNTER, "Play counter");
        idToValue.put(FRAME_ID_POPULARIMETER, "Popularimeter");
        idToValue.put(FRAME_ID_POSITION_SYNC, "Position Sync");
        idToValue.put(FRAME_ID_PRIVATE,"Private frame");
        idToValue.put(FRAME_ID_PRODUCED_NOTICE,"Produced Notice");
        idToValue.put(FRAME_ID_PUBLISHER, "Text: Publisher");
        idToValue.put(FRAME_ID_RADIO_NAME, "Text: Radio Name");
        idToValue.put(FRAME_ID_RADIO_OWNER, "Text: Radio Owner");
        idToValue.put(FRAME_ID_RECOMMENDED_BUFFER_SIZE, "Recommended buffer size");
        idToValue.put(FRAME_ID_RELATIVE_VOLUME_ADJUSTMENT2, "Relative volume adjustment(2)");
        idToValue.put(FRAME_ID_RELEASE_TIME, "Release Time");
        idToValue.put(FRAME_ID_REMIXED, "Text: Interpreted, remixed, or otherwise modified by");
        idToValue.put(FRAME_ID_REVERB, "Reverb");
        idToValue.put(FRAME_ID_SEEK, "Seek");
        idToValue.put(FRAME_ID_SET, "Text: Part of a set");
        idToValue.put(FRAME_ID_SET_SUBTITLE, "Text: Set subtitle");
        idToValue.put(FRAME_ID_SIGNATURE, "Signature");
        idToValue.put(FRAME_ID_SYNC_LYRIC, "Synchronized lyric/text");
        idToValue.put(FRAME_ID_SYNC_TEMPO, "Synced tempo codes");
        idToValue.put(FRAME_ID_TAGGING_TIME, "Text: Tagaging time");
        idToValue.put(FRAME_ID_TERMS_OF_USE, "Terms of Use");
        idToValue.put(FRAME_ID_TITLE, "Text: title");
        idToValue.put(FRAME_ID_TITLE_REFINEMENT, "Text: Subtitle/Description refinement");
        idToValue.put(FRAME_ID_TITLE_SORT_ORDER, "Text: title sort order");
        idToValue.put(FRAME_ID_TRACK, "Text: Track number/Position in set");
        idToValue.put(FRAME_ID_UNIQUE_FILE_ID, "Unique file identifier");
        idToValue.put(FRAME_ID_UNSYNC_LYRICS, "Unsychronized lyric/text transcription");
        idToValue.put(FRAME_ID_URL_ARTIST_WEB, "URL: Official artist/performer webpage");
        idToValue.put(FRAME_ID_URL_COMMERCIAL, "URL: Commercial information");
        idToValue.put(FRAME_ID_URL_COPYRIGHT, "URL: Copyright/Legal information");
        idToValue.put(FRAME_ID_URL_FILE_WEB, "URL: Official audio file webpage");
        idToValue.put(FRAME_ID_URL_OFFICIAL_RADIO,"URL: Official Radio website");
        idToValue.put(FRAME_ID_URL_PAYMENT,"URL: Payment for this recording ");
        idToValue.put(FRAME_ID_URL_PUBLISHERS, "URL: Publishers official webpage");
        idToValue.put(FRAME_ID_URL_SOURCE_WEB, "URL: Official audio source webpage");
        idToValue.put(FRAME_ID_USER_DEFINED_INFO, "User defined text information frame");
        idToValue.put(FRAME_ID_USER_DEFINED_URL, "User defined URL link frame");
        idToValue.put(FRAME_ID_YEAR, "Text:Year");
        idToValue.put(FRAME_ID_IS_COMPILATION,"Is Compilation");
        idToValue.put(FRAME_ID_ALBUM_ARTIST_SORT_ORDER_ITUNES,"Text:Album Artist Sort Order Frame");
        idToValue.put(FRAME_ID_COMPOSER_SORT_ORDER_ITUNES,"Text:Composer Sort Order Frame");


        createMaps();

        multipleFrames.add(FRAME_ID_USER_DEFINED_INFO);
        multipleFrames.add(FRAME_ID_USER_DEFINED_URL);
        multipleFrames.add(FRAME_ID_ATTACHED_PICTURE);
        multipleFrames.add(FRAME_ID_PRIVATE);
        multipleFrames.add(FRAME_ID_COMMENT);
        multipleFrames.add(FRAME_ID_UNIQUE_FILE_ID);
        multipleFrames.add(FRAME_ID_UNSYNC_LYRICS);
        multipleFrames.add(FRAME_ID_POPULARIMETER);

        discardIfFileAlteredFrames.add(FRAME_ID_EVENT_TIMING_CODES);
        discardIfFileAlteredFrames.add(FRAME_ID_MPEG_LOCATION_LOOKUP_TABLE);
        discardIfFileAlteredFrames.add(FRAME_ID_POSITION_SYNC);
        discardIfFileAlteredFrames.add(FRAME_ID_SYNC_LYRIC);
        discardIfFileAlteredFrames.add(FRAME_ID_SYNC_TEMPO);
        discardIfFileAlteredFrames.add(FRAME_ID_EVENT_TIMING_CODES);
        discardIfFileAlteredFrames.add(FRAME_ID_ENCODEDBY);
        discardIfFileAlteredFrames.add(FRAME_ID_LENGTH);

        tagFieldToId3.put(TagFieldKey.ARTIST,ID3v24FieldKey.ARTIST);
        tagFieldToId3.put(TagFieldKey.ALBUM,ID3v24FieldKey.ALBUM);
        tagFieldToId3.put(TagFieldKey.TITLE,ID3v24FieldKey.TITLE);
        tagFieldToId3.put(TagFieldKey.TRACK,ID3v24FieldKey.TRACK);
        tagFieldToId3.put(TagFieldKey.YEAR,ID3v24FieldKey.YEAR);
        tagFieldToId3.put(TagFieldKey.GENRE,ID3v24FieldKey.GENRE);
        tagFieldToId3.put(TagFieldKey.COMMENT,ID3v24FieldKey.COMMENT);
        tagFieldToId3.put(TagFieldKey.ALBUM_ARTIST,ID3v24FieldKey.ALBUM_ARTIST);
        tagFieldToId3.put(TagFieldKey.COMPOSER,ID3v24FieldKey.COMPOSER);
        tagFieldToId3.put(TagFieldKey.GROUPING,ID3v24FieldKey.GROUPING);
        tagFieldToId3.put(TagFieldKey.DISC_NO,ID3v24FieldKey.DISC_NO);
        tagFieldToId3.put(TagFieldKey.BPM,ID3v24FieldKey.BPM);
        tagFieldToId3.put(TagFieldKey.ENCODER,ID3v24FieldKey.ENCODER);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_ARTISTID,ID3v24FieldKey.MUSICBRAINZ_ARTISTID);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_RELEASEID,ID3v24FieldKey.MUSICBRAINZ_RELEASEID);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_RELEASEARTISTID,ID3v24FieldKey.MUSICBRAINZ_RELEASEARTISTID);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_TRACK_ID,ID3v24FieldKey.MUSICBRAINZ_TRACK_ID);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_DISC_ID,ID3v24FieldKey.MUSICBRAINZ_DISC_ID);
        tagFieldToId3.put(TagFieldKey.MUSICIP_ID,ID3v24FieldKey.MUSICIP_ID);
        tagFieldToId3.put(TagFieldKey.AMAZON_ID,ID3v24FieldKey.AMAZON_ID);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_RELEASE_STATUS,ID3v24FieldKey.MUSICBRAINZ_RELEASE_STATUS);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_RELEASE_TYPE,ID3v24FieldKey.MUSICBRAINZ_RELEASE_TYPE);
        tagFieldToId3.put(TagFieldKey.MUSICBRAINZ_RELEASE_COUNTRY,ID3v24FieldKey.MUSICBRAINZ_RELEASE_COUNTRY);
        tagFieldToId3.put(TagFieldKey.LYRICS,ID3v24FieldKey.LYRICS);
        tagFieldToId3.put(TagFieldKey.IS_COMPILATION,ID3v24FieldKey.IS_COMPILATION);
        tagFieldToId3.put(TagFieldKey.ARTIST_SORT,ID3v24FieldKey.ARTIST_SORT);
        tagFieldToId3.put(TagFieldKey.ALBUM_ARTIST_SORT,ID3v24FieldKey.ALBUM_ARTIST_SORT);
        tagFieldToId3.put(TagFieldKey.ALBUM_SORT,ID3v24FieldKey.ALBUM_SORT);
        tagFieldToId3.put(TagFieldKey.TITLE_SORT,ID3v24FieldKey.TITLE_SORT);
        tagFieldToId3.put(TagFieldKey.COMPOSER_SORT,ID3v24FieldKey.COMPOSER_SORT);
        tagFieldToId3.put(TagFieldKey.COVER_ART,ID3v24FieldKey.COVER_ART);
    }

    /**
    *
    * @param genericKey
    *
    * @return id3 key for generic key
    */
    public ID3v24FieldKey getId3KeyFromGenericKey(TagFieldKey genericKey)
    {
       return tagFieldToId3.get(genericKey);
    }
}