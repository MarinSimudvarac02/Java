/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Citanje {
    private ObjectInputStream input;
    
    public void openFile() throws FileNotFoundException {
        try {
            input = new ObjectInputStream(new FileInputStream( "studenti.ser" ) );
        } catch (IOException ex) {
            Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readRecords() {
        Student stavka = new Student();
        for (int i = 0; i < 2; i++) {
            try {
                stavka = (Student) input.readObject();
            } catch (IOException ex) {
                Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println(stavka.maticni);
            System.out.println(stavka.ime);
            System.out.println(stavka.prezime);
            System.out.println(stavka.fakultet);
            System.out.println(stavka.smjer);
            System.out.println(stavka.prosjecna_ocjena);
            System.out.println();
        }
    }
    
    public void closeFile() {
        if (input != null) {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(Citanje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
