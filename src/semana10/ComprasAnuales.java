
package semana10;

/**
 * @author HP USER
 */

import java.util.Scanner;

public class ComprasAnuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCompras = 0;
        int compraMenor = Integer.MAX_VALUE;
        int mesMenor = 0;

        for (int mes = 1; mes <= 12; mes++) {
            System.out.print("Ingresa la compra del mes " + mes + ": ");
            int compra = scanner.nextInt();

            totalCompras += compra;

            if (compra < compraMenor) {
                compraMenor = compra;
                mesMenor = mes;
            }
        }

        double promedioCompras = totalCompras / 12.0;

        System.out.println("El total de compras es: " + totalCompras);
        System.out.println("El promedio de compras es: " + promedioCompras);
        System.out.println("El mes con la compra menor es el mes " + mesMenor + " con una compra de " + compraMenor);
    }
}
