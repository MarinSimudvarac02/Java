/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labosi1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Labosi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1. ZADATAK:");
        System.out.println("   J    A    V     V  A   ");
        System.out.println("   J   A A    V   V  A A  ");
        System.out.println("J  J  AAAAA    V V  AAAAA ");
        System.out.println(" JJ  A     A    V  A     A");
        
        System.out.println("2. ZADATAK:");
        System.out.println("Hello");
        System.out.println("Tomislav Kaučić");
        
        System.out.println("3. ZADATAK:");
        System.out.println("74 + 36 = " + (74 + 36));
        
        System.out.println("4. ZADATAK:");
        System.out.println("50 / 3 = " + (50 / 3));
        
        System.out.println("5. ZADATAK:");
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Unesi prvi broj: ");
        num1 = input.nextInt();
        System.out.println("Unesi drugi broj: ");
        num2 = input.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    
}
