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
 */
package Shankari.ui;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class FileMenu {
    // Create MenuBar
    MenuBar menuBar;

    // Create menus
    Menu fileMenu;
    Menu editMenu;
    Menu helpMenu;

    // Create MenuItems
    MenuItem newItem;
    MenuItem openFileItem;
    MenuItem exitItem;

    MenuItem copyItem;
    MenuItem pasteItem;
    public FileMenu() {
        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        helpMenu = new Menu("Help");

        newItem = new MenuItem("New");
        openFileItem = new MenuItem("Open File");
        exitItem = new MenuItem("Exit");

        copyItem = new MenuItem("Copy");
        pasteItem = new MenuItem("Paste");
    }

    public MenuBar getMenuBar() {

        //Actions on Menus
        //newItem.setOnAction(event->NewInfo.takeInfo());
        setFileMenu();


        // Add menuItems to the Menus
        fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
        editMenu.getItems().addAll(copyItem, pasteItem);

        // Add Menus to the MenuBar
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
        menuBar.useSystemMenuBarProperty().set(true);
        return menuBar;
    }

    void setFileMenu() {
        setNewItem();
        setExitItem();
        setOpenFileItem();
    }
    void setExitItem() {
        exitItem.setOnAction(event->System.exit(0));
    }
    void setNewItem() {
        newItem.setOnAction(e-> {
            InfoInput.showDialog();
        }
        );
    }
    void setOpenFileItem() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files","*.*"),
                new FileChooser.ExtensionFilter("Maiterya File", "*.mtx"),
                new FileChooser.ExtensionFilter("Jagannatha Hora", "*.jhd")
        );
        EventHandler<ActionEvent> fileChooseEvent = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                File file = fileChooser.showOpenDialog(new Stage());
                if (file != null) {
                   System.out.println(file.getAbsolutePath());
                }
            }
        };
        openFileItem.setOnAction(fileChooseEvent);
    }
}
