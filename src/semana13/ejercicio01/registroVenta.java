
package semana13.ejercicio01;

public class registroVenta {
    private double venta1;
    private double venta2;
    private double venta3;

    public double getVenta1() {
        return venta1;
    }

    public void setVenta1(double venta1) {
        this.venta1 = venta1;
    }

    public double getVenta2() {
        return venta2;
    }

    public void setVenta2(double venta2) {
        this.venta2 = venta2;
    }

    public double getVenta3() {
        return venta3;
    }

    public void setVenta3(double venta3) {
        this.venta3 = venta3;
    }
    
    public double total(){
    return (this.getVenta1() + this.getVenta2() + this.getVenta3());
    }
    
    public double promedio(){
    return (this.total()/3);
    }
    
    public double getMayor(){
        double mayor;
        mayor = this.getVenta1();
        if(this.getVenta2() > mayor){
            mayor = this.getVenta2();
        }
        if(this.getVenta3() > mayor){
            mayor = this.getVenta3();
        }
        return (mayor);
    }
    
    public double getMenor(){
        double menor;
        menor = this.getVenta1();
        if(this.getVenta2() < menor){
            menor = this.getVenta2();
        }
        if(this.getVenta3() < menor){
            menor = this.getVenta3();
        }
        return (menor);
    }
}
