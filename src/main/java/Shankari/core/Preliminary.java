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
    public Files dir ;
    public Files ephe ;
    public Files db ;
    public Preliminary() {
        dir = new Files(Const.DIR);
        /*dir = new File(Const.DIR);
        ephe = new File(Const.EPHE_DIR);
        db = new File(Const.DB);*/
    }
    public void checkDir() {

       if(!dir.exists())
           writeEverything();
       else if(!ephe.exists())
           writeEphe();
       else if(!db.exists())
           writeDatabase();


    }

    public void writeEverything() {
        //dir = new Files(Const.DIR);
        writeDatabase();
        writeEphe();
    }
    public void writeDatabase() {
        try {
            Files.copy(Paths.get(System.getProperty("user.dir")+"//geonames.db"),
                    Paths.get(Const.DB), StandardCopyOption.REPLACE_EXISTING);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public  void writeEphe() {
        try (Stream<Path> walk = Files.walk(Paths.get(System.getProperty("user.dir") + File.separator + "ephe" ))) {

            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            for(int i=0;i<result.size();i++) {
                Files.copy(result.get(i),Const.EPHE_DIR,StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
