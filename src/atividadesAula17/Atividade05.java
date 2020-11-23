package atividadesAula17;

import java.util.Scanner;

// Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.

public class Atividade05 {

	public static void main(String[] Args) {

		Scanner leia = new Scanner(System.in);

		double popA;
		double crescimentoPopulacaoA;
		double popB;
		double crescimentoPopulacaoB;
		int anos =0;
		int escolha = 1;

		while (escolha != 0) {

			System.out.println("Digite 0 para sair ou outro número para continuar: ");
			escolha = leia.nextInt();

			if (escolha != 0) {

				System.out.println("Digite a população do A: ");
				popA = leia.nextDouble();

				System.out.println("Digite o crescimento do A: ");
				crescimentoPopulacaoA = leia.nextDouble();

				System.out.println("Digite a população do B: ");
				popB = leia.nextDouble();

				System.out.println("Digite o crescimento do B: ");
				crescimentoPopulacaoB = leia.nextDouble();

				while (popA < popB) {

					popA = popA + ((popA / 100) * crescimentoPopulacaoA);
					popB = popB + ((popB / 100) * crescimentoPopulacaoB);
					anos++;
				}
				System.out.println("Total de anos para a população A alcançar a população B: " + anos);
				System.out.println("Total da população A: " + popA);
				System.out.println("Total da população B: " + popB);
			}
		}
		
		System.out.println("Você escolheu sair.");
	}
}