
package semana10;

/**
 * @author HP USER
 */

import java.util.Scanner;

public class DigitoMayor {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingresa una cantidad: ");
        int cantidad = lectura.nextInt();
        
        int digitoMayor = 0;
        
        while (cantidad > 0) {
            int digito = cantidad % 10;
            if (digito > digitoMayor) {
                digitoMayor = digito;
            }
            cantidad /= 10;
        }
        
        System.out.println("El dígito mayor es: " + digitoMayor);

    }
}
