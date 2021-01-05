package atividadesAula27;

import java.util.Scanner;

public class Atividade04 {

    Scanner leia = new Scanner(System.in);

    char[][] tabuleiro = new char[3][3];
    int jogadas = 1, linha = 0, coluna = 0;
    boolean fimdejogo = false;
    char sinal;

    void mostrarTabuleiro() {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {

                System.out.print("[" + tabuleiro[i][j] + "]");
            }
            System.out.println("");
        }
    }

    void jogada() {

        if (jogadas % 2 == 1) { // Jogador 1
            System.out.println("\n\n\n\n\n\nJogador 1. Fa�a sua jogada!");
            sinal = 'X';

        } else { // Jogador 2
            System.out.println("\n\n\n\n\n\nJogador 2. Fa�a sua jogada!");
            sinal = 'O';
        }

        validarJogada();

    }

    void validarJogada() {

        boolean linhaValida = false;
        while (!linhaValida) {
            System.out.println("Digite a linha: ");
            linha = leia.nextInt();

            if (linha >= 1 && linha <= 3) {
                linhaValida = true;

            } else {
                System.out.println("Linha inv�lida. Tente novamente!");
            }
        }

        boolean colunaValida = false;
        while (!colunaValida) {
            System.out.println("Digite a coluna: ");
            coluna = leia.nextInt();

            if (coluna >= 1 && coluna <= 3) {
                colunaValida = true;

            } else {
                System.out.println("Coluna inv�lida. Tente novamente!");
            }
        }

        linha--;
        coluna--;
        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
            System.out.println("Posi��o j� preenchida. Tente novamente!");
        } else {
            tabuleiro[linha][coluna] = sinal;
            jogadas++;
        }
    }

    void verificarGanhador() {

        if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // Linha 1
                (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // Linha 2
                (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // Linha 3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // Coluna 1
                (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // Coluna 2
                (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // Coluna 3
                (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || // Diagonal 1
                (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X')) { // Diagonal 2

            System.out.println("Jogador 1 venceu. Parab�ns!");
            fimdejogo = true;
        } else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // Linha 1
                (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // Linha 2
                (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // Linha 3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // Coluna 1
                (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // Coluna 2
                (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // Coluna 3
                (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || // Diagonal 1
                (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O')) { // Diagonal 2

            System.out.println("Jogador 2 venceu. Parab�ns!");
            fimdejogo = true;
        } else if (jogadas > 9) {
            System.out.println("Jogo acabou. Empate!");
            fimdejogo = true;
        }
    }
}