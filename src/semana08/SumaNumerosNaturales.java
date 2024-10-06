
package semana08;

/**
 *Escribe un programa en Java que solicite al usuario un número entero positivo n
 *y calcule la suma de los primeros n números naturales.
 */
import java.util.Scanner;

public class SumaNumerosNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el valor de n
        System.out.print("Ingrese un numero entero positivo (n): ");
        int n = scanner.nextInt();

        int suma = 0;

        // Usar un ciclo for para calcular la suma de los primeros n números
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + suma);
    }
}
