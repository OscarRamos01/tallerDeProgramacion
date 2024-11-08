/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana11;

/**
 *
 * @author Oscar Ramos1
 */
import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumaPares = 0;
        int cantidadImpares = 0;

        // Llenado de la matriz
        System.out.println("Ingrese los números enteros para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = lectura.nextInt();
            }
        }

        // Procesamiento de pares e impares
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares += matriz[i][j];
                } else {
                    cantidadImpares++;
                }
            }
        }

        // Resultados
        System.out.println("Suma de los números pares (sp): " + sumaPares);
        System.out.println("Cantidad de números impares (ci): " + cantidadImpares);

    }
}
