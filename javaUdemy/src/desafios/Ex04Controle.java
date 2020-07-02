package desafios;

import java.util.Scanner;

public class Ex04Controle {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele é um número primo.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = entrada.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é impar");
		}

		entrada.close();
	}

}
