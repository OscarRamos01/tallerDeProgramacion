
package semana04;

import java.util.Scanner;

/**
 *Crear un programa que permita ingresar un número (1-6) entero. 
 * Visualizar el número en inglés.
 */
public class NumeroEnIngles {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 6
        System.out.print("Ingresa un número entero (1-6): ");
        int numero = lectura.nextInt();

        // Determinar el número en inglés según el número ingresado
        String numeroEnIngles;

        switch (numero) {
            case 1:
                numeroEnIngles = "One";
                break;
            case 2:
                numeroEnIngles = "Two";
                break;
            case 3:
                numeroEnIngles = "Three";
                break;
            case 4:
                numeroEnIngles = "Four";
                break;
            case 5:
                numeroEnIngles = "Five";
                break;
            case 6:
                numeroEnIngles = "Six";
                break;
            default:
                numeroEnIngles = "Número inválido. Debes ingresar un número entre 1 y 6.";
                break;
        }

        // Mostrar el número en inglés correspondiente
        System.out.println("El número en inglés es: " + numeroEnIngles);
    }
}