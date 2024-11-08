
package semana13.ejercicio03;
import java.util.Scanner;
public class programa01 {
    public static void main(String[] args){
    double ingresoMensual,otrosIngresos,gastosMensuales;
    Scanner lectura = new Scanner(System.in);
    
    System.out.print("Ingresar el Ingreso Mensual: ");
    ingresoMensual=lectura.nextDouble();
    System.out.print("Ingresar Otros Ingresos: ");
    otrosIngresos=lectura.nextDouble();
    System.out.print("Ingresar el Gasto Mensual: ");
    gastosMensuales=lectura.nextDouble();
  

    FinanzasEmpleado objregventa = new FinanzasEmpleado();

    objregventa.setIngresoMensual(ingresoMensual);
    objregventa.setOtrosIngresos(otrosIngresos);
    objregventa.setGastosMensuales(gastosMensuales);
    
    System.out.println("Ingreso Mensual: $" + ingresoMensual);
    System.out.println("Otros Ingresos: $" + otrosIngresos);
    System.out.println("Gastos Mensuales: $" + gastosMensuales);
    System.out.println("---------------------------------------------");
    System.out.println("El total del Ahorro Mensual es: " + objregventa.calcularAhorroMensual());
    System.out.println("El total del Ahorro Semestral es: " + objregventa.calcularAhorroSemestral());
    System.out.println("La total del Ahorro Anual es: " + objregventa.calcularAhorroAnual());
    } 
}
