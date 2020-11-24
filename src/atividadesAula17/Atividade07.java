package atividadesAula17;

import java.util.Scanner;

//Faça um programa que leia 5 números e informe o maior número.

public class Atividade07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero = 0;
		int maior = -2147483648;

		for (int i = 1; i < 6; i++) {
			System.out.println("digite o " + i + "º número:");
			numero = leia.nextInt();
			if (numero > maior) {
				maior = numero;
				
			}
		}
		
		System.out.println("O maior número é: " + maior);
	}
}