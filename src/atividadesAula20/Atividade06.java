package atividadesAula20;

import java.util.Scanner;

//Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posiçãoo onde deseja colocar a sua peça ("O" ou "X"). O programa deve impedir jogadas inválidas edeterminar automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

public class Atividade06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		char[][] tabuleiro = new char[3][3];
		boolean sair = false, jogadaValida = false;
		int opcao = 0, x = 0, y = 0, vencedor = 3, jogada = 0;

		while ((vencedor != 0) || (vencedor != 1) || jogada <= 9) {

			jogadaValida = false;
			for (int i = 0; i < tabuleiro.length; i++) {
				for (int j = 0; j < tabuleiro[i].length; j++) {

					System.out.print("[" + tabuleiro[i][j] + "]");
				}
				System.out.println("");
			}
			while (!jogadaValida) {

				System.out.println("Jogador 1. Digite a linha da sua jogada: ");
				x = leia.nextInt();
				System.out.println("Jogador 1. Digite a coluna da sua jogada: ");
				y = leia.nextInt();

				if (((x >= 0 && x <= 2) && (y >= 0 && y <= 2))
						&& ((tabuleiro[x][y] != 'X') && (tabuleiro[x][y] != 'O'))) {
					jogadaValida = true;
					tabuleiro[x][y] = 'X';
					jogada++;

				} else {
					System.out.println("Jogada inválida. Tente novamente.");
				}
			}
			jogadaValida = false;
			while (!jogadaValida) {

				if (jogada == 9) {
					jogadaValida = true;
				} else {
					System.out.println("Jogador 2. Digite a linha da sua jogada: ");
					x = leia.nextInt();
					System.out.println("Jogador 2. Digite a coluna da sua jogada: ");
					y = leia.nextInt();
					if (((x >= 0 && x <= 2) && (y >= 0 && y <= 2))
							&& ((tabuleiro[x][y] != 'X') && (tabuleiro[x][y] != 'O'))) {
						jogadaValida = true;
						tabuleiro[x][y] = 'O';
						jogada++;
					} else {
						System.out.println("Jogada inválida. Tente novamente.");
					}
				}
			}
			if ((tabuleiro[0][0] == 'O') && (tabuleiro[0][1] == 'O') && (tabuleiro[0][2] == 'O')
					|| (tabuleiro[1][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[1][2] == 'O')
					|| (tabuleiro[2][0] == 'O') && (tabuleiro[2][1] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][0] == 'O') && (tabuleiro[1][0] == 'O') && (tabuleiro[2][0] == 'O')
					|| (tabuleiro[0][1] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][1] == 'O')
					|| (tabuleiro[0][2] == 'O') && (tabuleiro[1][2] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][2] == 'O')
					|| (tabuleiro[0][2] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][0] == 'O')) {

				vencedor = 1;

			} else if ((tabuleiro[0][0] == 'X') && (tabuleiro[0][1] == 'X') && (tabuleiro[0][2] == 'X')
					|| (tabuleiro[1][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[1][2] == 'X')
					|| (tabuleiro[2][0] == 'X') && (tabuleiro[2][1] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][0] == 'X') && (tabuleiro[1][0] == 'X') && (tabuleiro[2][0] == 'X')
					|| (tabuleiro[0][1] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][1] == 'X')
					|| (tabuleiro[0][2] == 'X') && (tabuleiro[1][2] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][2] == 'X')
					|| (tabuleiro[0][2] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][0] == 'X')) {

				vencedor = 0;
			}

			if (vencedor == 0) {
				System.out.println("");
				System.out.println("O jogador 1 é o vencedor!");
				System.out.println("");
				break;
			} else if (vencedor == 1) {
				System.out.println("");
				System.out.println("O jogador 2 é o vencedor!");
				System.out.println("");
				break;
			} else if (jogada > 9) {
				System.out.println("");
				System.out.println("O jogo terminou empatado!");
				System.out.println("");
				break;
			}
		}
	}
}