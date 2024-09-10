
package semana04;

import java.util.Scanner;

/**
 *1.- Crear un programa en Java que permita ingresar dos números enteros y una 
 * opción del (1,2,3,4), realizar una operación aritmética de suma, resta, 
 * multiplicación y división. Visualizar el resultado de dicha operación.*/

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar al usuario los dos números enteros
        System.out.print("Ingresa el primer número: ");
        int num1 = lectura.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = lectura.nextInt();

        // Mostrar las opciones disponibles
        System.out.println("Elige una operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");

        // Leer la opción seleccionada
        System.out.print("Ingresa tu opción (1, 2, 3 o 4): ");
        int opcion = lectura.nextInt();

        // Variable para almacenar el resultado
        double resultado = 0;

        // Realizar la operación seleccionada
        switch (opcion) {
            case 1: // Suma
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2: // Resta
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3: // Multiplicación
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4: // División
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida. Debes elegir entre 1, 2, 3 o 4.");
                break;
        }
    }
}