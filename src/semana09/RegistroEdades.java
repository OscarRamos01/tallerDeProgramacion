
package semana09;

/**
 * @author HP USER
 */
import java.util.Scanner;

public class RegistroEdades {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar el número de alumnos
        System.out.print("Ingrese el número de alumnos: ");
        int n = lectura.nextInt();
        
        int[] edades = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            edades[i] = lectura.nextInt();
        }
        
        double suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        double promedio = suma / n;

        // Mostrar el resultado
        System.out.printf("La edad promedio es: %.2f%n", promedio);
        
    }
}
