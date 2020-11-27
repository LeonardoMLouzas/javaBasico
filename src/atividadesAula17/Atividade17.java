package atividadesAula17;

import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//Ex.: 5!=5.4.3.2.1=120

public class Atividade17 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número a ser fatorado: ");
		int numero = leia.nextInt();

		for (int i = numero - 1; i >= 1; i--) {

			numero = numero * i;
		}

		System.out.println("total é: " + numero);
	}
}