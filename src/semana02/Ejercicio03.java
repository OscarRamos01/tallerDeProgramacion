
package semana02;

/**
 *
 * Escribir un programa que imprima un ticket de operación de un agente bancario.
 * 
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        String nombre,tipoOperacion;
        double monto;
        long numeroCuenta;
        Scanner Lectura = new Scanner(System.in);

        // Solicitar datos de la operación
        System.out.print("Ingresa tu nombre: ");
        nombre = Lectura.nextLine().toUpperCase();

        System.out.print("Ingresa el tipo de operacion (DEPOSITO/RETIRO): ");
        tipoOperacion = Lectura.nextLine().toUpperCase();

        System.out.print("Ingresa el monto de la operacion: ");
        monto = Lectura.nextDouble();

        System.out.print("Ingresa el numero de cuenta: ");
        numeroCuenta = Lectura.nextLong();

        System.out.print("Ingresa la fecha de la operacion (dd/mm/yyyy): ");
        String fecha = Lectura.next().toLowerCase();

        // Imprimir ticket de operación bancaria
        System.out.println("\n********** TICKET DE OPERACION BANCARIA **********");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de operacion: " + tipoOperacion);
        System.out.printf("Monto de la operacion: %.2f\n", monto);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Fecha de operacion: " + fecha);
        System.out.println("*************************************************");
    }
}