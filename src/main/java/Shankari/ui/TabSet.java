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

import javafx.collections.ObservableList;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.util.ArrayList;

public class TabSet {
    public TabPane tabPane;
    public Tab primary;
    public Tab secondary;
    public TabSet() {
        tabPane = new TabPane();
        primary = new Tab();
        secondary = new Tab();
    }
    public TabPane getTabPane() {
        return this.tabPane;
    }

}
