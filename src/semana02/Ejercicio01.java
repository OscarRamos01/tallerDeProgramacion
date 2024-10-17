package semana02;

/**
 * Escribir un programa que imprima un boleto
 * de viaje interprovincial.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] arg){
        String nombre,destino,fecha;
        int numeroAsiento;
        float precio;
        Scanner lectura = new Scanner(System.in);

        // Solicitar datos del viaje
        System.out.print("Ingresa tu nombre: ");
        nombre = lectura.nextLine().toUpperCase();

        System.out.print("Ingresa tu destino: ");
        destino = lectura.nextLine().toUpperCase();

        System.out.print("Ingresa el número de asiento: ");
        numeroAsiento = lectura.nextInt();

        System.out.print("Ingresa el precio del boleto: ");
        precio = lectura.nextFloat();

        System.out.print("Ingresa la fecha del viaje (dd/mm/yyyy): ");
        fecha = lectura.next().toLowerCase();

        // Imprimir boleto de viaje
        System.out.println("\n********** BOLETO DE VIAJE **********");
        System.out.println("Nombre del pasajero: " + nombre);
        System.out.println("Destino: " + destino);
        System.out.println("Número de asiento: " + numeroAsiento);
        System.out.printf("Precio del boleto: %.2f\n", precio);
        System.out.println("Fecha de viaje: " + fecha);
        System.out.println("*************************************");
    }
}