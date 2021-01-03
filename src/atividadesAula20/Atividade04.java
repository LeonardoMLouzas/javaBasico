package atividadesAula20;

import java.util.Scanner;

//Fa�a um programa para armazenar em uma matriz os compromissos de uma agenda pessoal. Cada dia do m�s deve conter 24h, onde para cada hora podemos associar uma tarefa espec�fica. O programa deve ter um menu onde o usu�rio indica o dia e hora que deseja alterar, entrando em seguida com o compromisso, ou ent�o, o usu�rio pode tamb�m consultar a agenda, fornecendo o dia e a hora para obter o compromisso armazenado.

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
						System.out.println("Dia inv�lido. Tente novamente.");
					}
				}
				while (!horaInvalida) {
					System.out.println("Qual a hora da tarefa? ");
					hora = leia.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaInvalida = true;
					} else {
						System.out.println("Hora inv�lida. Tente novamente.");
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
							System.out.println("Dia " + ++i + " �s " + j + "h. Tarefa: " + tarefa[i][j]);
							System.out.println("");
						}
					}
				}
				break;

			case 5:
				System.out.println("Voc� escolheu sair.");
				sair = true;
			}
		}
	}
}