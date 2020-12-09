/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto171_b;

import java.util.Scanner;

/**
 *
 * @author asther
 */
public class Aceptaelreto171_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int numMontanas = teclado.nextInt();

        while (numMontanas != 0) {

            int numAbadias = 1;

            int[] alturas = new int[numMontanas];
            
            
            for (int i = 0; i < alturas.length; i++) {
                alturas[i] = teclado.nextInt();
            }
            
            int alturaMayor = alturas.length-1;
            
            for (int i = alturas.length-2; i >= 0; i--) {
                if (alturas[i] > alturaMayor) {
                    alturaMayor = alturas[i];
                    numAbadias = numAbadias + 1;
                }
            }
          
            System.out.println(numAbadias);
            numMontanas = teclado.nextInt();
        }
    }
}
