/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionavidad148ar;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class EjercicioNavidad148AR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int HH = teclado.nextInt();
        int mm = teclado.nextInt();
                
        int horasEnMin = HH * 60;
        int sumaMin = horasEnMin + mm;
        int minutosQueFaltan = 1440;
        int minutosFinal = minutosQueFaltan - sumaMin;

        System.out.println(minutosFinal);

    }

}
