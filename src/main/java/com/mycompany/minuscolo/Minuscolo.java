/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minuscolo;

/**
 *
 * @author ospite
 */
import java.util.Scanner;
public class Minuscolo {
   static final int TANTI=30;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String parola;
        char[] minuscolo=new char[TANTI];
        System.out.println("|Inserisci una parola :");
        parola=in.next();
        for(int x=0;x<parola.length();x++){
            minuscolo[x]=parola.charAt(x);
        }
        for(int x=0;x<parola.length();x++){
            minuscolo[x]=Character.toLowerCase(minuscolo[x]);
            
        }
        System.out.println("la parola in minuscolo (array) : " );
        for(int x=0;x<minuscolo.length;x++){
            System.out.println(minuscolo[x]);
        }
        String parolaMinu=new String(minuscolo);
        System.out.println("La parola in minuscolo (oggetto): ");
        System.out.println(parolaMinu);
    }
}
