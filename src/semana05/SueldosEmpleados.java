
package semana05;

import java.util.Scanner;

/**
 * @author Oscar Ramos
 */
public class SueldosEmpleados {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Variables para almacenar los sueldos
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldos, promedioSueldos, menorSueldo;

        // Ingresar los cinco sueldos
        System.out.print("Ingrese el sueldo1: ");
        sueldo1 = lectura.nextDouble();

        System.out.print("Ingrese el sueldo2: ");
        sueldo2 = lectura.nextDouble();

        System.out.print("Ingrese el sueldo3: ");
        sueldo3 = lectura.nextDouble();

        System.out.print("Ingrese el sueldo4: ");
        sueldo4 = lectura.nextDouble();

        System.out.print("Ingrese el sueldo5: ");
        sueldo5 = lectura.nextDouble();

        // Calcular el total de los sueldos
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;

        // Calcular el promedio de los sueldos
        promedioSueldos = totalSueldos / 5;

        // Encontrar el sueldo menor
        menorSueldo = sueldo1;

        if (sueldo2 < menorSueldo) {
            menorSueldo = sueldo2;
        }
        if (sueldo3 < menorSueldo) {
            menorSueldo = sueldo3;
        }
        if (sueldo4 < menorSueldo) {
            menorSueldo = sueldo4;
        }
        if (sueldo5 < menorSueldo) {
            menorSueldo = sueldo5;
        }

        // Mostrar los resultados
        System.out.println("Resultados:");
        System.out.println("totalsueldo: " + totalSueldos);
        System.out.println("promediosueldo: " + promedioSueldos);
        System.out.println("menor = " + menorSueldo);
    }
}