/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv08;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Student
 */
public class Client {
    public static void main (String[] args) {
        String host = "127.0.0.1";
        int port = 9999;
        try {
            // kreiramo soket za komunikaciju sa serverom
            Socket klijent = new Socket(host, port);
            System.out.println("Klijent: " + klijent);
            //input i output strimovi
            InputStream in = klijent.getInputStream();
            OutputStream out = klijent.getOutputStream();
            BufferedReader bis = new BufferedReader(new InputStreamReader(in));
            PrintWriter ps = new PrintWriter(new PrintStream(out), true /* autoflush */);
            //poruke koje će nam posluživač vratiti nazad
            String[] eho = {"prodavac kupac", "kupac", "trgovina", "BYE"};
            //pošaljemo poruke posluživaču
            for(int i=0;i<eho.length; ++i) ps.println(eho[i].trim());
            //sad nam tu istu poruku vraća posluzivač
            String linija = null;
            while((linija = bis.readLine()) != null) {
                System.out.println(linija); 
            }
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}