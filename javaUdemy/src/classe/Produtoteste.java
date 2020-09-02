package classe;

public class Produtoteste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Laptop", 2999.99);

		var p2 = new Produto("Caneta preta", 12.56);
		
		Produto.desconto = 0.50;

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		 
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);

		double media = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média de compras foi  R$%.2f.", media);
	}

}
