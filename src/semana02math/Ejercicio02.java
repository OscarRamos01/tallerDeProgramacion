
package semana02math;

/**
 * Redondear un número al múltiplo más cercano de 10
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        int numero, redondeado;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        numero = lectura.nextInt();

        redondeado = Math.round(numero / 10.0f) * 10;

        System.out.println("El numero " + numero + " redondeado al multiplo "
                + "de 10 mas cercano es: " + redondeado);
    }
}137