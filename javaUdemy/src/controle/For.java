package controle;

public class For {

	public static void main(String[] args) {

		// for de decremento
		for (int contador = 10; contador >= 1; contador--) {
			System.out.printf("i = %d\n", contador);

		}

		System.out.println("");

		// for de incremento
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);

		}

		//Laço infinito 
		for (;;) {
			System.out.println("Travando");
		}
	}

}
