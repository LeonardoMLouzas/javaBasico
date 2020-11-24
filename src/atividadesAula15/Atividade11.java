package atividadesAula15;

import java.util.Scanner;

// Fa�a um programa para calcular reajustes.
// O programa receber� o sal�rio do colaborador e calcular� o reajuste baseado nos seguintes crit�rios:
// <= R$ 280,00 : 20% de aumento
// > R$ 280,00 > R$ 700,00 : 15% de aumento
// > R$ 700,00 > R$ 1500,00 : 10% de aumento
// >= R$ 1500,00 : 5%
// Ent�o dever� ser impresso na tela as seguintes informa�oes: Sal�rio antigo. % de aumento. Valor do aumento. Novo Sal�rio.

public class Atividade11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu sal�rio: ");
		double salario = leia.nextDouble();
		int aumento = 0;

		if (salario <= 280) {
			aumento = 20;
			
		} else if (salario > 280 && salario < 700) {
			aumento = 15;
			
		} else if (salario > 700 && salario < 1500) {
			aumento = 10;
			
		} else {
			aumento = 5;
			
		}

		System.out.println("O sal�rio antigo era: " + salario);
		System.out.println("O sal�rio novo �: " + ((salario / 100 * aumento) + salario));
		System.out.println("O sal�rio teve um aumento de: " + aumento + "%");
		System.out.println("O aumento foi de: " + (((salario / 100 * aumento) + salario) - salario) + " reais");
	}
}