package desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qntdNota = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota  ou -1 para sair");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota > 0) {
				total += nota;
				qntdNota ++;
			} else  if (nota != -1){
				System.out.println("Nota inválida!");
			}
			
		}
		//calcular a media

		double  media = total / qntdNota;
		System.out.println("Média = "+ media);
		
		
		
		entrada.close();
	}

}
