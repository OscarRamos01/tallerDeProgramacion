
package semana02math;

/**
 *Ejercicio 1: Calcular la distancia entre dos puntos en un plano cartesiano
Este ejercicio calcula la distancia entre dos puntos 
(𝑥1,𝑦1) y (x2,y2) en un plano cartesiano utilizando la fórmula de la distancia euclidiana.
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args ){
        
    Scanner scanner = new Scanner(System.in);

        // Ingresar coordenadas del primer punto
        System.out.print("Ingresa la coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y1: ");
        double y1 = scanner.nextDouble();

        // Ingresar coordenadas del segundo punto
        System.out.print("Ingresa la coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingresa la coordenada y2: ");
        double y2 = scanner.nextDouble();

        // Calcular la distancia
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Imprimir la distancia
        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + distancia);
    }
}