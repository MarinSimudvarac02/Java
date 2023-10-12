/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author Student
 */
public class Test {
    public static void main(String [] args) {
        
        Zaposlenik direktor = new Direktor();
        Zaposlenik tajnica = new Tajnica();
        Zaposlenik vozac = new Vozac();
        
        direktor.setIme("Ivo");
        direktor.setPrezime("Ivic");
        direktor.setId("0001");
        tajnica.setIme("Maja");
        tajnica.setPrezime("Majic");
        tajnica.setId("0002");
        vozac.setIme("Pero");
        vozac.setPrezime("Peric");
        vozac.setId("0003");
        
        for (int i = 0; i < 3; i++) {
            switch(i) {
                case 0:
                    direktor.predstaviSe();
                    direktor.radi();
                    break;
                case 1:
                    tajnica.predstaviSe();
                    tajnica.radi();
                    break;
                case 2:
                    vozac.predstaviSe();
                    vozac.radi();
                    break;
        }
    }
}
}
