/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atmprogrami;

import java.util.Scanner;

/**
 *
 * @author Kevser
 */
public class BasamakSayisiToplami {

    public static void main(String[] args) {
         System.out.println("basamak sayisi giriniz...");
            
        Scanner scanner = new Scanner(System.in);
          int k=scanner.nextInt();
        do {            
            
            System.out.println("uc basamakli bir sayi giriniz.");
            
            int sayi= scanner.nextInt();
            int a = (sayi /10 ) % 10;
            int b = sayi % 10;
            int c = (sayi/100) % 10;
           
          
            
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
             
            System.out.println("basamak sayıları toplamı:"+ (a+b+c));
            
        } while (k<3);
        
        
        
    }
}
