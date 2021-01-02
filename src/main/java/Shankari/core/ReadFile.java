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

package Shankari.core;

import Shankari.App;
import Shankari.jyothishya.Horoscope;
import Shankari.jyothishya.Person;

import java.io.File;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    List<File> file;
    public ReadFile(List<File> p) {
        file = p;
    }
    public void openFile() {
        for (File x : file) {
            System.out.println(x.getAbsoluteFile());
            String path = x.getAbsolutePath().substring(x.getAbsolutePath().lastIndexOf(File.separator)+1);
            Scanner scanner = new Scanner(path);
            if (path.substring(path.lastIndexOf(".")).equals(".mtx")) {
                System.out.println("True");
            }
            else {
                System.out.println("False");
            }

        }
    }
}
