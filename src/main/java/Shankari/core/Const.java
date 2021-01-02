/**
 *     Shankari Vedic Astrology Software
 *     Copyright (C) 2021  Arun S Jois
 *
 *     This program is free software; you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation; either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License along
 *     with this program; if not, write to the Free Software Foundation, Inc.,
 *     51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package Shankari.core;

import java.io.File;

public class Const {
    public static final String HOME = System.getProperty("user.home");
    public static final String DIR = HOME + File.separator + ".shankari";
    public static final String EPHE_DIR = DIR + File.separator + "ephe" + File.separator;
    public static final String GEONAMES = DIR + File.separator + "geonames1000.db" ;
    public static final String PLACE = "HASSAN";
    public static final double LONGITUDE = 76.0962;
    public static final double LATITUDE = 13.00715;
}
