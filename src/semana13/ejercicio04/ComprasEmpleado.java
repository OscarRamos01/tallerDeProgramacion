
package semana13.ejercicio04;

public class ComprasEmpleado {
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    public double getCompra1() {
        return compra1;
    }

    public void setCompra1(double compra1) {
        this.compra1 = compra1;
    }

    public double getCompra2() {
        return compra2;
    }

    public void setCompra2(double compra2) {
        this.compra2 = compra2;
    }

    public double getCompra3() {
        return compra3;
    }

    public void setCompra3(double compra3) {
        this.compra3 = compra3;
    }

    public double getCompra4() {
        return compra4;
    }

    public void setCompra4(double compra4) {
        this.compra4 = compra4;
    }
    
    public double calcularTotal() {
        return compra1 + compra2 + compra3 + compra4;
    }

    // Método para calcular el promedio de las compras
    public double calcularPromedio() {
        return calcularTotal() / 4;
    }

    // Método para obtener la compra de mayor valor
    public double obtenerMayorCompra() {
        return Math.max(Math.max(compra1, compra2), Math.max(compra3, compra4));
    }

    // Método para obtener la compra de menor valor
    public double obtenerMenorCompra() {
        return Math.min(Math.min(compra1, compra2), Math.min(compra3, compra4));
    }
    
    
}
