package desafios;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) * 5/9 = c
		final double fator  = 5.0 / 9.0;
		final double ajuste = 32.0;
		
		double faren = 86;
		double celsius = (faren - ajuste) * fator;
		System.out.println("O resultado é: "+celsius);

		faren = 0;
		celsius = (faren - ajuste) * fator;
		System.out.println("O resultado é: "+celsius);
	}
	
}
