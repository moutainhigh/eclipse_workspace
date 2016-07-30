/**
 *  @author : Paul Taylor
 *  @author : Eric Farng
 *
 *  Version @version:$Id: ByteArraySizeTerminated.java,v 1.6 2007/08/07 14:36:14 paultaylor Exp $
 *
 *  MusicTag Copyright (C)2003,2004
 *
 *  This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser
 *  General Public  License as published by the Free Software Foundation; either version 2.1 of the License,
 *  or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 *  the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License along with this library; if not,
 *  you can get a copy from http://www.opensource.org/licenses/lgpl-license.php or write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Description:
 *
 */
package com.hadeslee.audiotag.tag.datatype;

import com.hadeslee.audiotag.tag.id3.AbstractTagFrameBody;
import com.hadeslee.audiotag.tag.InvalidDataTypeException;

/** Represents a stream of bytes, continuing until the end of the buffer. Usually used for binary data or where
 *  we havent yet mapped the data to a better fitting type.
 */
public class ByteArraySizeTerminated extends AbstractDataType
{
    public ByteArraySizeTerminated(String identifier, AbstractTagFrameBody frameBody)
    {
        super(identifier, frameBody);
    }

    public ByteArraySizeTerminated(ByteArraySizeTerminated object)
    {
        super(object);
    }

    /**
     * Return the size in byte of this datatype
     *
     * @return the size in bytes
     */
    public int getSize()
    {
        int len = 0;

        if (value != null)
        {
            len = ((byte[]) value).length;
        }

        return len;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ByteArraySizeTerminated == false)
        {
            return false;
        }

        return super.equals(obj);
    }

    /**
     * 
     *
     * @param arr    
     * @param offset 
     * @throws NullPointerException      
     * @throws IndexOutOfBoundsException 
     */
    public void readByteArray(byte[] arr, int offset) throws InvalidDataTypeException
    {
        if (arr == null)
        {
            throw new NullPointerException("Byte array is null");
        }

        if (offset < 0)
        {
            throw new IndexOutOfBoundsException("Offset to byte array is out of bounds: offset = " + offset + ", array.length = " + arr.length);
        }

        //Empty Byte Array
        if (offset >= arr.length)
        {
            value = null;
            return;
        }

        int len = arr.length - offset;
        value = new byte[len];
        System.arraycopy(arr, offset, value, 0, len);
    }

    /**
     * Because this is usually binary data and could be very long we just return
     * the number of bytes held
     *
     * @return  the number of bytes
     */
    public String toString()
    {
        return getSize() + " bytes";
    }

    /**
     * Write contents to a byte array
     *
     * @return a byte array that that contians the data that should be perisisted to file
     */
    public byte[] writeByteArray()
    {
        logger.info("Writing byte array" + this.getIdentifier());
        return (byte[]) value;
    }
}
