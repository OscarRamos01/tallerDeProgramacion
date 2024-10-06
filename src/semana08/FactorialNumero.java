
package semana08;

/**
 *Escribe un programa en Java que solicite al usuario un número entero positivo
 *y calcule el factorial de ese número. El factorial de un número n se define 
 *como n! = n * (n-1) * (n-2) * ... * 1.
 */

import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
