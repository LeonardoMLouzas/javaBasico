package atividadesAula17;

import java.util.Scanner;

//O cardápio de uma lanchonete é o seguinte:
/*
  Especificação  | Código |  Preço
Cachorro Quente  |  100   | R$ 1,20
 Bauru Simples   |  101   | R$ 1,30
 Bauru com ovo   |  102   | R$ 1,50
  Hambúrguer     |  103   | R$ 1,20
 Cheeseburguer   |  104   | R$ 1,30
 Refrigerante    |  105   | R$ 1,00 
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve ser encerrado
*/

public class Atividade32 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		boolean sair = false;
		byte escolha = 0;
		double valor = 0;
		double valorTotal = 0;
		while (sair != true) {

			System.out.println("Digite 1 para adicionar um item. 2 para mostrar o total. 3 para limpar e 9 para sair.");
			escolha = leia.nextByte();

			switch (escolha) {

			case 1:
				System.out.println("Digite o código: ");
				escolha = leia.nextByte();

				switch (escolha) {

				case 105:
					System.out.println("Digite a quantidade: ");
					valor = leia.nextByte();

					valor = valor * 1.00;
					valorTotal += valor;
					System.out.println("Total: " + valor);
					break;

				case 100:
				case 103:
					System.out.println("Digite a quantidade: ");
					valor = leia.nextByte();

					valor = valor * 1.20;
					valorTotal += valor;
					System.out.println("Total: " + valor);
					break;

				case 101:
				case 104:
					System.out.println("Digite a quantidade: ");
					valor = leia.nextByte();

					valor = valor * 1.30;
					valorTotal += valor;
					System.out.println("Total: " + valor);
					break;

				case 102:
					System.out.println("Digite a quantidade: ");
					valor = leia.nextByte();

					valor = valor * 1.50;
					valorTotal += valor;
					System.out.println("Total: " + valor);
					break;
				}
				break;

			case 2:
				System.out.println("O valor total da compra é: ");
				System.out.println(valorTotal + " reais.");
				break;

			case 3:
				valor = 0;
				valorTotal = 0;
				break;

			case 9:

				System.out.println("Saindo...");
				sair = true;
			}
		}
	}
}