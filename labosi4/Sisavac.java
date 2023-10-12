/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv5;

/**
 *
 * @author Student
 */
public class Sisavac {
    int dob, tezina;
    
    Sisavac() {
        
    }
    
    Sisavac(int broj) {
        dob = broj;
    }
        
        public void setDob(int dob) {
            this.dob = dob;
        }
        
        public void getDob() {
            System.out.println(dob);
        }
        
        public void setTezina(int tezina) {
            this.tezina = tezina;
        }
        
        public void getTezina() {
            System.out.println(tezina);
        }
        
        public void glasajSe() {
            System.out.println("What does the fox say?");
        }
}
