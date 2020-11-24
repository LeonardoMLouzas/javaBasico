package atividadesAula15;

import java.util.Scanner;

// Faça um programa que leia três números e mostre o maior e o menor deles.

public class Atividade07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite três números: ");

		double num1 = leia.nextDouble();
		double num2 = leia.nextDouble();
		double num3 = leia.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é: " + num1);
			
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é: " + num2);
			
		} else if (num3 > num1 && num3 > num2){
			System.out.println("O maior número é: " + num3);
			
		} else {
			System.out.println("Os número são iguais.");
			
		}
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("O menor número é: " + num1);
			
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor número é: " + num2);
			
		} else if (num3 < num1 && num3 < num2){
			System.out.println("O menor número é: " + num3);
			
		}
	}
}