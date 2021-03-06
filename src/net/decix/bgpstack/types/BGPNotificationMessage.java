/**
 * Hoofprints - An Extensible Testbed for Route-Servers
 * Copyright (C) 2009 Sebastian Spies
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 */

package net.decix.bgpstack.types;

import net.decix.bgpstack.BGPConstants;
import net.decix.bgpstack.util.UtilityException;

/**
 * Represents a BGP Notification message see <a
 * href="http://tools.ietf.org/html/rfc4271">RFC4271</a>
 * 
 * @author sspies
 * 
 */
public class BGPNotificationMessage extends BGPMessage implements BGPConstants
{
	/**
	 * Instantiates a new {@link BGPNotificationMessage} object
	 */
	public BGPNotificationMessage()
	{
		setHeader(new BGPMessageHeader(MARKER, 19, BGP_MESSAGE_TYPE_NOTIFICATION));
	}

	/**
	 * Parses a new BGP Notification message from raw byte-data as defined in RFC4271
	 * @param rawData the raw data as an array of bytes
	 * @return a new {@link BGPNotificationMessage} object that represents the information
	 *         from the BGP message
	 * @throws UtilityException if the raw data is not well-formed
	 */
	public static BGPNotificationMessage parse(byte[] rawData) throws UtilityException
	{
		return new BGPNotificationMessage();
	}

	/**
	 * TODO implement
	 */
	@Override
	public byte[] toBytesTemplate() throws UtilityException
	{
		return new byte[] {};
	}

	/**
	 * TODO implement
	 */
	public int getByteLength()
	{
		return 0;
	}

}
