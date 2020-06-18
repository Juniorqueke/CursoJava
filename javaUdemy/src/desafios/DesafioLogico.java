package desafios;

public class DesafioLogico {

	public static void main(String[] args) {

		boolean t1 = true;
		boolean t2 = false;

		boolean comprouTV50 = t1 && t2;
		boolean comprouTV32 = t1 ^ t2;
		boolean tomouSorvete = t1 || t2;

		// operador unário
		boolean maisSaudavel = !tomouSorvete;

		System.out.println("Comprou TV 50\"?" + comprouTV50);
		System.out.println("Comprou TV 32\"?" + comprouTV32);
		System.out.println("Tomou sorvete\"?" + tomouSorvete);
		System.out.println("Mais saudével?" + maisSaudavel);

	}

}
