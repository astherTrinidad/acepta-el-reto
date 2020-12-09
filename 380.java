/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto_380.b;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class AceptaelReto_380B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int cantidadGastos;
        int gastosPorPrueba;
        int sumaGastosPorPrueba;
        int sumaTotal = 0;
        int sumaMaxGastos = (int) Math.pow(10, 9);
        int limiteGastos = 50000;

        do {
            cantidadGastos = teclado.nextInt();

            sumaGastosPorPrueba = 0;

            if (cantidadGastos != 0) {

                for (int i = 1; i <= cantidadGastos; i++) {
                    gastosPorPrueba = teclado.nextInt();
                    sumaGastosPorPrueba = sumaGastosPorPrueba + gastosPorPrueba;
                }
                System.out.println(sumaGastosPorPrueba);
                if (sumaGastosPorPrueba <= limiteGastos) {
                    sumaTotal = sumaTotal + sumaGastosPorPrueba;
                }
            }

        } while (cantidadGastos != 0 && sumaTotal <= sumaMaxGastos);

    }

}
