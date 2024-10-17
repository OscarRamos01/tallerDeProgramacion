package semana03;
import java.util.Scanner;

/**
 *
 * Escribe un programa que calcule la tarifa de estacionamiento de un vehículo. 
 * Las primeras dos horas cuestan $5 cada una, 
 * las siguientes tres horas cuestan $4 cada una, 
 * y cualquier hora adicional cuesta $3. 
 * Si el vehículo ha estado estacionado menos de una hora, la tarifa mínima es de $5.
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar el número de horas al usuario
        System.out.print("Ingresa el numero de horas que el vehiculo estuvo estacionado: ");
        int horas = lectura.nextInt();
        int tarifa;

        // Condicional para calcular la tarifa de estacionamiento
        if (horas <= 2) {
            tarifa = 5 * horas;
        } else if (horas <= 5) {
            tarifa = 5 * 2 + 4 * (horas - 2);
        } else {
            tarifa = 5 * 2 + 4 * 3 + 3 * (horas - 5);
        }

        // Imprimir la tarifa mínima si las horas son menos de una
        if (horas < 1) {
            tarifa = 5;
        }

        System.out.println("La tarifa de estacionamiento es: $" + tarifa);
    }
}