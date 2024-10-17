
package semana09;

/**
 *
 * @author HP USER
 */
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();

        double[] compras = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
        }

        double total = 0;
        double mayorCompra = compras[0];
        double menorCompra = compras[0];

        for (int i = 0; i < n; i++) {
            total += compras[i];

            if (compras[i] > mayorCompra) {
                mayorCompra = compras[i];
            }

            // Verificar la compra menor
            if (compras[i] < menorCompra) {
                menorCompra = compras[i];
            }
        }

        double promedio = total / n;

        // Mostrar el total, el promedio, la compra mayor y la compra menor
        System.out.printf("El total de las compras es: %.2f%n", total);
        System.out.printf("El promedio de las compras es: %.2f%n", promedio);
        System.out.printf("La compra mayor es: %.2f%n", mayorCompra);
        System.out.printf("La compra menor es: %.2f%n", menorCompra);

    }
}
