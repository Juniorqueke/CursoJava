package desafios;

import java.util.Scanner;

public class QuadradoCubo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor");
		String valor = entrada.next();
		double value = Double.parseDouble(valor);
		System.out.println("Resultado ao quadrado " + Math.pow(value, 2));
		System.out.println("Resultado ao cubo " + Math.pow(value, 3));
		entrada.close();
	}
}
