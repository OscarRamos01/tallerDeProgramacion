
package semana06;

/**
 *Contar los números pares en un rango dado
 */
import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int inicio = lectura.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int fin = lectura.nextInt();

        int contador = 0;
        int i = inicio;

        while (i <= fin) {
            if (i % 2 == 0) {
                contador++;
            }
            i++;
        }

        System.out.println("Hay " + contador + " números pares en el rango de " + inicio + " a " + fin);
    }
}
