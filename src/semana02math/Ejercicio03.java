
package semana02math;

/**
 * calcula el área de un triángulo dado por las longitudes de sus tres lados 
𝑎,𝑏 y c utilizando la fórmula de Herón:
* 
* Donde s es el semiperímetro:
* 
 */

import java.util.Scanner;

public class Ejercicio03 { 
    public static void main(String[] args) {
        double a ,b ,c ,s , area;
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresa la longitud del lado a: ");
        a = lectura.nextDouble();
        System.out.print("Ingresa la longitud del lado b: ");
        b = lectura.nextDouble();
        System.out.print("Ingresa la longitud del lado c: ");
        c = lectura.nextDouble();

        // Calcular el semiperímetro
        s = (a + b + c) / 2;
        // Calcular el área usando la fórmula de Herón
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("El Area del triangulo es: " + area);
    }
}