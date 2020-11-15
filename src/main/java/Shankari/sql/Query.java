/*
 *     Shankari Vedic Astrology Software
 *     Copyright (C) 2020  Arun S Jois
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

package Shankari.sql;


import Shankari.core.Const;
import javafx.beans.Observable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.StringJoiner;
import java.util.List;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class  Query {
    public static ObservableList<String> placeList = FXCollections.observableArrayList();
    public static ObservableList<String> str;
    //public static void main(String args[]) {
    //    Connection c = null;
    //    Statement stmt = null;
    //    //Demo d = new Demo();
    //    try {
    //        Class.forName("org.sqlite.JDBC");
    //        c = DriverManager.getConnection("jdbc:sqlite:"+ Const.GEONAMES);
    //        //Demo d = new Demo();
    //    }
    //    catch ( Exception e ) {
    //        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
    //        System.exit(0);
    //    }
    //}

    public static ObservableList<String> getCountryList()
    {
        ResultSet set;
        Connection c = null;
        Statement stmt = null;
        ObservableList<String> ar = FXCollections.observableArrayList();
        StringJoiner sj = new StringJoiner(",");
        int i=0;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:geonames1000.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(
                    //"SELECT name FROM geonames where country_code = \""+ query + "\" " );
                    "SELECT DISTINCT name from countries");

            while(rs.next()) {
                //ret[i] = rs.getString("name");
                ar.add(rs.getString("name"));
                //System.out.println(rs.getString("name"));
                i++;

            }


        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        str = FXCollections.observableList(ar.sorted());
        return str;

    }
    /*public static ObservableList getList(String something)
    {

    }*/
    public static ObservableList getPlace(String Country)
    {
        ResultSet set;
        Connection c = null;
        Statement stmt = null;
        ObservableList<String> ar = FXCollections.observableArrayList();
        String tmp="Hassan";
        /*
         * Get the ISO text to query geonames
         */
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:" + Const.GEONAMES);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT iso FROM countries where name=\""+Country+"\"");
            tmp=rs.getString("iso");
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }


        int i=0;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:" + Const.GEONAMES);
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name FROM geonames where country_code=\""+tmp+"\"");

            while(rs.next()) {
                ar.add(rs.getString("name"));
                i++;

            }
            System.out.println(ar);

        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        str = FXCollections.observableList(ar.sorted());
        return  str;

    }
}
