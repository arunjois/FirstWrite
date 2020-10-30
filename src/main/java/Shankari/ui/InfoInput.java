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

package Shankari.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;

public class InfoInput {
    static Label date, time, country;
    static TextField dd, mm, yyyy, hrs, min;
    static Button okay;
    static Stage input;
    static Scene scene;
    static GridPane grid;

    public InfoInput() {
        date = new Label("Date:");
        time = new Label("Time");
        country =  new Label("Country:");
        dd = new TextField();
        mm = new TextField();
        yyyy = new TextField();
        hrs = new TextField();
        min = new TextField();
        okay = new Button("OK");
    }
    public static void showDialog() {
        input = new Scene();
        input.initModality(Modality.APPLICATION_MODAL);
        input.setTitle("Info");
        input.setMinWidth(300);
        input.setMinHeight(300);

        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));
        grid.setStyle("-fx-background-color:#3498db");


        grid.add(date,0,0);

        dd.setId("dd");
        dd.setPromptText("dd");
        dd.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(dd,1,0,1,1);


        mm.setPromptText("mm");
        mm.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(mm,2,0,1,1);


        yyyy.setPromptText("yyyy");
        yyyy.setStyle("-fx-pref-width:3.8em;-fx-pref-height:2em;");
        grid.add(yyyy,3,0,1,1);


        grid.add(time,0,1,1,1);


        hrs.setPromptText("HH");
        hrs.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(hrs,1,1,1,1);


        min.setPromptText("MM");
        min.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");
        grid.add(min,2,1,1,1);


        grid.add(country,0,3,1,1);
        //Country con = new Country();
        ArrayList<String> abc = new ArrayList<String>();
        abc.add("Wjhat");
        abc.add("cat");
        abc.add("dog");
        //ObservableList<String> observableList = FXCollections.observableList(abc.toString());

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        abc.toString()
                );

        String c = new String("What");
        ComboBox<String> countryList = new ComboBox<String>(options);
        grid.add(countryList,1,3,4,1);
        /*
         * Set Action on Combo box
         */
        countryList.setOnAction(e->{
            //Country.getPlace(countryList.getSelectionModel().selectedItemProperty().getValue());
            System.out.println(countryList.getSelectionModel().selectedItemProperty().getValue());
        });
        countryList.getSelectionModel().selectFirst();
        Label place = new Label("Place:");
        grid.add(place,0,4,1,1);

        String tmp = countryList.getSelectionModel().selectedItemProperty().getValue();
        ComboBox<String> placeList = new ComboBox<String>(
                FXCollections.observableArrayList("Waht")
        );
        grid.add(placeList,1,4,4,1);


        grid.add(okay,2,5,1,1);

        scene = new Scene(grid);
        input.setScene(scene);
        input.showAndWait();
    }
    public void setInput() {

    }
}
