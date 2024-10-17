
package semana05;

import java.util.Scanner;

/**
 * @author Oscar Ramos
 */
public class TraductorNumeros {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        // Variables para almacenar el número y el idioma
        int numero, idioma;
        String traducido = "";

        // Ingresar el número (1-6)
        System.out.print("Ingrese un número (1-6): ");
        numero = lectura.nextInt();
        
        // Validar el número ingresado
        if (numero < 1 || numero > 6) {
            System.out.println("Número fuera del rango permitido.");
            return; // Termina el programa si el número no es válido
        }

        // Ingresar el tipo de idioma (1=español, 2=inglés, 3=portugués, 4=francés)
        System.out.print("Ingrese el tipo de idioma (1=español, 2=ingles, 3=portugues, 4=frances): ");
        idioma = lectura.nextInt();

        // Traducir el número según el idioma
        switch (idioma) {
            case 1: // Español
                switch (numero) {
                    case 1: traducido = "uno"; break;
                    case 2: traducido = "dos"; break;
                    case 3: traducido = "tres"; break;
                    case 4: traducido = "cuatro"; break;
                    case 5: traducido = "cinco"; break;
                    case 6: traducido = "seis"; break;
                }
                break;
            case 2: // Inglés
                switch (numero) {
                    case 1: traducido = "one"; break;
                    case 2: traducido = "two"; break;
                    case 3: traducido = "three"; break;
                    case 4: traducido = "four"; break;
                    case 5: traducido = "five"; break;
                    case 6: traducido = "six"; break;
                }
                break;
            case 3: // Portugués
                switch (numero) {
                    case 1: traducido = "um"; break;
                    case 2: traducido = "dois"; break;
                    case 3: traducido = "três"; break;
                    case 4: traducido = "quatro"; break;
                    case 5: traducido = "cinco"; break;
                    case 6: traducido = "seis"; break;
                }
                break;
            case 4: // Francés
                switch (numero) {
                    case 1: traducido = "un"; break;
                    case 2: traducido = "deux"; break;
                    case 3: traducido = "trois"; break;
                    case 4: traducido = "quatre"; break;
                    case 5: traducido = "cinq"; break;
                    case 6: traducido = "six"; break;
                }
                break;
            default:
                System.out.println("Idioma no válido.");
                return;
        }

        // Mostrar el resultado
        System.out.println("Resultado:");
        System.out.println("traducido = \"" + traducido + "\"");
    }
}
