
package semana09;

/**
 * @author HP USER
 */
import java.util.Scanner;

public class RegistroDePesos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();

        double[] pesos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + " (en kg): ");
            pesos[i] = lectura.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += pesos[i];
        }
        double promedio = suma / n;

        System.out.printf("El peso promedio de las %d personas es: %.2f kg%n", n, promedio);
    }
}

