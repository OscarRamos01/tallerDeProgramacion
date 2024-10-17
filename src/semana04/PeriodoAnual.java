
package semana04;

import java.util.Scanner;

/**
 *Crear un programa que permita ingresar un número (1,2,3,4,6,12) entero. 
 * Visualizar el nombre del periodo anual
 */
public class PeriodoAnual {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1, 2, 3, 4, 6, 12
        System.out.print("Ingresa un número entero (1, 2, 3, 4, 6, 12): ");
        int numero = lectura.nextInt();

        // Determinar el periodo anual en base al número ingresado
        String periodo;

        switch (numero) {
            case 1:
                periodo = "Mensual";
                break;
            case 2:
                periodo = "Bimestral";
                break;
            case 3:
                periodo = "Trimestral";
                break;
            case 4:
                periodo = "Cuatrimestral";
                break;
            case 6:
                periodo = "Semestral";
                break;
            case 12:
                periodo = "Anual";
                break;
            default:
                periodo = "Número inválido. Debes ingresar un número válido (1, 2, 3, 4, 6, 12).";
                break;
        }

        // Mostrar el nombre del periodo anual correspondiente
        System.out.println("El período es: " + periodo);
    }
}
