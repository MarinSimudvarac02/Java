/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class Izrada {
    
    private ObjectOutputStream output;
    
    public void openFile() {
        try {
            output = new ObjectOutputStream(new FileOutputStream( "studenti.ser" ) );
        } catch (IOException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addRecords(Student stavka) {
        try {
            output.writeObject(stavka);
        } catch (IOException ex) {
            Logger.getLogger(Izrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeFile () {
        if (output != null)
            try {
                output.close();
        } catch (IOException ex) {
            Logger.getLogger(Izrada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
