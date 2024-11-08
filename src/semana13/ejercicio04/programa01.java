
package semana13.ejercicio04;
import java.util.Scanner;

public class programa01 {
    public static void main(String[] args){
    double compra1,compra2,compra3,compra4;
    Scanner lectura = new Scanner(System.in);
    
    System.out.print("Ingresar compra1: ");
    compra1=lectura.nextDouble();
    System.out.print("Ingresar compra2: ");
    compra2=lectura.nextDouble();
    System.out.print("Ingresar compra3: ");
    compra3=lectura.nextDouble();
    System.out.print("Ingresar compra4: ");
    compra4=lectura.nextDouble();
  
    ComprasEmpleado objregcompras = new ComprasEmpleado();

    objregcompras.setCompra1(compra1);
    objregcompras.setCompra2(compra2);
    objregcompras.setCompra3(compra3);
    objregcompras.setCompra4(compra4);
  
    System.out.println("Total de compras: $" + objregcompras.calcularTotal());
    System.out.println("Promedio de compras: $ " + objregcompras.calcularPromedio());
    System.out.println("Compra de mayor valor: $" + objregcompras.obtenerMayorCompra());
    System.out.println("Compra de menor valor: $" + objregcompras.obtenerMenorCompra());
    } 
}