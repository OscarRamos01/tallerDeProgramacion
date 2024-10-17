
package semana04;

import java.util.Scanner;

/**
 *Diseñar un programa que permita ingresar un número entero (1-12). 
 *Determinar el nombre de la estación del año.
 */
public class EstacionDelAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 12
        System.out.print("Ingresa un número entero (1-12): ");
        int mes = scanner.nextInt();

        // Determinar la estación del año en base al mes ingresado
        String estacion;

        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Verano";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Otoño";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Invierno";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Número inválido. Debes ingresar un número entre 1 y 12.";
                break;
        }

        // Mostrar la estación correspondiente
        System.out.println("La estación del año es: " + estacion);
    }
}