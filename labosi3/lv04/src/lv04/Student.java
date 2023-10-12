/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv04;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Student implements Serializable {
    public String ime;
    public String prezime;
    public String fakultet;
    public String smjer;
    public int godina;
    public double prosjecna_ocjena;
    public int maticni;

    public int getMaticni() {
        return maticni;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getSmjer() {
        return smjer;
    }

    public int getGodina() {
        return godina;
    }

    public double getProsjecna_ocjena() {
        return prosjecna_ocjena;
    }
    
    public void setMaticni(int maticni) {
        this.maticni = maticni;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setProsjecna_ocjena(double prosjecna_ocjena) {
        this.prosjecna_ocjena = prosjecna_ocjena;
    }
    
    public static void unos(Student stavka) {
        Scanner input = new Scanner (System.in);
        System.out.println("MATICNI BROJ: ");
        stavka.maticni = input.nextInt();
        input.nextLine();
        System.out.println("IME: ");
        stavka.ime = input.nextLine();
        System.out.println("PREZIME: ");
        stavka.prezime = input.nextLine();
        System.out.println("FAKULTET: ");
        stavka.fakultet = input.nextLine();
        System.out.println("SMJER: ");
        stavka.smjer = input.nextLine();
        System.out.println("PROSJECNA OCJENA: ");
        stavka.prosjecna_ocjena = input.nextDouble();
        System.out.println("\n");
    }
}
