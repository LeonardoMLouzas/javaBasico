package atividadesAula15;

import java.util.Scanner;

// Fa�a um programa que pe�a os 3 lados de um tr�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo.
// Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
// Tr�s lados formam um tri�ngulo quando a soma de quaisquer lados for maior que o terceiro;
// Equil�tero: Tr�s lados iguais.
// Is�sceles: Quaisquer dois lados iguais.
// Escaleno: Tr�s lados diferentes.

public class Atividade15 {

	public static void main(String[] Args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digita o tamanho de um dos lados:");
		double lado1 = leia.nextDouble();

		System.out.println("Digita o tamanho do segundo lado:");
		double lado2 = leia.nextDouble();

		System.out.println("Digita o tamanho do terceiro lado:");
		double lado3 = leia.nextDouble();

		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado3 + lado2) > lado1)) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Quadrado Equil�tero.");
				
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Quadrado Escaleno.");
				
			} else if ((lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
					&& (lado1 != lado2 || lado2 != lado3 || lado1 != lado3)) {
				System.out.println("Quadrado Is�sceles.");
				
			}
		} else {
			System.out.println("N�o � um tri�ngulo.");
			
		}
	}
}