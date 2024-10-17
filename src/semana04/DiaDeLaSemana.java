
package semana04;

import java.util.Scanner;
/**
 *Crear un programa en Java que permita ingresar un número entero (1-7). 
 * Visualizar el nombre del día de la semana.
 */
public class DiaDeLaSemana {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 7
        System.out.print("Ingresa un número entero (1-7): ");
        int numero = lectura.nextInt();

        // Determinar el día de la semana en base al número ingresado
        switch (numero) {
            case 1:
                System.out.println("El día es Lunes.");
                break;
            case 2:
                System.out.println("El día es Martes.");
                break;
            case 3:
                System.out.println("El día es Miércoles.");
                break;
            case 4:
                System.out.println("El día es Jueves.");
                break;
            case 5:
                System.out.println("El día es Viernes.");
                break;
            case 6:
                System.out.println("El día es Sábado.");
                break;
            case 7:
                System.out.println("El día es Domingo.");
                break;
            default:
                System.out.println("Número inválido. Debes ingresar un número entre 1 y 7.");
                break;
        }
    }
}