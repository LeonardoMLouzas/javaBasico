package atividadesAula15;

import java.util.Scanner;

//Fa�a um programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra, escreva: F - Feminino, M - Masculino ou Sexo inv�lido.

public class Atividade03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu sexo (F ou M): ");
		String sexo = leia.next();

		switch (sexo) {

		case "F":
			System.out.println("F - Feminino.");
			break;
			
		case "M":
			System.out.println("M - Masculino.");
			break;
			
		default:
			System.out.println("Sexo inv�lido.");
			break;
			
		}
	}
}