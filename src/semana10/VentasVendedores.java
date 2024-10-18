
package semana10;

/**
 * @author HP USER
 */

import java.util.Scanner;

public class VentasVendedores {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        String nombreVendedorMenor = "";
        int totalMenor = Integer.MAX_VALUE;
        String opcion;
        
        do {
            System.out.print("Ingresa el nombre del vendedor: ");
            String nombreVendedor = lectura.next();
            
            System.out.print("Ingresa la primera venta: ");
            int venta1 = lectura.nextInt();
            
            System.out.print("Ingresa la segunda venta: ");
            int venta2 = lectura.nextInt();
            
            System.out.print("Ingresa la tercera venta: ");
            int venta3 = lectura.nextInt();
            
            int totalVentas = venta1 + venta2 + venta3;
            System.out.println("Total de ventas de " + nombreVendedor + ": " + totalVentas);
            
            if (totalVentas < totalMenor) {
                totalMenor = totalVentas;
                nombreVendedorMenor = nombreVendedor;
            }
            
            System.out.print("¿Deseas ingresar otro vendedor? (si/no): ");
            opcion = lectura.next();
        } while (opcion.equalsIgnoreCase("si"));
        
        System.out.println("El vendedor con el menor total de ventas es: " + nombreVendedorMenor);
        System.out.println("Total de ventas: " + totalMenor);
    }
}
