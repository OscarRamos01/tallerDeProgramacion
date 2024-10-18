
package semana10;

/**
 * @author HP USER
 */

import java.util.Scanner;

public class BusquedaNombres {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        String[] personas = new String[5];

        for (int i = 0; i < personas.length; i++) {
            System.out.print("Ingresa el nombre de la persona " + (i + 1) + ": ");
            personas[i] = lectura.nextLine();
        }

        System.out.print("Ingresa el nombre a buscar: ");
        String buscarNombre = lectura.nextLine();

        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equalsIgnoreCase(buscarNombre)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Si existe " + buscarNombre + " en la posición " + (posicion + 1));
        } else {
            System.out.println("No existe " + buscarNombre + " en el arreglo.");
        }
    }
}

