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
import Shankari.swisseph.SweConst;
import Shankari.swisseph.SweDate;
import Shankari.swisseph.SwissData;
import Shankari.swisseph.SwissEph;

import java.util.HashMap;



public class Horoscope {
    public enum Planets {
        SUN,
        MOON,
        MERCURY,
        VENUS,
        MARS,
        JUPITER,
        SATURN
    }
    Person person;
    HashMap<String, Double> basic = new HashMap<String, Double>();
    Dasa dasa;
    public Horoscope(Person p) {
        person = p;
    }
    public void calcBasic() {
        SwissEph swe = new SwissEph();
        SweDate sweDate = new SweDate(person.dob.getYear(), person.dob.getMon(), person.dob.getDay(), person.getTime()) ;
        double[] cusps = new double[13];
        double[] acsc = new double[10];
        double[] xp = new double[6];
        StringBuffer serr = new StringBuffer();
        double ayanamsa = swe.swe_get_ayanamsa_ut(sweDate.getJulDay());
        int flags = SweConst.SEFLG_SIDEREAL;
        int result = swe.swe_houses(sweDate.getJulDay(), flags, person.getLatitude(), person.getLatitude(), 'P', cusps, acsc);
        int[] planets = { SweConst.SE_SUN, SweConst.SE_MOON, SweConst.SE_MARS, SweConst.SE_MERCURY, SweConst.SE_JUPITER,
                SweConst.SE_VENUS, SweConst.SE_SATURN, SweConst.SE_TRUE_NODE }; // Some
        // systems
        // prefer
        // SE_MEAN_NODE

        flags = SweConst.SEFLG_SWIEPH | // fastest method, requires data files
                SweConst.SEFLG_SIDEREAL | // sidereal zodiac
                SweConst.SEFLG_NONUT | // will b e set automatically for sidereal
                // calculations, if not set here
                SweConst.SEFLG_SPEED; // to determine retrograde vs. direct
        // motion
        int sign;
        int house;
        boolean retrograde = false;

    }
    public void calcChart() {

    }
    public void calcDasa() {

    }





}
