
package semana08;

/**
 *Crear un programa en Java que permita ingresar las ventas del primer semestre del 
 *año. Visualizar el total, promedio de venta y el mes con la venta mayor.
 */
import java.util.Scanner;

public class ventasSemestrales {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int totalVentas = 0, mayorVenta = 0, ventaActual;
        String mesMayorVenta = "", mesActual = "";

        for (int i = 1; i <= 6; i++) {
            mesActual = switch (i) {
                case 1 -> "Enero";
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";
                default -> "";
            };

            System.out.print("Ingrese las ventas de " + mesActual + ": ");
            ventaActual = lectura.nextInt();
            
            totalVentas += ventaActual;
            if (ventaActual > mayorVenta) {
                mayorVenta = ventaActual;
                mesMayorVenta = mesActual;
            }
        }

        System.out.println("\nTotal de ventas (tv) = " + totalVentas);
        System.out.println("Promedio de ventas (pv) = " + totalVentas / 6.0);
        System.out.println("Mes con mayor venta (mes) = " + mesMayorVenta);
        System.out.println("Venta mayor (vmy) = " + mayorVenta);
    }
}

