/*
Napisati  program  koji  će  ispisivati  hijerarhiju  sistemskog  diska  (ispisati  dodatne 
informacije  kao  što  su  “direktorij”,  “datoteka”).  Nakon  što  se  ispiše  hijerarhija, 
ponovno proći kroz sve ali prilikom ispisa provjeriti da li naziv direktorija ili datoteke počinje 
slovom između a - n (ako je malo početno prepraviti u veliko), a ako počinje slovom  između  
o  -  z  (ako  je  zadnje  slovo  malo  prepraviti  kompletan  naziv  u  velika slova). 
 */

package lv04;
import java.io.File;

public class lv04_1 {
    public static void main(String[] args) {
        File mapa = new File("c:/");
        File[] popisDatoteka = mapa.listFiles(); // izlistava datoteke
        
        for (File datoteka : popisDatoteka){
            System.out.println(datoteka.getName());
        }
        
        for (File datoteka : popisDatoteka){
            if((datoteka.getName()).matches("(a|b|c|d|e|f|g|h|i|j|k|l|m|n).*")) {
                System.out.println(datoteka.getName().substring(0,1).toUpperCase() + datoteka.getName().substring(1));
            }
        }
        for (File datoteka : popisDatoteka){
            if((datoteka.getName()).matches("(o|p|r|q|r|s|t|u|v|w|x|y|z).*")){
                System.out.println(datoteka.getName().toUpperCase());
            }
        }
    }
}
