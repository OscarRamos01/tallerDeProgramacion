/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoJava;

/**
 *Crea un método que devuelva el número más grande de un array unidimensional.
    Llama a ese método en el main y muestra el resultado.
*/ 

public class metodoDevuelveNumeroMasGrande {
    
    public static int numeroGrande(int[] array){
        int numeroMayor = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] > numeroMayor){
            numeroMayor = array[i];
            }
        }
        return numeroMayor;
    }
    
    public static void main(String[] args){
        int[] array = {10,30,50,20,40};
        int resultado = numeroGrande(array);
        System.out.println("El numero mas grande es: " + resultado);
    }
            
}
