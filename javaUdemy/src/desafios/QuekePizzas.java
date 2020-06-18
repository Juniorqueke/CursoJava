package desafios;

import javax.swing.JOptionPane;

public class QuekePizzas {

	public static void main(String[] args) {
		String cliente = ""; // SALVAR O NOME DO CLIENTE
		String celular = ""; // SALVAR O TELEFONE DO CLIENTE
		String endereco = ""; // SALVAR O ENDREÇO DO CLIENTE
		String resposta = "";
		boolean entrega = false;
		double valorPedido = 0; // VALOR TOTAL DO PEDIDO COM A ENTREGA OU SEM A ENTREGA
		int valor = 0; // VALOR DA PIZZA
		String formaPagamento; // VAI RECEBER A ESCOLHA DO USUÁRIO DE PAGAMENTO E SALVAR NESSA VARIAVEL

		int opcao = 10;

		while (opcao != 0) {

			// MENU PRINCIPAL COM OS SABORES DE PIZZA E SAIR
			opcao = Integer.parseInt(JOptionPane.showInputDialog( // FUNÇÃO QUE CONVERTE A OPÇÃO DE INTEGER PARA STRING
					"Bem vindo ao Queke Pizzas " + "\n" + "1: Pizza portuguesa R$25,00 \n"
							+ "2: Pizza quatro queijos R$20,00 \n" + "3: Pizza camarão R$35,00 \n"
							+ "4: Pizza siciliana R$30,00 \n" + "5: Pizza Mussarela R$25,00 \n" + "0: Sair \n"
							+ "Escolha o sabor de sua preferência! \n"));

			// CASOS
			switch (opcao) {
			case 1:
				// PIZZA portuguesa
				valor = 25;
				cliente = JOptionPane.showInputDialog("Qual o seu nome?"); // PARA GUARDAR O QUE O USUAÁRIO DIGIOU EM UM
				// VARIAVEL
				celular = JOptionPane.showInputDialog("Qual o seu telefone?");
				endereco = JOptionPane.showInputDialog("Qual o seu endereço?");
				resposta = JOptionPane.showInputDialog("Deseja que entregue na sua casa? S ou N");
				if (resposta.substring(0, 1).equalsIgnoreCase("S")) { // CASO O CLIENTE DIGITE S, Sim, sim ou s
					entrega = true;
					valor = 25;
					valor = valor + 2;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null, "Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone : "
							+ celular + "\n" + "Endereço: " + endereco + "\n" + "Tipo de entrega: a domicílio" + "\n"
							+ "Forma de pagamento: " + formaPagamento + " \n" + "Pizza portuguesa valor: R$:" + valor);
				} else {
					entrega = false;
					valor = 25;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone: " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: Por conta do cliente" + "\n"
									+ "Forma de pagamento: " + formaPagamento + "\n " + "Pizza portuguesa valor R$:"
									+ valor);
				}
				break;

			case 2:
				// PIZZA QUATRO QUEIJOS
				valor = 20;
				cliente = JOptionPane.showInputDialog("Qual o seu nome?"); // PARA GUARDAR O QUE O USUAÁRIO DIGIOU EM UM
				// VARIAVEL
				celular = JOptionPane.showInputDialog("Qual o seu telefone?");
				endereco = JOptionPane.showInputDialog("Qual o seu endereço?");

				resposta = JOptionPane.showInputDialog("Deseja que entregue na sua casa? S ou N");
				if (resposta.substring(0, 1).equalsIgnoreCase("S")) { // CASO O CLIENTE DIGITE S, Sim, sim ou s
					entrega = true;
					valor = 20;
					valor = valor + 2;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone : " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: a domicílio" + "\n"
									+ "Forma de pagamento: " + formaPagamento + " \n"
									+ "Pizza de quatro queijos valor:R$" + valor);
				} else {
					entrega = false;
					valor = 20;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone: " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: Por conta do cliente" + "\n"
									+ "Forma de pagamento: " + formaPagamento + "\n "
									+ "Pizza de quatro queijos valor:R$" + valor);
				}
				break;

			case 3:
				// PIZZA CAMARÃO
				valor = 35;
				cliente = JOptionPane.showInputDialog("Qual o seu nome?"); // PARA GUARDAR O QUE O USUAÁRIO DIGIOU EM UM
				// VARIAVEL
				celular = JOptionPane.showInputDialog("Qual o seu telefone?");
				endereco = JOptionPane.showInputDialog("Qual o seu endereço?");

				resposta = JOptionPane.showInputDialog("Deseja que entregue na sua casa? S ou N");
				if (resposta.substring(0, 1).equalsIgnoreCase("S")) { // CASO O CLIENTE DIGITE S, Sim, sim ou s
					entrega = true;
					valor = 35;
					valor = valor + 2;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone : " + celular + "\n"
									+ "Entrega: a domicílio" + "\n" + "Forma de pagamento: " + formaPagamento + " \n"
									+ "Pizza de camarão valor: R$" + valor + "R$");
				} else {
					entrega = false;
					valor = 35;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone: " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: Por conta do cliente" + "\n"
									+ "Forma de pagamento: " + formaPagamento + "\n " + "Pizza de camarão valor:R$"
									+ valor);
				}
				break;

			case 4:
				// PIZZA siciliana
				valor = 30;
				cliente = JOptionPane.showInputDialog("Qual o seu nome?"); // PARA GUARDAR O QUE O USUAÁRIO DIGIOU EM UM
				// VARIAVEL
				celular = JOptionPane.showInputDialog("Qual o seu telefone?");
				endereco = JOptionPane.showInputDialog("Qual o seu endereço?");

				resposta = JOptionPane.showInputDialog("Deseja que entregue na sua casa? S ou N");
				if (resposta.substring(0, 1).equalsIgnoreCase("S")) { // CASO O CLIENTE DIGITE S, Sim, sim ou s
					entrega = true;
					valor = 30;
					valor = valor + 2;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone : " + celular + "\n"
									+ "Entrega: a domicílio" + "\n" + "Forma de pagamento: " + formaPagamento + " \n"
									+ "Pizza siciliana valor:" + valor + "R$");
				} else {
					entrega = false;
					valor = 30;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone: " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: Por conta do cliente" + "\n"
									+ "Forma de pagamento: " + formaPagamento + "\n " + "Pizza siciliana valor:R$"
									+ valor);
				}
				break;
			case 5:
				// PIZZA Mussarela
				valor = 25;
				cliente = JOptionPane.showInputDialog("Qual o seu nome?"); // PARA GUARDAR O QUE O USUAÁRIO DIGIOU EM UM
				// VARIAVEL
				celular = JOptionPane.showInputDialog("Qual o seu telefone?");
				endereco = JOptionPane.showInputDialog("Qual o seu endereço?");

				resposta = JOptionPane.showInputDialog("Deseja que entregue na sua casa? S ou N");
				if (resposta.substring(0, 1).equalsIgnoreCase("S")) { // CASO O CLIENTE DIGITE S, Sim, sim ou s
					entrega = true;
					valor = 25;
					valor = valor + 2;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone : " + celular + "\n"
									+ "Entrega: a domicílio" + "\n" + "Forma de pagamento: " + formaPagamento + " \n"
									+ "Pizza de mussarela valor:" + valor + "R$");
				} else {
					entrega = false;
					valor = 30;
					formaPagamento = JOptionPane.showInputDialog("Qual será a forma de pagamento? Dinheiro ou cartão?");
					JOptionPane.showMessageDialog(null,
							"Queke Pizzas \n" + "Cliente: " + cliente + "\n" + "Telefone: " + celular + "\n"
									+ "Endereço: " + endereco + "\n" + "Tipo de entrega: Por conta do cliente" + "\n"
									+ "Forma de pagamento: " + formaPagamento + "\n " + "Pizza de mussarela valor:R$"
									+ valor);
				}
				break;
			case 0:
				// SAIR
				JOptionPane.showMessageDialog(null, "Obrigado pela preferência, volte semopre");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Número inválido digite um número de 1 à 5");
				break;
			}
		}
	}
}
