/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg289ar;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author asthertm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);

        int casoPrueba;
        int[] numerosOperando;

        casoPrueba = teclado.nextInt();
        int esfuerzo;
        int sumaOperandos;
        
        while (casoPrueba != 0) {
            esfuerzo = 0;
            numerosOperando = new int[casoPrueba];
            for (int i = 0; i < numerosOperando.length; i++) {
                numerosOperando[i] = teclado.nextInt();
            }

            Arrays.sort(numerosOperando);

            sumaOperandos = numerosOperando[0];

            for (int i = 1; i < numerosOperando.length; i++) {
                sumaOperandos = sumaOperandos + numerosOperando[i];
                esfuerzo = esfuerzo + sumaOperandos;

            }
            System.out.println(esfuerzo);
            casoPrueba = teclado.nextInt();
        }

    }
//
//    public static int[] ordenarNumeros(int[] numerosOperando) {
//        
//        for (int i = 0; i < numerosOperando.length; i++) {
//            for (int j = i + 1; j < numerosOperando.length; j++) {
//
//                if (numerosOperando[i] > numerosOperando[j]) {
//                    int variableAuxiliar = numerosOperando[i];
//                    numerosOperando[i] = numerosOperando[j];
//                    numerosOperando[j] = variableAuxiliar;
//                }
//
//            }
//
//        }
//        
//        return numerosOperando;
//    }
    
    
    
    
    

}
