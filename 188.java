/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_ar188_encadenandopalabras;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class Ejercicio4_AR188_EncadenandoPalabras {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (teclado.hasNext()) {
            
            casoPrueba();
        }
    }

    public static void casoPrueba(){
        
            String[] listadoPalabras = new String[50];
            String palabra;

            for (int i = 0; i < listadoPalabras.length; i++) {
                palabra = teclado.nextLine();
                listadoPalabras = palabra.split(" ");

                devuelveEsCadena(devuelveSufijoDeLaPrimeraPalabra(listadoPalabras),
                        devuelvePrefijoDeLaSegundaPalabra(listadoPalabras));

            }
    
    }
    
    
    public static String[] devuelveSufijoDeLaPrimeraPalabra(String[] listadoPalabras) {
        String[] sufijos = new String[listadoPalabras.length];

        for (int i = 0; i < listadoPalabras.length; i++) {
            if (listadoPalabras[i].length() <= 2) {
                sufijos[i] = listadoPalabras[i];
            } else {
                sufijos[i] = listadoPalabras[i].substring(listadoPalabras[i].length() - 2);
            }
        }
        return sufijos;

    }

    public static String[] devuelvePrefijoDeLaSegundaPalabra(String[] listadoPalabras) {
        String[] prefijos = new String[listadoPalabras.length];

        for (int i = 0; i < listadoPalabras.length; i++) {
            if (listadoPalabras[i].length() <= 2) {
                prefijos[i] = listadoPalabras[i];
            } else {
                prefijos[i] = listadoPalabras[i].substring(0, 2);
            }

        }

        return prefijos;
    }

    public static void devuelveEsCadena(String[] sufijos, String[] prefijos) {
        boolean esCadena = true;

        for (int i = 0; i < sufijos.length - 1; i++) {
            if (!sufijos[i].equals(prefijos[i + 1])) {
                esCadena = false;
            }
        }

        if (esCadena == true) {
            System.out.println("SI");

        } else {
            System.out.println("NO");
        }

    }

}
