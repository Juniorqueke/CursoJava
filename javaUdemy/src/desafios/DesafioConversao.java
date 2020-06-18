package desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro salário");
		String v1 = entrada.next().replace(",", ".");

		System.out.println("Digite o segundo salário");
		String v2 = entrada.next().replace(",", ".");

		System.out.println("Digite o terceiro salário");
		String v3 = entrada.next().replace(",", ".");

		double s1 = Double.parseDouble(v1);
		double s2 = Double.parseDouble(v2);
		double s3 = Double.parseDouble(v3);
		
		double media = 	(s1 + s2 + s3) / 3;
		System.out.println("A média dos salários é: "+ media);
		
		entrada.close();
	}

}
