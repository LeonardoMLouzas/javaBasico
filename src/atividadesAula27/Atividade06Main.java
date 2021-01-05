package atividadesAula27;

import java.util.Scanner;

//Faça um programa para jogar o jogo da velha. O programa deve permitir que dois jogadores façam uma partida do jogo da velha, usando o computador para ver o tabuleiro. Cada jogador vai alternadamente informando a posiçãoo onde deseja colocar a sua peça ("O" ou "X"). O programa deve impedir jogadas inválidas edeterminar automaticamente quando o jogo terminou e quem foi o vencedor (jogador1 ou jogador2). A cada nova jogada, o programa deve atualizar a situação do tabuleiro na tela.

public class Atividade06Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        char[][] tabuleiro = new char[3][3];
        int jogadas = 1, linha = 0, coluna = 0;
        boolean fimdejogo = false;
        char sinal;

        while (!fimdejogo) {

            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    System.out.print("[" + tabuleiro[i][j] + "] ");
                }
                System.out.println("");
            }

            if (jogadas % 2 == 1) { //Jogador 1
                System.out.println("\n\n\n\n\n\nJogador 1. Faça sua jogada!");
                sinal = 'X';

            } else { //Jogador 2
                System.out.println("\n\n\n\n\n\nJogador 2. Faça sua jogada!");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Digite a linha: ");
                linha = leia.nextInt();

                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;

                } else {
                    System.out.println("Linha inválida. Tente novamente!");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Digite a coluna: ");
                coluna = leia.nextInt();

                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;

                } else {
                    System.out.println("Coluna inválida. Tente novamente!");
                }
            }

            linha--;
            coluna--;
            if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
                System.out.println("Posição já preenchida. Tente novamente!");
            } else {
                tabuleiro[linha][coluna] = sinal;
                jogadas++;
            }

            if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // Linha 1
                    (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // Linha 2
                    (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // Linha 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // Coluna 1
                    (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // Coluna 2
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // Coluna 3
                    (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || // Diagonal 1
                    (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) { // Diagonal 2

                System.out.println("Jogador 1 venceu. Parabéns!");
                fimdejogo = true;
            } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // Linha 1
                    (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // Linha 2
                    (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // Linha 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // Coluna 1
                    (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // Coluna 2
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // Coluna 3
                    (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || // Diagonal 1
                    (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) { // Diagonal 2

                System.out.println("Jogador 2 venceu. Parabéns!");
                fimdejogo = true;
            } else if (jogadas > 9) {
                System.out.println("Jogo acabou. Empate!");
                fimdejogo = true;
            }
        }
        leia.close();
    }
}