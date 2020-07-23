package desafios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Digite o primeiro numero");
		double n1  = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero");
		double n2 = entrada.nextDouble();
		
		System.out.print("Digite a operação aritimética");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? n1 + n2 : 0;
		resultado = "-".equals(operacao) ? n1 - n2 : resultado;
		resultado = "*".equals(operacao) ? n1 * n2 : resultado;
		resultado = "/".equals(operacao) ? n1 / n2 : resultado;
		resultado = "%".equals(operacao) ? n1 % n2 : resultado;
		
		 
		System.out.printf("%.2f %s %.2f	= %.2f",n1 ,operacao, n2, resultado);
		entrada.close();
		
	}

}
