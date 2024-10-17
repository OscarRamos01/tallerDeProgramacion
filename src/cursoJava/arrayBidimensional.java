public class arrayBidimensional{
	public static void main(String[] args){
		int[][] numeros = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9}
                };
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.print(numeros[i][j] + " ");
			}
                System.out.println();
		}
                numeros[2][2] = 20;
                for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.print(numeros[i][j] + " ");
			}
                System.out.println();
		}
	}
}