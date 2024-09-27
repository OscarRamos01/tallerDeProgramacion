
package semana07;

/**
 *Crear un programa en Java que permita ingresar la edad, sexo de las personas y preguntar al 
 *usuario si desea continuar o finalizar con el proceso de registro de datos.
 *Visualizar la cantidad de alumno y el promedio de edad, la cantidad de alumnos de sexo masculino y femenino.
 */
import java.util.Scanner; 
public class contarSexo {
    public static void main(String args[]){
        //Declarar variables
        int edad,cp,cpsm,cpsf = 0;
        String sexo="",rpta="";
        double pe,se;
        boolean estado=true;
        Scanner lectura=new Scanner(System.in);
        cp=0;
        cpsm=0;
        se=0.0;
        //Proceso
        do{
           System.out.print("Ingrese su Edad:");
           edad=lectura.nextInt();
           System.out.print("Ingresar Sexo:");
           sexo=lectura.next();
           cp++;//contador
           if(sexo.equals("m")){
               cpsm++;
           }else if(sexo.equals("f")){
        cpsf++;
           }
            do{
               System.out.print("Desea continuar si/no?");
               rpta=lectura.next();
               if(rpta.equals("si") || rpta.equals("no")){
                   estado=false;   
               }else{
                   estado=true;
                   System.out.println("Solo se debe ingresar si o no");
               }
           }while(estado);
            pe=cp;
        }while(rpta.equals("si"));
        //Salidas de datos
        System.out.println("Cantidad de personas de sexo m:"+cpsm);
        System.out.println("Cantidad de personas de sexo f:"+cpsf);
        System.out.println("Cantidad de alumnos:"+pe);
    }    
}