public class array{
	public static void main(String[] args){
		int[] numeros = {1,2,3,4,5};
		for(int i=0;i<=4;i++){
			System.out.println(numeros[i]);
		}
		numeros[2]=20;
		for(int i=0;i<=4;i++){
			System.out.println(numeros[i]);
		}
	}
}