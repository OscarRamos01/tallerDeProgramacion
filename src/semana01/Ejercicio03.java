package semana01;
import java.util.Scanner;
/**
 * @author Oscar Ramos
 * 
 * 3.	Crear un programa que permita registrar el nombre del empleado, cargo, 
 * ingreso y gasto mensual de un empleado. 
 * Determinar el ahorro mensual, bimestral, semestral y anual.
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String nombre,cargo;
        double ingresoMensual, gastoMensual,ahorroMensual, 
               ahorroBimestral,ahorroSemestral,ahorroAnual;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = lectura.next();
        System.out.print("Ingrese el cargo del empleado: ");
        cargo = lectura.next();
        System.out.print("Ingrese el ingreso mensual del empleado: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese el gasto mensual del empleado: ");
        gastoMensual = lectura.nextDouble();
        ahorroMensual = ingresoMensual - gastoMensual;
        ahorroBimestral = ahorroMensual * 2;
        ahorroSemestral = ahorroMensual * 6;
        ahorroAnual = ahorroMensual * 12;
        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro bimestral: " + ahorroBimestral);
        System.out.println("Ahorro semestral: " + ahorroSemestral);
        System.out.println("Ahorro anual: " + ahorroAnual);
    }
}