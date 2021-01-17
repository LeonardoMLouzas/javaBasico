package atividadesAula17;

import java.util.Scanner;

//Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos

public class Atividade34 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o valor de n:");
		int n = leia.nextInt();

		double soma = 0;

		for (int i = 1; i <= n; i++) {

			soma += 1 / i;
		}
		System.out.println("Soma = " + soma);
	}

}
