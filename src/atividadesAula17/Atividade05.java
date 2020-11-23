package atividadesAula17;

import java.util.Scanner;

// Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o.

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

			System.out.println("Digite 0 para sair ou outro n�mero para continuar: ");
			escolha = leia.nextInt();

			if (escolha != 0) {

				System.out.println("Digite a popula��o do A: ");
				popA = leia.nextDouble();

				System.out.println("Digite o crescimento do A: ");
				crescimentoPopulacaoA = leia.nextDouble();

				System.out.println("Digite a popula��o do B: ");
				popB = leia.nextDouble();

				System.out.println("Digite o crescimento do B: ");
				crescimentoPopulacaoB = leia.nextDouble();

				while (popA < popB) {

					popA = popA + ((popA / 100) * crescimentoPopulacaoA);
					popB = popB + ((popB / 100) * crescimentoPopulacaoB);
					anos++;
				}
				System.out.println("Total de anos para a popula��o A alcan�ar a popula��o B: " + anos);
				System.out.println("Total da popula��o A: " + popA);
				System.out.println("Total da popula��o B: " + popB);
			}
		}
		
		System.out.println("Voc� escolheu sair.");
	}
}