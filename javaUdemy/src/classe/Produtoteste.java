package classe;

public class Produtoteste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "Laptop";
		p1.preco = 4386.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		
		System.out.println((precoFinal1 + precoFinal2) / 2);
	}

}
