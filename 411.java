/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionavidad411ar;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class EjercicioNavidad411AR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int balanceo;
        int pesoMax;

        pesoMax = teclado.nextInt();
        while (pesoMax != 0) {

            int pesoDeCadaElefante = 1;
            int suma = 0;
            balanceo = 0;

            while (pesoDeCadaElefante != 0) {
                pesoDeCadaElefante = teclado.nextInt();

                if (suma < pesoMax) {

                    if (suma < pesoMax && pesoDeCadaElefante != 0) {
                        suma = pesoDeCadaElefante + suma;

                        if (suma <= pesoMax) {
                            balanceo = balanceo + 1;
                        }
                    }
                }
            }
            if (pesoMax != 0) {
                System.out.println(balanceo);
            }
            pesoMax = teclado.nextInt();
        }
    }
}
