
package semana02math;

/**
 *Ejercicio 1: Calcular la distancia entre dos puntos en un plano cartesiano
 *(𝑥1,𝑦1) y (x2,y2) en un plano cartesiano utilizando la fórmula de la distancia
 */

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args ){
    int x1,y1,x2,y2;
    double distancia;
    
    Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresa la coordenada x1: ");
        x1 = lectura.nextInt();
        System.out.print("Ingresa la coordenada y1: ");
        y1 = lectura.nextInt();

        System.out.print("Ingresa la coordenada x2: ");
        x2 = lectura.nextInt();
        System.out.print("Ingresa la coordenada y2: ");
        y2 = lectura.nextInt();

        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("La distancia entre los puntos (" + x1 + ", " + y1 + ") "
                + "y (" + x2 + ", " + y2 + ") es: " + distancia);
    }
}