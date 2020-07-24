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
    public Path dir = Paths.get(Const.DIR);
    public Path ephe = Paths.get(Const.EPHE_DIR);
    public Path geonames = Paths.get(Const.GEONAMES);
    /*public Preliminary() {
        dir = new Files(Const.DIR);
        ephe = new Files(Const.EPHE_DIR);
        geonames = new Files(Const.GEONAMES);
    }*/
    public void checkDir() throws IOException {
        if (Files.notExists(dir)) {
            writeEverything();
        }
        if(Files.notExists(ephe)) {
            writeEphe();
        }
        if(Files.notExists(geonames)) {
            writeDatabase();
        }
    }
    public void writeEverything() throws IOException {
        Files.createDirectories(dir);
        writeEphe();
        writeDatabase();

    }
    public void writeEphe() throws IOException {
        Files.createDirectories(ephe);
    }
    public void writeDatabase() throws IOException {
        try{
            Files.copy(Paths.get(System.getProperty("user.dir") + "geonames.db"),
                    Paths.get(Const.GEONAMES), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e){
            System.out.println("Error in Writing Database File"+e.getStackTrace());
        }

    }

    }

}
