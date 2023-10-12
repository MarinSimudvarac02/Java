/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Student
 */
public class Host {
    public static void main (String[] args) {
    //ovaj soket čeka klijenta da se spoji
    ServerSocket echoServer = null;
    String linija;
    BufferedReader is;
    PrintWriter os;
    Socket clientSocket = null;
    try {
        echoServer = new ServerSocket();
        echoServer.bind(new InetSocketAddress("127.0.0.1", 9999));
        System.out.println("Postavljeni posluzitelj:" + echoServer.toString());
    }
    catch (IOException e) {
        System.out.println(e);
        System.exit(1);
    }
    try { 
        // kreiramo sada običan Socket i čekamo klijenta da zatraži vezu
        clientSocket = echoServer.accept();
        System.out.println("Server>> Imamo klijenta: "+clientSocket.getInetAddress());
        //otvaramo kanale za komunikaciju
        is = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        os = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);
        //čitamo i pišemo podatke nazad klijentu // sve dok on ne pošalje poruku BYE.
        boolean done = false;
        while (!done && (linija = is.readLine()) != null) {
            os. print("Echo: ");
            if (linija.contains("pita") || linija.contains("kupac") || linija.contains("fidget")) {
                String[] parts = linija.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].equals("pita")|| parts[i].equals("kupac") || parts[i].equals("fidget")) 
                    {
                        for( int j = 0; j < parts[i].length(); j++) {
                            os.print("*");
                        }
                        os.print(" ");
                    }
                    else {
                        os.print(parts[i].toUpperCase());
                        os.print(" ");
                    }
                }
                os.println(" ");
            }
            else {
            os.println(linija.toUpperCase());
            if(linija.trim().equals("BYE")) done = true;
            }
            
        }
    }
    catch (IOException e) {
        System.out.println(e);
    }
    }  
}


