
package semana04;

import java.util.Scanner;

/**
 *Crear un programa que permita ingresar un número (1-10) entero. 
 * Visualizar el número en romanos.
 */
public class NumeroEnRomanos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario un número entre 1 y 10
        System.out.print("Ingresa un número entero (1-10): ");
        int numero = lectura.nextInt();

        // Determinar el número en romanos según el número ingresado
        String numeroRomano;

        switch (numero) {
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default:
                numeroRomano = "Número inválido. Debes ingresar un número entre 1 y 10.";
                break;
        }

        // Mostrar el número en romanos correspondiente
        System.out.println("El número en romanos es: " + numeroRomano);
    }
}