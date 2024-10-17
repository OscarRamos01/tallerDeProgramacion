
package semana07;

/**
 *Crear un programa en Java que permita ingresar el nombre de los alumnos y sus tres notas de cada uno, 
  preguntar al usuario si desea continuar registrando datos. Visualizar el nombre del alumno con 
  el mayor promedio obtenido.
 */
import java.util.Scanner;

public class calcularPromedio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String nombreMejorAlumno = "";
        double mayorPromedio = 0;
        String continuar;

        do {
            // Ingresar nombre del alumno
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = lectura.nextLine();

            // Ingresar las tres notas
            System.out.print("Ingrese la nota 1: ");
            double nota1 = lectura.nextDouble();

            System.out.print("Ingrese la nota 2: ");
            double nota2 = lectura.nextDouble();

            System.out.print("Ingrese la nota 3: ");
            double nota3 = lectura.nextDouble();

            // Calcular el promedio
            double promedio = (nota1 + nota2 + nota3) / 3;
            System.out.printf("Promedio de %s: %.2f%n", nombre, promedio);

            // Verificar si este alumno tiene el mayor promedio
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                nombreMejorAlumno = nombre;
            }

            // Preguntar si desea continuar
            System.out.print("¿Desea continuar registrando datos? (si/no): ");
            lectura.nextLine(); // Limpiar buffer
            continuar = lectura.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        // Mostrar el mejor alumno
        if (!nombreMejorAlumno.isEmpty()) {
            System.out.println("El alumno con el mayor promedio es: " + nombreMejorAlumno);
            System.out.printf("Promedio: %.2f%n", mayorPromedio);
        } else {
            System.out.println("No se registraron alumnos.");
        }
    }
}
