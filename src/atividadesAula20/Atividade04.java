package atividadesAula20;

import java.util.Scanner;

//Faça um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do mês deve conter 24h, onde para cada hora podemos associar uma tarefa específica. O programa deve ter um menu onde o usuário indica o dia e hora que deseja alterar, entrando em seguida com o compromisso, ou então, o usuário pode também consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

public class Atividade04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String[][] tarefa = new String[31][24];

		boolean sair = false;

		int opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicionar uma tarefa. Digite 2 para ver as tarefas. 5 para sair.");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				int dia = 0, hora = 0;
				boolean diaValido = false;
				boolean horaInvalida = false;

				while (!diaValido) {
					System.out.println("Qual o dia da tarefa? ");
					dia = leia.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Tente novamente.");
					}
				}
				while (!horaInvalida) {
					System.out.println("Qual a hora da tarefa? ");
					hora = leia.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaInvalida = true;
					} else {
						System.out.println("Hora inválida. Tente novamente.");
					}
				}
				dia--;
				System.out.println("Digite a tarefa: ");
				tarefa[dia][hora] = leia.next();

				break;

			case 2:
				for (int i = 0; i < tarefa.length; i++) {
					for (int j = 0; j < tarefa[i].length; j++) {

						if (tarefa[i][j] != null) {
							System.out.println("Dia " + ++i + " às " + j + "h. Tarefa: " + tarefa[i][j]);
							System.out.println("");
						}
					}
				}
				break;

			case 5:
				System.out.println("Você escolheu sair.");
				sair = true;
			}
		}
	}
}