package semana02;

/**
 * Escribir un programa que imprima un boleto
 * de viaje interprovincial.
 */

import java.util.Scanner;

public class Ejercicio01 {   
    public static void main(String[] args) {
        String nombrePasajero, ciudadOrigen, ciudadDestino, fechaViaje, numeroAsiento;
        double precioBoleto=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("********** BOLETO DE VIAJE INTERPROVINCIAL **********");
        System.out.print("Nombre del pasajero: "); 
        nombrePasajero = lectura.next();       
        System.out.print("Ciudad de origen: "); 
        ciudadOrigen = lectura.next();
        System.out.print("Ciudad de destino: " ); 
        ciudadDestino = lectura.next();
        System.out.print("Fecha de viaje: " ); 
        fechaViaje = lectura.next();
        System.out.print("Número de asiento: " ); 
        numeroAsiento = lectura.next();
        System.out.println("*****************************************************");
        System.out.print("Precio del boleto: " ); 
        precioBoleto = lectura.nextDouble();
        System.out.println("*****************************************************");
        System.out.println("¡Gracias por elegir nuestro servicio! Buen viaje.");
    }
}