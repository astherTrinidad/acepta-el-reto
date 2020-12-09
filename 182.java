/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto182;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class Aceptaelreto182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Persistencia multiplicativa de los números
        Scanner teclado = new Scanner(System.in);
        int casosPrueba = teclado.nextInt();

        //Solicitar número
        String numCadena = teclado.next();
        int numEntero = Integer.parseInt(numCadena);

        int persistencia = 0;

        while (numEntero != 0) {

            //declarar y crear array
            int[] digitos = new int[numCadena.length()];
            int cifra = digitos.length - 1; //empieza a por la última cifra

            while (numEntero > 0) {
                digitos[cifra] = numEntero % 10;
                numEntero = numEntero / 10;
                cifra--;
            }
            //impresion numeros desglosados
            int resultado = digitos[0];

            for (int i = 1; i < digitos.length; i++) {

                resultado = digitos[i] * resultado;
                System.out.println("El resultado es: " + resultado);

            }
            if (resultado != 0) {
                persistencia = persistencia + 1;
                numEntero = resultado;
            }
        }
        System.out.println(persistencia);
    }

}
