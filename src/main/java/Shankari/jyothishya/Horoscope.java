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

import Shankari.swisseph.SweConst;
import Shankari.swisseph.SweDate;
import Shankari.swisseph.SwissEph;

import java.util.HashMap;



public class Horoscope {
    Person person;
    HashMap<String, Double> basic = new HashMap<String, Double>();
    Dasa dasa;
    public Horoscope(Person p) {
        person = p;
    }
    public void calcBasic() {
        SwissEph swe = new SwissEph();
        SweDate sweDate = new SweDate(person.dob.getYear(), person.dob.getMon(), person.dob.getDay(), person.getTime());
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
        int ascSign = (int) (acsc[0] / 30) + 1;

        flags = SweConst.SEFLG_SWIEPH | // fastest method, requires data files
                SweConst.SEFLG_SIDEREAL | // sidereal zodiac
                SweConst.SEFLG_NONUT | // will b e set automatically for sidereal
                // calculations, if not set here
                SweConst.SEFLG_SPEED; // to determine retrograde vs. direct
        // motion
        int sign;
        int house;
        boolean retrograde = false;
        for (int p = 0; p < planets.length; p++) {
            int planet = planets[p];
            String planetName = swe.swe_get_planet_name(planet);
            int ret = swe.swe_calc_ut(sweDate.getJulDay(), planet, flags, xp, serr);

            if (ret != flags) {
                if (serr.length() > 0) {
                    System.err.println("Warning: " + serr);
                } else {
                    System.err.println(String.format("Warning, different flags used (0x%x)", ret));
                }
            }
            sign = (int) (xp[0] / 30) + 1;
            house = (sign + 12 - ascSign) % 12 + 1;
            retrograde = (xp[3] < 0);
            basic.put(planetName,xp[0]);
        }
        xp[0] = (xp[0] + 180.0) % 360;
        String planetName = "Ketu (true)";
        basic.put(planetName,xp[0]);


    }
    public void calcChart() {

    }
    public void calcDasa() {

    }





}
