
package cursoJava;

public class metodoImprimirArray {
    
    public static void imprimirArray(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        int[][] numerosArray = { {1,2,3},{4,5,6},{7,8,9} };
        imprimirArray(numerosArray);
    }
    
 }