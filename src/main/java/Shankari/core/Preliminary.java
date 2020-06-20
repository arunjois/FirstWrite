package Shankari.core;
import java.io.File;
public class Preliminary {
    public void checkDir() {
        File home = new File(Const.HOME_DIR);
        File ephe = new File(Const.EPHE_DIR);
        File geoname = new File(Const.GEONAMES);
       if(home.exists())
           home.mkdir();
       else if(ephe.exists())
           ephe.mkdirs();
       else if(geoname.exists())
           ;//Write the file to the dir.
    }
}
