/**
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
 */
package Shankari.core;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
        File folder = new File(System.getProperty("user.dir") + File.separator + "ephe" + File.separator);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                Files.copy(Paths.get( System.getProperty("user.dir") + File.separator + "ephe" + File.separator + file.getName()),
                        Paths.get( Const.EPHE_DIR + file.getName()), StandardCopyOption.REPLACE_EXISTING);

            }
        }
    }
    public void writeDatabase() throws IOException {
        try{
            Files.copy(Paths.get(System.getProperty("user.dir") + File.separator + "geonames1000.db"),
                    Paths.get(Const.GEONAMES), StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e){
            System.out.println("Error in Writing Database File"+e.getStackTrace());
        }

    }



}
