package Shankari.core;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Preliminary {
    public Paths dir = Path.get(Const.DIR);
    public Paths ephe = Path.get(Const.EPHE_DIR);
    public Paths geonames = Path.get(Const.GEONAMES);
    /*public Preliminary() {
        dir = new Files(Const.DIR);
        ephe = new Files(Const.EPHE_DIR);
        geonames = new Files(Const.GEONAMES);
    }*/
    public void checkDir() {
        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
        }
        if(Files.notExists(ephe)) {
            writeEphe();
        }


    }
    public void writeEverything() {

    }
    public void writeEphe() {

    }

}
