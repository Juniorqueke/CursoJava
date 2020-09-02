package classe;

public class ValorNulo {

	public static void main(String[] args) {

		String teste1 = ""; 
		System.out.println(teste1.concat("!!!"));

		Data d1 = Math.random() > 0.5 ?  new Data() : null;

		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obeterDataFormatada());
		}

		String teste2 = Math.random() > 0.5 ? "Hello World!"  :  null;

		if (teste2 != null) {
			System.out.println(teste2.concat("???"));
		}

	}
}
