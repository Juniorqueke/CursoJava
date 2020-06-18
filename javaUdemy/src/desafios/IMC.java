package desafios;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {

		String altura = JOptionPane.showInputDialog("Digite a sua altura: ");
		String peso = JOptionPane.showInputDialog("Digite o seu peso");

		double al = Double.parseDouble(altura);
		double kg = Double.parseDouble(peso);

		double imc = kg / (al * al);

		System.out.println("O seu IMC é: " + imc);

	}

}