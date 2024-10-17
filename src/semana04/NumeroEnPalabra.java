
package semana04;

import java.util.Scanner;

/**
 *Crear un programa que permita ingresar un número (1-5) entero. 
 * Visualizar el número ingresado en palabra.
 */
public class NumeroEnPalabra {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 5
        System.out.print("Ingresa un número entero (1-5): ");
        int numero = lectura.nextInt();

        // Determinar el nombre en palabra según el número ingresado
        String palabra;

        switch (numero) {
            case 1:
                palabra = "Uno";
                break;
            case 2:
                palabra = "Dos";
                break;
            case 3:
                palabra = "Tres";
                break;
            case 4:
                palabra = "Cuatro";
                break;
            case 5:
                palabra = "Cinco";
                break;
            default:
                palabra = "Número inválido. Debes ingresar un número entre 1 y 5.";
                break;
        }

        // Mostrar el número en palabra correspondiente
        System.out.println("El número ingresado es: " + palabra);
    }
}