
package semana05;

import java.util.Scanner;

/**
 * @author Oscar Ramos
 */
public class InteresCompuesto {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Variables
        double capitalInicial, tasaInteres, periodoMeses, valorFuturo, interes;

        // Ingresar el capital inicial, tasa de interés y periodo
        System.out.print("Ingrese el capital inicial: ");
        capitalInicial = lectura.nextDouble();

        System.out.print("Ingrese la tasa de interés: ");
        tasaInteres = lectura.nextDouble() / 100; // Convertimos el porcentaje a decimal

        System.out.print("Ingrese el periodo en meses: ");
        periodoMeses = lectura.nextDouble();

        // Calcular el valor futuro
        valorFuturo = capitalInicial * Math.pow(1 + tasaInteres, periodoMeses);

        // Calcular el interés
        interes = valorFuturo - capitalInicial;

        // Mostrar los resultados
        System.out.printf("vf = %.2f\n", valorFuturo);
        System.out.printf("I = %.2f\n", interes);
    }
}
