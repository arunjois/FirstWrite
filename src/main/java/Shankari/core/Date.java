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

package Shankari.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    int day,mon,year;



    public void setDay(int day) {
        this.day = day;
    }

    public void setMon(int mon) {
        this.mon = mon;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMon() {
        return mon;
    }

    public int getYear() {
        return year;
    }


    public Date(int d, int m, int y){
        day = d;
        mon = m;
        year = y;
    }
    
    static String toHMS(double d) {
		d += 0.5 / 3600.; // round to one second
		int h = (int) d;
		d = (d - h) * 60;
		int min = (int) d;
		int sec = (int) ((d - min) * 60);
		return String.format("%2d:%02d:%02d", h, min, sec);
	}
    static String toDMS(double d) {
        d += 0.5 / 3600. / 10000.; // round to 1/1000 of a second
        int deg = (int) d;
        d = (d - deg) * 60;
        int min = (int) d;
        d = (d - min) * 60;
        double sec = d;
        return String.format("%3d°%02d'%07.4f\"", deg, min, sec);
    }
    public static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
