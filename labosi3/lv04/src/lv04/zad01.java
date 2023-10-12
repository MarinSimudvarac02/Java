/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv04;

import java.io.*;

/**
 *
 * @author Student
 */
public class zad01 {
    public static String[] direktorij;
    public static void hijerarhiraj(String path) {
        File name = new File(path);
        if(name.isDirectory()) {
            direktorij = name.list();
        for (String stavka : direktorij) {
            System.out.println(stavka);
            File datoteka = new File(name + "/" + stavka);
            if (datoteka.isAbsolute())
                System.out.println("ABSOLUTE PATH: " + datoteka.getAbsolutePath());
            if (datoteka.isFile()) {
                System.out.println("LENGTH: " + datoteka.length() + "B");
                System.out.println("LAST MODIFIED: " + datoteka.lastModified());
            }
            System.out.println();
        }
        }
    }
    public static void provjeri(String path) {
        File name = new File(path);
        if(name.isDirectory()) {
            direktorij = name.list();
        for (String stavka : direktorij) {
            char slovo = stavka.charAt(0);
            if (Character.isLowerCase(slovo)) {
                slovo = Character.toUpperCase(slovo);
            }
            int slovobr = (int) slovo;
            if (slovobr >= 65 && slovobr <= 78) {
                System.out.println(stavka.toLowerCase());
            }
            else if (slovobr >= 79 && slovobr <= 90) {
                System.out.println(stavka.toUpperCase());
            }
        }
        }
    }
    
    public static void main (String[] args) {
        System.out.println("Prvi\n");
        hijerarhiraj("C:");
        System.out.println("\nDrugi\n");
        provjeri ("C:");
    }
}
