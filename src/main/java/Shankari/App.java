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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class App extends Application {
    BorderPane root;
    FileMenu fileMenu;
    Scene scene;
    Horoscope h;
    public ObservableList<Horoscope> observableHoroscope;
    public App() {
        h = new Horoscope(new Person("M&M",
                new Date(getDate("dd"), getDate("mm"), getDate("yyyy")),
                getTime(),
                Const.PLACE, 'M', Const.LONGITUDE, Const.LATITUDE ));
        observableHoroscope = FXCollections.observableList(new LinkedList<Horoscope>());
        observableHoroscope.add(h);
    }


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

    /**
     * The method return day, month, year.
     * @param s which refers to any part of the day
     * @return the integer value of either date
     */
    public int getDate(String s) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
        switch (s) {
            case "dd" : dtf = DateTimeFormatter.ofPattern("dd");
                        break;
            case "mm" : dtf = DateTimeFormatter.ofPattern("MM");
                        break;
            case "yyyy" :   dtf = DateTimeFormatter.ofPattern("yyyy");
                            break;
            default: System.out.println("Date Format Not Known");
        }
        return Integer.parseInt(dtf.format(now));
    }

    /**
     * Method to return double hour
     * @param s
     * @return
     */
    public double getTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("HH:mmss");
        String time = dtf.format(now);
        return  Double.parseDouble(time.replace(':', '.'));
    }

    public boolean addHoroscope(Horoscope s) {
        return this.observableHoroscope.add(s);
    }
}

