
package semana13.ejercicio01;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args){
    double vt1,vt2,vt3;
    Scanner lectura = new Scanner(System.in);
    
    System.out.print("Ingresar Venta 1: ");
    vt1=lectura.nextDouble();
    System.out.print("Ingresar Venta 2: ");
    vt2=lectura.nextDouble();
    System.out.print("Ingresar Venta 3: ");
    vt3=lectura.nextDouble();

    registroVenta objregventa = new registroVenta();

    objregventa.setVenta1(vt1);
    objregventa.setVenta2(vt2);
    objregventa.setVenta3(vt3);
    
    System.out.println("El total de las ventas es " + objregventa.total());
    System.out.println("El total de las ventas es " + objregventa.promedio());
    System.out.println("La venta mayor es " + objregventa.getMayor());
    System.out.println("La venta mayor es " + objregventa.getMenor());
    } 
}
