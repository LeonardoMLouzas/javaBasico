package atividadesAula17;

import java.util.Scanner;

// Fa�a um programa que pe�a uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio informe um valor v�lido.

public class Atividade01 {

	public static void main(String[] Args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de uma nota entre 0 e 10: ");
		int nota = leia.nextInt();

		while (nota < 0 || nota > 10) {

			System.out.println("Valor inv�lido. Tente novamente: ");
			nota = leia.nextInt();
		}
		System.out.println("nota digitada: " + nota);
	}
}