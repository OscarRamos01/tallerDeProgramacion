
package semana06;

/**
 *Adivinar un número
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;  // Genera un número entre 1 y 100
        int intento = 0;
        int contadorIntentos = 0;

        while (intento != numeroAleatorio) {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = lectura.nextInt();
            contadorIntentos++;

            if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contadorIntentos + " intentos.");
            }
        }
    }
}