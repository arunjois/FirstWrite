/**
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
 */
package Shankari;
import Shankari.core.Const;
import Shankari.core.Date;
import Shankari.core.Preliminary;
import Shankari.core.Time;
import Shankari.jyothishya.Horoscope;
import Shankari.jyothishya.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import Shankari.ui.*;

import java.io.IOException;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;

public class App extends Application {
    BorderPane root;
    FileMenu fileMenu;
    Scene scene;
    Horoscope h = new Horoscope(new Person("HAHA",
            new Date(getData("dd"), getData("mm"), getData("yyyy")),
            new Time(getData("HH"), getData("MM"), getData("ss")),
            Const.PLACE, 'M', Const.LONGITUDE, Const.LATITUDE ));
    LinkedList<Horoscope> horoscopes = new LinkedList<Horoscope>();
    ObservableList<Horoscope> observableHoroscope = FXCollections.observableList(horoscopes);


    @Override
    public void start(Stage primaryStage) {

        root = new BorderPane();
        //root.getChildren().add(btn);
        fileMenu = new FileMenu();

        // menuBar.getMenus().addAll(f.getMenuBar());

        //root.getChildren().add(f.getMenuBar());


        scene = new Scene(root, 300, 250);
        root.setTop(fileMenu.getMenuBar());
        //root.setCenter();
        //root.setBottom();
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);
    }
    public static void main(String[] args) {
        Preliminary p = new Preliminary();
        try {
            p.checkDir();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        launch(args);
    }

    public int getData(String s) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        switch (s) {
            case "dd" : dtf = DateTimeFormatter.ofPattern("dd");
                        break;
            case "mm" : dtf = DateTimeFormatter.ofPattern("MM");
                        break;
            case "yyyy" :   dtf = DateTimeFormatter.ofPattern("yyyy");
                            break;
            case "HH" : dtf = DateTimeFormatter.ofPattern("HH");
                        break;
            case "MM" : dtf = DateTimeFormatter.ofPattern("mm");
                        break;
            case "ss" : dtf = DateTimeFormatter.ofPattern("ss");
                        break;
            default: System.out.println("Date Format Not Known");

        }
        return Integer.parseInt(dtf.format(now));
    }

}

