package desafios;

public class DesafioAritimetico {

	public static void main(String[] args) {

		double nA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;

		double nB = (1 - 5) * (2 - 7);
		double denB = 2;

		double sA = nA / nB;
		double sB = Math.pow((nB / denB), 2);

		double superior = Math.pow(sA - sB, 3);
		double inferior = Math.pow(10, 3);

		double resultado = superior / inferior;
		System.out.println("O resultado é " + resultado);

	}

}
