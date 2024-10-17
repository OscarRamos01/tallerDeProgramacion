
package semana09;

/**
 * @author HP USER
 */

import java.util.Scanner;

public class BusquedaDeNombres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }

        System.out.print("Ingrese el nombre que desea buscar: ");
        String nombreBuscado = lectura.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe en la posición " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }

    }
}

