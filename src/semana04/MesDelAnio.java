
package semana04;

import java.util.Scanner;

/**
 *Diseñar un programa que permita ingresar un número entero (1-12). 
 * Determinar el nombre del mes del año.
 */
public class MesDelAnio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 12
        System.out.print("Ingresa un número entero (1-12): ");
        int numero = lectura.nextInt();

        // Determinar el mes del año en base al número ingresado
        switch (numero) {
            case 1:
                System.out.println("El mes es Enero.");
                break;
            case 2:
                System.out.println("El mes es Febrero.");
                break;
            case 3:
                System.out.println("El mes es Marzo.");
                break;
            case 4:
                System.out.println("El mes es Abril.");
                break;
            case 5:
                System.out.println("El mes es Mayo.");
                break;
            case 6:
                System.out.println("El mes es Junio.");
                break;
            case 7:
                System.out.println("El mes es Julio.");
                break;
            case 8:
                System.out.println("El mes es Agosto.");
                break;
            case 9:
                System.out.println("El mes es Septiembre.");
                break;
            case 10:
                System.out.println("El mes es Octubre.");
                break;
            case 11:
                System.out.println("El mes es Noviembre.");
                break;
            case 12:
                System.out.println("El mes es Diciembre.");
                break;
            default:
                System.out.println("Número inválido. Debes ingresar un número entre 1 y 12.");
                break;
        }
    }
}