/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_ar334_galosromanosyotrosagentes;

import java.util.Scanner;

/**
 *
 * @author asthertm
 */
public class Ejercicio3_AR334_GalosRomanosYOtrosAgentes {

    /**
     * @param args the command line arguments
     */
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        //Galos, romanos y otros agentes
        int numCasosPrueba = teclado.nextInt();
        teclado.nextLine();

        String[] nombres = introducirNombres(numCasosPrueba);

        asignarOrigenDelNombre(
                devuelvePrefijosPorNombres(nombres),
                devuelveSufijosPorNombres(nombres),
                devuelveUltimaLetraPorNombres(nombres),
                numCasosPrueba
        );

    }

    public static String[] introducirNombres(int numCasosPrueba) {
        String nombre;
        String[] nombres = new String[numCasosPrueba];

        for (int i = 0; i < nombres.length; i++) {
            nombre = teclado.nextLine();
            nombres[i] = nombre;
        }
        return nombres;
    }

    public static String[] devuelveSufijosPorNombres(String[] nombres) {
        String[] sufijos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() <= 2) {
                sufijos[i] = nombres[i];
            } else {
                sufijos[i] = nombres[i].substring(nombres[i].length() - 2);
            }
        }

        return sufijos;
    }

    public static String[] devuelveUltimaLetraPorNombres(String[] nombres) {
        String[] ultimaLetra = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() <= 1) {
                ultimaLetra[i] = nombres[i];
            } else {
                ultimaLetra[i] = nombres[i].substring(nombres[i].length() - 1);
            }

        }

        return ultimaLetra;
    }

    public static String[] devuelvePrefijosPorNombres(String[] nombres) {
        String[] prefijos = new String[nombres.length];

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].length() <= 3) {
                prefijos[i] = nombres[i];
            } else {
                prefijos[i] = nombres[i].substring(0, 3);
            }

        }

        return prefijos;
    }

    public static void asignarOrigenDelNombre(
            String[] sufijos,
            String[] ultimaLetra,
            String[] prefijos,
            int numCasos
    ) {

        String[] origenes = new String[3];

        for (int i = 0; i < numCasos; i++) {
            String origenFinal = "PLUS ULTRA";

            origenes[0] = devuelveOrigenPorAfijo(prefijos[i]);
            origenes[1] = devuelveOrigenPorAfijo(sufijos[i]);
            origenes[2] = devuelveOrigenPorAfijo(ultimaLetra[i]);

            for (String origen : origenes) {
                if (origenFinal == "PLUS ULTRA" && origen != "PLUS ULTRA") {
                    origenFinal = origen;
                } else if (origenFinal != "PLUS ULTRA" && origen != "PLUS ULTRA") {
                    origenFinal = "MULATO";
                }
            }

            System.out.println(origenFinal);

        }

    }

    public static String devuelveOrigenPorAfijo(String afijo) {

        String nombreOrigen;

        switch (afijo) {
            case "IX":
                nombreOrigen = "GALO";
                break;
            case "US":
                nombreOrigen = "ROMANO";
                break;
            case "UM":
                nombreOrigen = "ROMANO";
                break;
            case "IC":
                nombreOrigen = "GODO";
                break;
            case "AS":
                nombreOrigen = "GRIEGO";
                break;
            case "AF":
                nombreOrigen = "NORMANDO";
                break;
            case "IS":
                nombreOrigen = "BRETON";
                break;
            case "OS":
                nombreOrigen = "BRETON";
                break;
            case "AX":
                nombreOrigen = "BRETON";
                break;
            case "EZ":
                nombreOrigen = "HISPANO";
                break;
            case "A":
                nombreOrigen = "INDIO";
                break;
            case "MAC":
                nombreOrigen = "PICTO";
                break;
            default:
                nombreOrigen = "PLUS ULTRA";
        }

        return nombreOrigen;

    }

}
