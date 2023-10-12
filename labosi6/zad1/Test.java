/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv06.zad1;

/**
 *
 * @author Student
 */
public class Test {
    public static void main(String [] args) {
        Zivotinja konj = new Konj();
        Zivotinja ptica = new Ptica();
        Zivotinja riba = new Riba();
        Zivotinja zivotinja = new Zivotinja();
        
        for (int i = 0; i < 4; i++) {
            switch(i) {
                case 0:
                    konj.kreciSe();
                    break;
                case 1:
                    ptica.kreciSe();
                    break;
                case 2:
                    riba.kreciSe();
                    break;
                case 3:
                    zivotinja.kreciSe();
                    break;
            }
        }
    }
}
