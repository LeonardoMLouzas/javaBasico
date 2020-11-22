package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] Args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor: ");

		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Barato.");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto.");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais.");
		} else {
			System.out.println("Muito caro.");
		}
	}
}