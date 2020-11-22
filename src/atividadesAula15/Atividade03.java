package atividadesAula15;

import java.util.Scanner;

//Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra, escreva: F - Feminino, M - Masculino ou Sexo inválido.

public class Atividade03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu sexo (F ou M): ");
		String sexo = leia.nextLine();

		switch (sexo) {

		case "F":
			System.out.println("F - Feminino.");
			break;
		case "M":
			System.out.println("M - Masculino.");
			break;
		default:
			System.out.println("Sexo inválido.");
			break;
		}
	}
}
