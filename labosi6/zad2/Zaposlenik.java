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
public abstract class Zaposlenik {
    private String id, ime, prezime;

    public void setId(String id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
    
    public void predstaviSe() {
        System.out.println("Zovem se " + ime + " " + prezime + " i moj id je " + id);
    }
    
    abstract void radi();
}
