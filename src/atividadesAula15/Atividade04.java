package atividadesAula15;

import java.util.Scanner;

// Fa�a um programa que verifique se uma letra digitada � vogal ou consoante.

public class Atividade04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = leia.nextLine();

		switch (letra) {

		case "a":

		case "e":

		case "i":

		case "o":

		case "u":
			System.out.println("A letra � uma vogal.");
			break;
		default:
			System.out.println("A letra � uma consoante.");
		}
	}
}
