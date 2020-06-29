package desafios;

import java.util.Scanner;

public class Ex02Controle {

	public static void main(String[] args) {

		// Criar um programa que receba duas notas parciais, calcular a média final.
		// Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
		// se a nota for menor que 7.0 e maior do que 4.0 imprime no console
		// "Recuperação",
		// caso contrário imprime no console "Reprovado".
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a primeira nota do aluno");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota do aluno");
		double nota2 = entrada.nextDouble();
		if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {

			double media = (nota1 + nota2) / 2;
			if (media >= 7) {
				System.out.println("Aprovado");
			} else if (media < 7 && media >= 4) {
				System.out.println("Em recuperação");
			} else {
				System.out.println("Reprovado");
			}
		} else {
			System.out.println("As notas tem que ser de 0 a 10");
		}
		entrada.close();
	}
}
