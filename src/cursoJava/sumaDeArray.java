
package cursoJava;

/**
 *Modifica el método para que reciba un array unidimensional (por ejemplo, {10, 20, 30, 40, 50}) y lo imprima.
    Crea un nuevo método que calcule y devuelva la suma de todos los elementos del array unidimensional.
 */
public class sumaDeArray {
    public static void metodoArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    
    public static int sumaArray(int[] array){
        int suma = 0;
        for(int i=0; i<array.length;i++){
            suma+=array[i];
        }
        return suma;
    }
    
    public static void main(String[] args){
        int[] array = {10,20,30,40,50};
        metodoArray(array);
        int resultado = sumaArray(array);
        System.out.println("la suma del array es: " + resultado);
    }    
    
}
