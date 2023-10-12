/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv04;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class zad02 {

    public static void main (String[] args) {
        Student [] polje = new Student[2];
        for (int i = 0; i < 2; i++) {
            Student stud = new Student();
            polje[i] = stud;
        }
        for (Student stavka : polje) {
            Student.unos(stavka);
        }
        
        Izrada file = new Izrada();
        file.openFile();
        for (Student stavka : polje) {
            file.addRecords(stavka);
        }
        file.closeFile();
        
        Citanje files = new Citanje();
        try {
            files.openFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(zad02.class.getName()).log(Level.SEVERE, null, ex);
        }
        files.readRecords();
        files.closeFile();
    }    
}
