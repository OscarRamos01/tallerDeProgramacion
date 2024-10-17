
package semana08;

/**
 *Crear un programa en Java que permita ingresar su nombre, sexo y talla de n
 *personas. Visualizar la cantidad de persona de diferente sexo y la persona que tiene la
 *talla mayor.
 */
import java.util.Scanner;

public class PersonasTallas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cpsm = 0, cpsf = 0;
        double tallaMayor = 0;
        String nombreMayorTalla = "";

        System.out.print("Ingrese la cantidad de personas (n): ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el nombre de la persona " + i + ": ");
            String nombre = scanner.next(); 

            System.out.print("Ingrese el sexo (m/f) de " + nombre + ": ");
            char sexo = scanner.next().toLowerCase().charAt(0); 

            System.out.print("Ingrese la talla (en metros) de " + nombre + ": ");
            double talla = scanner.nextDouble(); 


            if (sexo == 'm') {
                cpsm++;
            } else if (sexo == 'f') {
                cpsf++;
            }

            if (talla > tallaMayor) {
                tallaMayor = talla;
                nombreMayorTalla = nombre;
            }
        }

        System.out.println("Cantidad de personas de sexo masculino = " + cpsm);
        System.out.println("Cantidad de personas de sexo femenino = " + cpsf);
        System.out.println("Nombre de la persona con mayor talla = " + nombreMayorTalla);
        System.out.println("Talla mayor = " + tallaMayor);
    }
}
