/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto116;

import java.util.Scanner;

/**
 *
 * @author asther
 * 
 */
public class Aceptaelreto116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        int num=teclado.nextInt();
        
        while (num<0 || num>5) {
        num=teclado.nextInt();
        }
        
        for (int n= 1; n <= num; n++) {
            System.out.println("Hola mundo.");
        }
    }
    
}
