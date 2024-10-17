
package semana02;

/**
 *Escribir un programa que imprima una boleta
 *de pago, con descuentos, subtotal y total.
 */

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        double salarioBase;
        float porcentajeImpuestos,porcentajeSeguroSocial, porcentajeOtrosDescuentos;
        Scanner lectura = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingresa tu nombre: ");
        String nombre = lectura.nextLine().toUpperCase();

        System.out.print("Ingresa tu salario base: ");
        salarioBase = lectura.nextDouble();

        System.out.print("Ingresa el porcentaje de descuento por impuestos: ");
        porcentajeImpuestos = lectura.nextFloat();

        System.out.print("Ingresa el porcentaje de descuento por seguro social: ");
        porcentajeSeguroSocial = lectura.nextFloat();

        System.out.print("Ingresa otros descuentos en porcentaje: ");
        porcentajeOtrosDescuentos = lectura.nextFloat();

        // Calcular los descuentos
        double descuentoImpuestos = salarioBase * (porcentajeImpuestos / 100);
        double descuentoSeguroSocial = salarioBase * (porcentajeSeguroSocial / 100);
        double otrosDescuentos = salarioBase * (porcentajeOtrosDescuentos / 100);

        // Calcular el subtotal y total
        double subtotal = salarioBase - (descuentoImpuestos + descuentoSeguroSocial + otrosDescuentos);
        double total = salarioBase - subtotal;

        // Imprimir boleta de pago
        System.out.println("\n********** BOLETA DE PAGO **********");
        System.out.println("Nombre: " + nombre);
        System.out.printf("Salario base: %.2f\n", salarioBase);
        System.out.println("------------------------------------");
        System.out.printf("Descuento por impuestos: %.2f\n", descuentoImpuestos);
        System.out.printf("Descuento por seguro social: %.2f\n", descuentoSeguroSocial);
        System.out.printf("Otros descuentos: %.2f\n", otrosDescuentos);
        System.out.printf("Total descuentos : %.2f\n", subtotal);
        System.out.println("------------------------------------");        
        System.out.printf("Total a pagar: %.2f\n", total);
        System.out.println("***********************************");
    }
}