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
    public class Macka extends Sisavac {
        String vrsta;
        
        Macka() {
            super();
        }
        
        Macka(int broj) {
            super(broj);
        }
        
        public void setVrsta(String vrsta) {
            this.vrsta = vrsta;
        }
        
        public void getVrsta() {
            System.out.println(vrsta);
        }
        
        public void glasajSe() {
            System.out.println("MIJAU! MIJAU! GRR! BRR!");
        }
        
    }
