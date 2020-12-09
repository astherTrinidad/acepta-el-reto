/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto337;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class Aceptaelreto337 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        //Número total de casos
        int numCasos;

        //Primera Línea
        numCasos = teclado.nextInt();

        for (int i = 0; i < numCasos; i++) {

            //Segunda Línea y tercera Línea (Casos)
            //Declarar arrays
            int[] dientesSup = new int[6];
            int[] dientesInf = new int[6];
            int[] suma = new int[6];

            //Dientes superiores
            for (int l = 0; l < 6; l++) {
                dientesSup[l] = teclado.nextInt();
            }
            //Dientes inferiores
            for (int j = 0; j < 6; j++) {
                dientesInf[j] = teclado.nextInt();
            }
            //Suma de cada posición
            for (int k = 0; k < 6; k++) {
                suma[k] = dientesSup[k] + dientesInf[k];
                //System.out.println(suma[k]);
            }

            //Comparación de resultados
            if (suma[0] == suma[1] && suma[1] == suma[2] && suma[2] == suma[3] && suma[3] == suma[4] && suma[4] == suma[5]) {

                System.out.println("SI");
            } else {

                System.out.println("NO");
            }

        }
    }

}
