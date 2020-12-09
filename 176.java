/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_ar176_campominas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asther
 */
public class Ejercicio4_AR176_CampoMinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ancho, alto;

        do {
            ancho = teclado.nextInt();
            alto = teclado.nextInt();
            if (ancho != 0 && alto != 0) {
                //Crear array para guardar la información de cada fila 
                ArrayList<String> lineas = new ArrayList<>();

                for (int i = 0; i < alto; i++) {
                    String linea = teclado.next();
                    lineas.add(linea);
                }

                //Crear array de char para guardar cada caracter. 
                char[] lineaDeCaracteres = new char[(ancho * alto)];

                // Crear array multidimensional
                char[][] campoMinas = new char[alto][ancho];

                //Crear un for para descomponer las filas y guardar en array
                for (int i = 0; i < lineas.size(); i++) {
                    lineaDeCaracteres = lineas.get(i).toCharArray();

                    //Insertar valores de array caracter a multidimensional
                    for (int j = 0; j < lineaDeCaracteres.length; j++) {
                        campoMinas[i][j] = lineaDeCaracteres[j];
                    }
                }

                //comprobar elementos alrededor de elemento actual
                char mina = '*';
                char libre = '-';

                int celdasVaciasConMinasAlrededor = 0;

                for (int i = 0; i < campoMinas.length; i++) {

                    for (int j = 0; j < ancho; j++) {
                        int contMinas = 0;
                        if (i + 1 < alto && i - 1 >= 0 && j + 1 < ancho && j - 1 >= 0) {
                            if (campoMinas[i][j] == libre) {

                                if (campoMinas[i - 1][j - 1] == mina) { //esqSupIzq
                                    contMinas++;
                                }

                                if (campoMinas[i - 1][j] == mina) { //arriba
                                    contMinas++;
                                }

                                if (campoMinas[i - 1][j + 1] == mina) { //esqSupDcha
                                    contMinas++;
                                }

                                if (campoMinas[i][j - 1] == mina) { //izq
                                    contMinas++;
                                }

                                if (campoMinas[i][j + 1] == mina) { // derecha
                                    contMinas++;
                                }

                                if (campoMinas[i + 1][j - 1] == mina) { //esqInfIzq
                                    contMinas++;
                                }

                                if (campoMinas[i + 1][j] == mina) { //abajo
                                    contMinas++;
                                }

                                if (campoMinas[i + 1][j + 1] == mina) { //esqInfDcha
                                    contMinas++;
                                }

                            }
                        }
                        if (contMinas >= 6) {
                            celdasVaciasConMinasAlrededor++;
                        }
                    }

                }

                System.out.println(celdasVaciasConMinasAlrededor);
            }
        } while (ancho != 0 && alto != 0);

    }

}
