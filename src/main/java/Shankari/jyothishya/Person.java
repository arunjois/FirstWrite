/*
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
 *
 */

package Shankari.jyothishya;

import Shankari.core.Date;

public class Person {
    /*
    *  Details that will be read from the file
    */
    public String name;
    public Date dob;
    public double time;
    public String place;
    public char gender;
    public double longitude;
    public double latitude;

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public double getTime() {
        return time;
    }

    public String getPlace() {
        return place;
    }

    public char getGender() {
        return gender;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }



    public Person(String name, Date dob, double time, String place, char gender, double longitude, double latitude) {
        this.name = name;
        this.dob = dob;
        this.time = time;
        this.place = place;
        this.gender = gender;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
