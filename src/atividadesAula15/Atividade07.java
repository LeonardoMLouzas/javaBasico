package atividadesAula15;

import java.util.Scanner;

// Fa�a um programa que leia tr�s n�meros e mostre o maior e o menor deles.

public class Atividade07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros: ");

		double num1 = leia.nextDouble();
		double num2 = leia.nextDouble();
		double num3 = leia.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior n�mero �: " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior n�mero �: " + num2);
		} else if (num3 > num1 && num3 > num2){
			System.out.println("O maior n�mero �: " + num3);			
		} else {
			System.out.println("Os n�mero s�o iguais.");
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor n�mero �: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor n�mero �: " + num2);
		} else if (num3 < num1 && num3 < num2){
			System.out.println("O menor n�mero �: " + num3);			
		}
	}

}
