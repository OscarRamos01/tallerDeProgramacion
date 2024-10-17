
package semana09;

/**
 * @author HP USER
 */
import java.util.Scanner;

public class RegistroDeIngresos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();

        double[] ingresos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso económico de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
        }

        double total = 0;
        double mayorIngreso = ingresos[0];
        double menorIngreso = ingresos[0];

        for (int i = 0; i < n; i++) {
            total += ingresos[i];

            if (ingresos[i] > mayorIngreso) {
                mayorIngreso = ingresos[i];
            }

            if (ingresos[i] < menorIngreso) {
                menorIngreso = ingresos[i];
            }
        }

        double promedio = total / n;

        System.out.printf("El total de los ingresos es: %.2f%n", total);
        System.out.printf("El ingreso promedio es: %.2f%n", promedio);
        System.out.printf("El ingreso mayor es: %.2f%n", mayorIngreso);
        System.out.printf("El ingreso menor es: %.2f%n", menorIngreso);

    }
}
