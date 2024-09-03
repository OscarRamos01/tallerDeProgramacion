package semana03;
import java.util.Scanner;
/**
 *
 * Determinar el tipo de triángulo
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Solicitar las longitudes de los lados al usuario
        System.out.print("Ingresa la longitud del lado 1: ");
        int lado1 = lectura.nextInt();

        System.out.print("Ingresa la longitud del lado 2: ");
        int lado2 = lectura.nextInt();

        System.out.print("Ingresa la longitud del lado 3: ");
        int lado3 = lectura.nextInt();

        // Verificar si los lados forman un triángulo válido
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            // Determinar el tipo de triángulo
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es isosceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }
        } else {
            System.out.println("Las longitudes ingresadas no forman un triangulo valido");
        }
    }
}