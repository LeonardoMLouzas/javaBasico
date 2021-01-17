package atividadesAula17;

import java.util.Scanner;

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

public class Atividade10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numeroMenor, numeroMaior;

		System.out.println("Digite o menor número: ");
		numeroMenor = leia.nextInt();

		System.out.println("Digite o maior número: ");
		numeroMaior = leia.nextInt();

		numeroMenor++;
		for (; numeroMenor < numeroMaior; numeroMenor++) {

			System.out.print(numeroMenor + " ");

		}
	}
}