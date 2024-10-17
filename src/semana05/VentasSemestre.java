
package semana05;

import java.util.Scanner;

/**
 * @author Oscar Ramos
 */
public class VentasSemestre {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Variables para almacenar las ventas de cada mes
        double venta1, venta2, venta3, venta4, venta5, venta6;
        double totalVentas, promedioVentas;

        // Ingresar las ventas del primer semestre
        System.out.print("Ingrese la venta1: ");
        venta1 = lectura.nextDouble();

        System.out.print("Ingrese la venta2: ");
        venta2 = lectura.nextDouble();

        System.out.print("Ingrese la venta3: ");
        venta3 = lectura.nextDouble();

        System.out.print("Ingrese la venta4: ");
        venta4 = lectura.nextDouble();

        System.out.print("Ingrese la venta5: ");
        venta5 = lectura.nextDouble();

        System.out.print("Ingrese la venta6: ");
        venta6 = lectura.nextDouble();

        // Calcular el total de ventas
        totalVentas = venta1 + venta2 + venta3 + venta4 + venta5 + venta6;

        // Calcular el promedio de ventas
        promedioVentas = totalVentas / 6;

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("Venta Total = " + totalVentas);
        System.out.println("Promedio Ventas = " + promedioVentas);
    }
}