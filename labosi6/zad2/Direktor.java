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
public class Direktor extends Zaposlenik {
    public void radi() {
        System.out.println("Odlucujem");
    }
    
     public void predstaviSe() {
        super.predstaviSe();
        System.out.println(Direktor.class.getSimpleName());
    }
}
