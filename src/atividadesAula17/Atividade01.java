package atividadesAula17;

import java.util.Scanner;

// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.

public class Atividade01 {

	public static void main(String[] Args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de uma nota entre 0 e 10: ");
		int nota = leia.nextInt();

		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido. Tente novamente: ");
			nota = leia.nextInt();
			
		}

		System.out.println("nota digitada: " + nota);
	}
}