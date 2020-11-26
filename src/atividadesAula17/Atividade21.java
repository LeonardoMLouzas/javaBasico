package atividadesAula17;

import java.util.Scanner;

//Faça um programa que calcule o número médio de alunos por turma. Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não podem ter mais de 40 alunos.

public class Atividade21 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean sair = false;
		int escolha, quantidadeTurmas = 0, quantidadeAlunos = 0;

		while (sair == false) {

			System.out.println(
					"Digite 1 para adicionar uma turma, 2 para mostrar a média de alunos e 3 para sair. 9 para resetar os dados.");

			escolha = leia.nextInt();

			switch (escolha) {

			case 1:

				quantidadeTurmas++;

				System.out.println("Digite a quantidade de alunos da " + quantidadeTurmas + "º turma: ");
				escolha = leia.nextInt();
				//if (escolha > 40) {
					while (escolha > 40) {
						System.out.println("A quantidade máxima de alunos por turma é 40. Tente novamente: ");
						escolha = leia.nextInt();
					}
				//}
				quantidadeAlunos += escolha;
				break;
			case 2:

				System.out.println("A média de alunos por turma é: " + (quantidadeAlunos / quantidadeTurmas));
				System.out.println("Quantidade total de alunos...: " + quantidadeAlunos);
				System.out.println("Quantidade total de turmas...: " + quantidadeTurmas);

				break;
			case 3:

				System.out.println("Saindo...");
				sair = true;

				break;
			case 9:

				quantidadeTurmas = 0;
				quantidadeAlunos = 0;

				break;
			default:

				System.out.println("Digite um número válido.");
			}
		}
	}
}