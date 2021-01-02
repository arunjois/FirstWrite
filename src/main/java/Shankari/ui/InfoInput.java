/*
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
 *
 */

package Shankari.ui;

import Shankari.sql.Query;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.util.ArrayList;

public class InfoInput {
    static Label date, time, country, place;
    static TextField dd, mm, yyyy, hrs, min;
    static ComboBox<String> countryList, placeList;
    static Button okay;
    static Stage input;
    static Scene scene;
    static GridPane grid;
    //static ObservableList<String> places = FXCollections.observableList("");


    public static void showDialog() {
        setScene();
        input = new Stage();
        input.initModality(Modality.APPLICATION_MODAL);
        input.setScene(scene);
        input.showAndWait();
    }
    public static void setScene() {
        setNodes();
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setStyle("-fx-background-color:#3498db; -fx-opacity:1;");
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(0, 10, 0, 10));
        grid.add(date,0,0);
        grid.add(dd,1,0,1,1);
        grid.add(mm,2,0,1,1);
        grid.add(yyyy,3,0,1,1);
        grid.add(time,0,1,1,1);
        grid.add(hrs,1,1,1,1);
        grid.add(min,2,1,1,1);
        grid.add(okay,2,5,1,1);
        grid.add(country,0,3,1,1);
        grid.add(countryList,1,3,4,1);
        grid.add(place,0,4,1,1);
        grid.add(placeList,1,4,4,1);
        scene = new Scene(grid);
    }
    public static void setNodes() {
        date = new Label("Date:");
        time = new Label("Time");
        country =  new Label("Country:");
        place = new Label("Place");
        dd = new TextField();
        mm = new TextField();
        yyyy = new TextField();
        hrs = new TextField();
        min = new TextField();
        okay = new Button("OK");
        countryList = new ComboBox<String>(Query.getCountryList());
        countryList.getSelectionModel().selectFirst();
        //countryList.setOnAction();
        //countryList.setEditable(true);
        countryList.setOnAction(e-> {
            loadComboBox();
        });
        /*okay.setOnAction(
                loadBaseData();
        );*/
        ObservableList<String> novalue = FXCollections.observableArrayList("NUll");
        placeList = new ComboBox<String>(novalue);


        dd.setId("dd");
        dd.setPromptText("dd");
        dd.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");

        mm.setPromptText("mm");
        mm.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");

        yyyy.setPromptText("yyyy");
        yyyy.setStyle("-fx-pref-width:3.8em;-fx-pref-height:2em;");

        hrs.setPromptText("hh");
        hrs.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");

        min.setPromptText("mm");
        min.setStyle("-fx-pref-width:3em;-fx-pref-height:2em;");


    }
    static void loadComboBox() {
        placeList.getItems().clear();
        placeList.getItems().addAll(Query.getPlace(countryList.getSelectionModel().selectedItemProperty().getValue()));
    }
    static void loadBaseData() {

    }

}
