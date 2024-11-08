
package semana13.ejercicio02;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args){
    double st1,st2,st3,st4;
    Scanner lectura = new Scanner(System.in);
    
    System.out.print("Ingresar Sueldo 1: ");
    st1=lectura.nextDouble();
    System.out.print("Ingresar Sueldo 2: ");
    st2=lectura.nextDouble();
    System.out.print("Ingresar Sueldo 3: ");
    st3=lectura.nextDouble();
    System.out.print("Ingresar Sueldo 4: ");
    st4=lectura.nextDouble();

    sueldosEmpleados objregventa = new sueldosEmpleados();

    objregventa.setSueldo1(st1);
    objregventa.setSueldo2(st2);
    objregventa.setSueldo3(st3);
    objregventa.setSueldo4(st4);
    
    System.out.println("El total de las ventas es " + objregventa.total());
    System.out.println("El total de las ventas es " + objregventa.promedio());
    System.out.println("La venta mayor es " + objregventa.getMayor());
    System.out.println("La venta menor es " + objregventa.getMenor());
    } 
}
