package atividadesAula20;

import java.util.Scanner;

//Modifique o programa anterior de maneira a guardar as tarefas de todo o ano, organizando por m�s, dia e hora (8 horas por dia).

public class Atividade05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String[][][] tarefa = new String[12][31][8];

		boolean sair = false;

		int opcao;
		while (!sair) {

			System.out.println("Digite 1 para adicionar uma tarefa. Digite 2 para ver as tarefas. 5 para sair.");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:

				int mes = 0, dia = 0, hora = 0;
				boolean mesValido = false, diaValido = false, horaInvalida = false;

				while (!mesValido) {
					System.out.println("Qual o m�s da tarefa? ");
					mes = leia.nextInt();

					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido. Tente novamente.");
					}
				}
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

					if (hora >= 0 && hora <= 8) {
						horaInvalida = true;
					} else {
						System.out.println("Hora inv�lida. Tente novamente.");
					}
				}
				System.out.println("Digite a tarefa: ");
				tarefa[--mes][--dia][--hora] = leia.next();

				break;

			case 2:
				for (int i = 0; i < tarefa.length; i++) {
					for (int j = 0; j < tarefa[i].length; j++) {
						for (int k = 0; k < tarefa[i][j].length; k++) {

							if (tarefa[i][j][k] != null) {
								System.out.println("M�s " + ++i + " dia " + ++j + " �s " + ++k + "h. Tarefa: " + tarefa[i][j][k]);
								System.out.println("");
							}
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