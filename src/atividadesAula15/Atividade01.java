package atividadesAula15;

import java.util.Scanner;

//Fa�a um programa que pe�a dois n�meros e imprima o maior deles.

public class Atividade01 {

	public static void main(String[] Args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		int num = scan.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();

		if (num > num2) {
			System.out.println("O maior n�mero �: " + num);
			
		} else if (num2 > num) {
			System.out.println("O maior n�mero �: " + num2);
			
		} else {
			System.out.println("Os n�meros s�o iguais.");
			
		}
	}
}