/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto376;

import java.util.Scanner;

/**
 *
 * @author asther
 */
public class AceptaelReto376 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        //Entrada 1
        int cantidadAnotacionesAltura = teclado.nextInt();

        //condicion y entrada de números positivos con la altura
        int numAnterior;

        while (cantidadAnotacionesAltura != 0) {
            int[] alturas = new int[cantidadAnotacionesAltura];
            int numPicos = 0;

            // Escribir tantas alturas como cantidades
            for (int i = 0; i < alturas.length; i++) {
                alturas[i] = teclado.nextInt();
            }
            
            //Comparar cada posición y ver cuántos número mayores hay

            for (int i = 0; i < alturas.length; i++) {

                int numActual = alturas[i]; //numActual
                System.out.println(numActual);

                if (i > 0) {
                    numAnterior = alturas[i - 1]; //0 --> -1
                } else {
                    numAnterior = alturas[alturas.length - 1]; //numAnterior
                }

                int numPosterior = alturas[(i + 1) % alturas.length]; //numPosterior // la posición de la iteración del for que se encuentra dentro de la array alturas + 1.

                if (numActual > numAnterior && numActual > numPosterior) {
                    numPicos = numPicos + 1;
                }

            }
            System.out.println(numPicos);
            cantidadAnotacionesAltura = teclado.nextInt();

        } 

    }
}
