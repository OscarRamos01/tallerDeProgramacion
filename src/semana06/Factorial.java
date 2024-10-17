
package semana06;

/**
 *Calcular el factorial de un número
 */
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = lectura.nextInt();

        int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
