
package semana03;

import java.util.Scanner;

/**
 *
 * Determinar si un año es bisiesto
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar el año al usuario
        System.out.print("Ingresa un año: ");
        int año = lectura.nextInt();

        // Condicional para determinar si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto");
        } else {
            System.out.println("El año " + año + " no es bisiesto");
        }
    }
}
