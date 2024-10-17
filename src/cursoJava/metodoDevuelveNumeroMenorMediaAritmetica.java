
package cursoJava;

public class metodoDevuelveNumeroMenorMediaAritmetica {
    
    public static int numeroMenor(int[] array){
        int numeroMenor = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < numeroMenor){
                numeroMenor=array[i];
            }
        }
        return numeroMenor;
    }
    
    public static double mediaAritmetica(int[] array){
        int suma = 0;
        for(int i=0;i<array.length;i++){
            suma+=array[i];
        }
        return suma / array.length;
              
    }
    
    public static int moda(int[] array) {
        int moda = array[0];
        int maxRepeticiones = 0;

        for (int i = 0; i < array.length; i++) {
            int contarRepeticion = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    contarRepeticion++;
                }
            }

            if (contarRepeticion > maxRepeticiones) {
                maxRepeticiones = contarRepeticion;
                moda = array[i];  // Actualiza la moda
            }
        }
        return moda;
    }
    
    public static void main(String[] args){
        int[] array = {3,6,3};
        int resultadoNumeroMenor = numeroMenor(array);
        double resultadoMediaAritmetica = mediaAritmetica(array);
        int resultadoModa = moda(array);
        System.out.println("El Numero Menor es:" + resultadoNumeroMenor);
        System.out.println("La Media Aritmetica es:" + resultadoMediaAritmetica);
        System.out.println("El numero de moda es:" + resultadoModa);
    }
}