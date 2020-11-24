package atividadesAula15;

import java.util.Scanner;

//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

public class Atividade02 {

	public static void main(String[] Args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero = leia.nextDouble();

		if (numero > 0) {
			System.out.println("O número é positivo.");
			
		} else if (numero < 0) {
			System.out.println("O número é negativo.");
			
		} else {
			System.out.println("O número é zero.");
			
		}
	}
}