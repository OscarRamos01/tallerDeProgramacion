
package semana08;

/**
 *
 */

import java.util.Scanner;

public class NumeroSueldos {
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);        
        double sueldo, ts, ps;
        int ns;
        ts=0.0;
        System.out.println("Ingrese la cantidad de sueldos");
        ns = lectura.nextInt();
        for(int i=1; i<=ns; i++){
            System.out.println("Ingrese el sueldo N°" + i);
            sueldo = lectura.nextDouble();
            ts+=sueldo;
        }
        ps=ts/ns;
        System.out.println("La cantidad de sueldos es:" + ts);
        System.out.println("El promedio del suelso es:" + ps);
    }
}

