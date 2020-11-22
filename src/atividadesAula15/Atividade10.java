package atividadesAula15;

import java.util.Scanner;

// Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno.
// Imprima a mensagem "Bom diA!", "Boa Tarde!" ou "Boa Noite!" ou "Valor inválido!", conforme o caso.

public class Atividade10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu turno (M, V ou N): ");
		String turno = leia.nextLine();

		switch (turno) {

		case "m":
		case "M":
			System.out.println("Bom diA!");
			break;

		case "v":
		case "V":
			System.out.println("Boa Tarde!");
			break;

		case "n":
		case "N":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Valor inválido!");
		}
	}
}
