/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionavidad402ar;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class EjercicioNavidad402AR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int casoDePrueba = teclado.nextInt();

        while (casoDePrueba != 0) {
            int contador = 0;
            int[] posicion = new int[casoDePrueba];
            
            for (int i = 2; i < posicion.length; i++) {
                if (casoDePrueba % i == 0) {
                    posicion[contador] = i;
                    contador++;
                }
            }
            
            int posLadoLargo = (contador / 2);
            System.out.println(posicion[posLadoLargo]);
            casoDePrueba = teclado.nextInt();
        }
    }
}
