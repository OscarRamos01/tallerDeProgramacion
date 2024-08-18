package semana01;
import java.util.Scanner;
/**
 * @author Oscar Ramos
 * 
 * Crear un programa que permita registrar el nombre de un 
 * cliente, producto, precio y cantidad. Determinar el subtotal,
 * IGV y total a pagar.
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        String empleado, producto;
        double precio, igv, subtotal, total;
        int cantidad;
        // Creando el objeto de lectura
        Scanner lectura = new Scanner(System.in);
        System.out.print("Nombre del Cliente: ");
        empleado = lectura.next();
        System.out.print("Ingrese el Producto: ");
        producto = lectura.next();
        System.out.print("Ingrese el Precio del Producto: ");
        precio = lectura.nextDouble();
        System.out.print("Ingrese la cantidad de Productos: ");
        cantidad = lectura.nextInt();
        subtotal = precio * cantidad;
        igv = subtotal * 0.18;
        total = subtotal - igv;
        System.out.println("El subtojtal es: " + subtotal);
        System.out.println("El IGV es: " + igv);
        System.out.println("El total es: " + total);
    }
    
}
