package desafios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {

		// Criar um programa informa se o ano atual é um ano bissexto
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano atual ");
		int ano = scanner.nextInt();

		int bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();

	}

}
