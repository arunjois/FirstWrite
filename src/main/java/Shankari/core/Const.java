package Shankari.core;

public class Const {
    public static String SYS_DIR;
    public static String HOME_DIR;
    public static String EPHE_DIR;
    public static String GEONAMES;
    public static String DB;
    public static String WD = System.getProperty("user.dir");
    public static void setDir() {
        switch (System.getProperty("os.name")) {
            case "Windows 10": case "Windows 7":
                SYS_DIR=System.getProperty("user.home");
                HOME_DIR=SYS_DIR+"\\.Shankari\\";
                EPHE_DIR=HOME_DIR+"ephe\\";
                GEONAMES = HOME_DIR+"geonames1000.sql";
            case "Linux": case "Mac OS X":
                SYS_DIR=System.getProperty("user.home");
                HOME_DIR=SYS_DIR+"//.Shankari//";
                EPHE_DIR=HOME_DIR+"ephe/";
                GEONAMES = HOME_DIR+"geonames1000.sql";
                DB=HOME_DIR+"geonames1000.db";
        }

    }

}
