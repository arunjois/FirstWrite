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
package Shankari;
import Shankari.core.Preliminary;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import Shankari.ui.*;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        //root.getChildren().add(btn);
        FileMenu f = new FileMenu();
        HBoxSet hb = new HBoxSet();
        // menuBar.getMenus().addAll(f.getMenuBar());

        //root.getChildren().add(f.getMenuBar());


        Scene scene = new Scene(root, 300, 250);
        root.setTop(f.getMenuBar());
        root.setCenter(hb.getHBset());
        root.setBottom();
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
}

