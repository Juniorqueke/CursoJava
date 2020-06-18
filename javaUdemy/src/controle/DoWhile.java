package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		String txt = "";
		
		do {
			System.out.println("Fale as palavras mágicas");
			System.out.print("Quer sair?");
			txt = entrada.nextLine();
		} while (!txt.equalsIgnoreCase("sair"));

		
		System.out.println("Thank you!");
		entrada.close();
	}

}
