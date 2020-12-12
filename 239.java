/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionavidad239ar;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class EjercicioNavidad239AR {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numDias = teclado.nextInt();
        int numEmisoras = teclado.nextInt();

        while (numDias != 0 && numEmisoras != 0) {

            int GTStotal = numDias * 24;
            int gts = 6;
            int ss = GTStotal * gts * numEmisoras;

            int hh;
            int mm;
            int ssFinal;

            int d = (ss / 86400);

            if (d >= 1) {
                hh = (ss / 3600) - d * 24;
                mm = (ss / 60) - ((hh * 60) + (d * 1440));
                ssFinal = ss - ((mm * 60) + (hh * 3600) + (d * 86400));
            } else {
                hh = (ss / 3600);
                mm = (ss / 60) - hh * 60;
                ssFinal = ss - ((mm * 60) + (hh * 3600));
            }

            if (hh < 10) {
                System.out.print(d + ":0" + hh);
            } else {
                System.out.print(d + ":" + hh);
            }

            if (mm < 10) {
                System.out.print(":0" + mm);
            } else {
                System.out.print(":" + mm);
            }

            if (ssFinal < 10) {
                System.out.println(":0" + ssFinal);
            } else {
                System.out.println(":" + ssFinal);
            }
            numDias = teclado.nextInt();
            numEmisoras = teclado.nextInt();

        }
    }

}
