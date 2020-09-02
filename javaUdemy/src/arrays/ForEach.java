package arrays;

public class ForEach {

	public static void main(String[] args) {

		double notas[] = {9.9,8.2,7.34,7.13};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i]+" ");
		}
		System.out.println();
		for (double nota : notas) {
			System.out.print(nota+ " foreach ");
		}
		
	
	}

}
