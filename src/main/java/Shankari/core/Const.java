package Shankari.core;

import java.io.File;

public class Const {
    public static String DIR;
    public static String HOME_DIR;
    public static String EPHE_DIR;
    public static String GEONAMES;
    public static String DB;
    public static String OS;

    public Const() {
        Const.HOME_DIR = System.getProperty("user.home");
        Const.DIR = HOME_DIR + File.separator + ".Shankari" + File.separator;
        Const.EPHE_DIR = DIR + File.separator + "ephe" + File.separator;
        Const.GEONAMES = DIR + File.separator + "geonames1000.sql";
        Const.DB = DIR + File.separator + "geonames.db";
        Const.WD = System.getProperty("user.dir");
        Const.OS = System.getProperty("os.name");
    }



    public static String WD = System.getProperty("user.dir");
    public static void setDir() {
        switch (System.getProperty("os.name")) {
            case "Windows 10": case "Windows 7":
                DIR=System.getProperty("user.home");
                HOME_DIR=DIR+"\\.Shankari\\";
                EPHE_DIR=HOME_DIR+"ephe\\";
                GEONAMES = HOME_DIR+"geonames1000.sql";
            case "Linux": case "Mac OS X":
                DIR=System.getProperty("user.home");
                HOME_DIR=DIR+"//.Shankari//";
                EPHE_DIR=HOME_DIR+"ephe/";
                GEONAMES = HOME_DIR+"geonames1000.sql";
                DB=HOME_DIR+"geonames1000.db";
        }

    }


}
