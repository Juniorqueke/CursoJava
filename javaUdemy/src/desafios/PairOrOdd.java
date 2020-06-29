package desafios;

import java.util.Scanner;

public class PairOrOdd {

	public static void main(String[] args) {
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10
		// e é par
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número de 0 até 10");
		double n1 = entrada.nextDouble();
		if (n1 >= 0 && n1 <= 10) {
			if (n1 % 2 == 0) {
				System.out.println("O número " + n1 + " é par");
			} else {
				System.out.println("O número " + n1 + " é impar");
			}
		} else {
			System.out.println("O numero " + n1 + " não está entre 0 e 10.");
		}

		entrada.close();
	}

}
