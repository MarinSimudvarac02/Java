/*
Implementirati klasu koja predstavlja studenta (maticni broj, ime, prezime, fakultet, 
smjer, godina,prosjecna_ocjena). Kroz petlju unijeti podatke za 10 studenata, zatim 
uitati  te  podatke  u  datoteku  te  nakon  toga  učitati  te  iste  podatke  i  izračunati 
prosjek ocjena za sve studente. Koristiti serijalizaciju
 */
package lv04;
import java.io.File;
import java.util.Scanner;

public class lv04_2 {
    public class Student {
        private int maticni, godina;
        private String ime, prezime, fakultet, smjer;
        private double prosjecna_ocjena;
    
        public void unosPodataka() {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi matični broj: ");
        maticni = input.nextInt();
        System.out.println("Unesi ime: ");
        ime = input.nextLine();
        System.out.println("Unesi prezime: ");
        prezime = input.nextLine();
        System.out.println("Unesi naziv fakulteta: ");
        fakultet = input.nextLine();
        System.out.println("Unesi naziv smjera: ");
        smjer = input.nextLine();
        System.out.println("Unesi godinu: ");
        godina = input.nextInt();
        System.out.println("Unesi prosječnu ocjenu: ");
        prosjecna_ocjena = input.nextDouble();
        }
    }
    
    public static void main(String[] args) {
        Student[] razred;
        razred = new Student[10];
        for (int i = 0; i < 9; i++) {
            razred[i].unosPodataka();
        }
    }
}
