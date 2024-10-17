
package cursoJava;

/**
 *
 * @author HP USER
 */
public class metodoSobreCarga {
    
    public static int multiplicar(int a, int b){
        return a * b;
    }
    
    public static int multiplicar(int a, int b, int c){
        return a * b * c;
    }
    
    public static double multiplicar(double a, double b){
        return a * b;
    }
 
    public static void main(String args[]){
        int a = 5, b=10, c=15;
        System.out.println(multiplicar(a,b));
        System.out.println(multiplicar(a,b,c));
        System.out.println(multiplicar(5.2,5.5));
    }
    
}
