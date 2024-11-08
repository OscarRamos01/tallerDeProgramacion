
package semana13.ejercicio02;


public class sueldosEmpleados {
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    /**
     * @return the sueldo1
     */
    public double getSueldo1() {
        return sueldo1;
    }

    /**
     * @param sueldo1 the sueldo1 to set
     */
    public void setSueldo1(double sueldo1) {
        this.sueldo1 = sueldo1;
    }

    /**
     * @return the sueldo2
     */
    public double getSueldo2() {
        return sueldo2;
    }

    /**
     * @param sueldo2 the sueldo2 to set
     */
    public void setSueldo2(double sueldo2) {
        this.sueldo2 = sueldo2;
    }

    /**
     * @return the sueldo3
     */
    public double getSueldo3() {
        return sueldo3;
    }

    /**
     * @param sueldo3 the sueldo3 to set
     */
    public void setSueldo3(double sueldo3) {
        this.sueldo3 = sueldo3;
    }

    /**
     * @return the sueldo4
     */
    public double getSueldo4() {
        return sueldo4;
    }

    /**
     * @param sueldo4 the sueldo4 to set
     */
    public void setSueldo4(double sueldo4) {
        this.sueldo4 = sueldo4;
    }
    
    public double total(){
    return (this.getSueldo1() + this.getSueldo2() + this.getSueldo3() + this.getSueldo4());
    }
    
    public double promedio(){
    return (this.total()/4);
    }
    
    public double getMayor(){
        double mayor;
        mayor = this.getSueldo1();
        if(this.getSueldo2() > mayor){
            mayor = this.getSueldo2();
        }
        if(this.getSueldo3() > mayor){
            mayor = this.getSueldo3();
        }
        if(this.getSueldo4() > mayor){
            mayor = this.getSueldo4();
        }
        return (mayor);
    }
    
    public double getMenor(){
        double menor;
       menor = this.getSueldo1();
        if(this.getSueldo2() < menor){
            menor = this.getSueldo2();
        }
        if(this.getSueldo3() < menor){
            menor = this.getSueldo3();
        }
        if(this.getSueldo4() < menor){
            menor = this.getSueldo4();
        }
        return (menor);
    }
    
}

