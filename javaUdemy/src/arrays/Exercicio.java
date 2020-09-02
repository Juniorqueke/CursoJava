package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double notasAlunosA[] = new double[4];

		notasAlunosA[0] = 8.5;
		notasAlunosA[1] = 6.5;
		notasAlunosA[2] = 7.5;
		notasAlunosA[3] = 5.5;
		System.out.println(Arrays.toString(notasAlunosA));

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}

		System.out.println(totalAlunoA / notasAlunosA.length+" Nota aluno A");
		
		final double notaArmazenada = 5.5;
		double notasAlunoB[] = {6.50,8.0,6.75,notaArmazenada};
		 
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length +" Nota aluno B");
	}
	
}
