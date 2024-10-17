
package semana09;

/**
 * @author HP USER
 */
import java.util.Scanner;

public class BusquedaNumero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        System.out.println("Ingrese 5 numeros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = lectura.nextInt();
        }
        
        System.out.print("Ingrese el numero a buscar: ");
        int numeroBuscar = lectura.nextInt();
        
        boolean encontrado = false;
        
        for (int numero : numeros) {
            if (numero == numeroBuscar) {
                encontrado = true;
                break; 
            }
        }
        
        if (encontrado) {
            System.out.println("Si existe el número " + numeroBuscar);
        } else {
            System.out.println("No existe el número " + numeroBuscar);
        }

    }
}
