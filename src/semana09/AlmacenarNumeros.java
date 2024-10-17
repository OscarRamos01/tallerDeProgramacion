
package semana09;

/**
 *
 * @author HP USER
 */

import java.util.Scanner;

public class AlmacenarNumeros {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = lectura.nextInt();
        }

        System.out.println("Los números ingresados son:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Número en la posición " + (i + 1) + ": " + numeros[i]);
        }

    }
}
