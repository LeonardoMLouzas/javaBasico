package atividadesAula15;

import java.util.Scanner;

//Faça um programa que peça dois números e imprima o maior deles.

public class Atividade01 {

	public static void main(String[] Args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num = scan.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = scan.nextInt();

		if (num > num2) {
			System.out.println("O maior número é: " + num);
			
		} else if (num2 > num) {
			System.out.println("O maior número é: " + num2);
			
		} else {
			System.out.println("Os números são iguais.");
			
		}
	}
}