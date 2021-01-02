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

public class Time {
    public int hrs,min,sec;

    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHrs() {
        return hrs;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Time(int h, int m, int s){
        hrs = h;
        min = m;
        sec = s;
    }
    public Time(int h , int m) {
        hrs = h;
        min = m;
        sec = 00;
    }
}
