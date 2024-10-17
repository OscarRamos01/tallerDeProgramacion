package semana01;
import java.util.Scanner;

/**
 * @author Oscar Ramos
 * 
 * Crear un programa que permita registrar cinco sueldos de empleados, 
 * Determinar el total de sueldos y el sueldo promedio.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        double sueldo1,sueldo2,sueldo3,sueldo4,sueldo5;
        double totalSueldos,promedioSueldos;
        // Creando el objeto de lectura
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el 1er sueldo: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingrese el 2do sueldo: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese el 3er sueldo: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese el 4to sueldo: ");
        sueldo4 = lectura.nextDouble();
        System.out.print("Ingrese el 5to sueldo: ");
        sueldo5 = lectura.nextDouble();
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedioSueldos = totalSueldos / 5;
        System.out.println("Total de Sueldo: " + totalSueldos);
        System.out.println("Promedio de sueldo: " + promedioSueldos);
    }
}