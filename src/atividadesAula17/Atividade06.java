package atividadesAula17;

import java.util.Scanner;

//Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.

public class Atividade06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		byte escolha = 5;

		while (escolha != 0) {

			System.out.println("Digite 1 para um n�mero abaixo do outro, 2 para um n�mero ao lado do outro e 0 para sair.");
			escolha = leia.nextByte();

			if (escolha == 1) {
				for (int i = 1; i < 21; i++) {

					System.out.println(i);
				}
			} else if (escolha == 2) {
				for (int i = 1; i < 21; i++) {

					System.out.print(i + " ");
				}
				
				System.out.println("");
			} else {
				
				System.out.println("Voc� escolheu sair.");			
			}
		}
	}
}