package classeDesafio;

public class Jantar {

	public static void main(String[] args) {

		Comida comida1 = new Comida("Hamburger", 0.350);
		Comida comida2 = new Comida("Torta", 0.750);

		Pessoa pessoa1 = new Pessoa("Junior", 68.0);
		Pessoa pessoa2 = new Pessoa("Edgar", 90.25);

		System.out.println(pessoa1.apresentacao());
		System.out.println(pessoa2.apresentacao());
		pessoa1.comer(comida1);
		pessoa2.comer(comida2);
		System.out.println("");
		System.out.println(pessoa1.apresentacao());
		System.out.println(pessoa2.apresentacao());
		
	}
}
