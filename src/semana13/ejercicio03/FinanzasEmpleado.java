
package semana13.ejercicio03;

public class FinanzasEmpleado {
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    // Método para calcular el ahorro mensual
    public double calcularAhorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    // Método para calcular el ahorro semestral proyectado
    public double calcularAhorroSemestral() {
        return calcularAhorroMensual() * 6;
    }

    // Método para calcular el ahorro anual proyectado
    public double calcularAhorroAnual() {
        return calcularAhorroMensual() * 12;
    }
        
}
