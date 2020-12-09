/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto171;

import java.util.Scanner;

/**
 *
 * @author asther
 */
public class Aceptaelreto171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        int numMontanas = teclado.nextInt();

        while (numMontanas != 0) {
            int numAbadias = 0;
            int[] alturas = new int[numMontanas];

            for (int i = 0; i < alturas.length; i++) {
                alturas[i] = teclado.nextInt();
            }

            for (int i = 0; i < alturas.length; i++) {          
                boolean construir = true;
                int alturaActual = alturas[i];

                for (int j = i+1; j < alturas.length; j++) {
                    int alturaPosterior = alturas[j];

                    if (alturaActual <= alturaPosterior) {
                        construir = false;
                    }    
                }
                
                if (construir == true) {
                    numAbadias = numAbadias + 1;
                }
            }
            System.out.println(numAbadias);
            numMontanas = teclado.nextInt();
        }
    }
}    