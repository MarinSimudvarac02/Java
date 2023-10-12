/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv5;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pas Zuco = new Pas();
        Macka Micko = new Macka();
        
        Zuco.setTezina(15);
        Micko.setTezina(10);
        Zuco.setDob(3);
        Micko.setDob(6);
        Zuco.setVrsta("Avlijaner");
        Micko.setVrsta("Lav");
        
        System.out.println("ZUCO:");
        Zuco.getDob();
        Zuco.getTezina();
        Zuco.getVrsta();
        
        System.out.println("MICKO:");
        Micko.getDob();
        Micko.getTezina();
        Micko.getVrsta();
        
        Zuco.glasajSe();
        Micko.glasajSe();
    }
    
}
