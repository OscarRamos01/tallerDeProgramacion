
package semana08;

/**
 *Crea un programa que solicite al usuario un número entero y muestre su tabla
 *de multiplicar del 1 al 10.
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
