package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a média");
		double media = entrada.nextDouble();

		if (media >= 7.0 && media <= 10) {
			System.out.println("Aprovado!");
		}

		if (media < 7 && media > 5) {
			System.out.println("Recuperação");
		}
		
		boolean reprovado = media < 5 && media >= 0;
		if (reprovado) {
			System.out.println("Reprovado");
		}
		entrada.close();

	}
}
