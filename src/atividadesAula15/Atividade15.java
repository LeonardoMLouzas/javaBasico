package atividadesAula15;

import java.util.Scanner;

// Faça um programa que peça os 3 lados de um trângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
// Três lados formam um triângulo quando a soma de quaisquer lados for maior que o terceiro;
// Equilátero: Três lados iguais.
// Isósceles: Quaisquer dois lados iguais.
// Escaleno: Três lados diferentes.

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
				System.out.println("Quadrado Equilátero.");
				
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("Quadrado Escaleno.");
				
			} else if ((lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
					&& (lado1 != lado2 || lado2 != lado3 || lado1 != lado3)) {
				System.out.println("Quadrado Isósceles.");
				
			}
		} else {
			System.out.println("Não é um triângulo.");
			
		}
	}
}