package atividadesAula15;

import java.util.Scanner;

//Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.

public class Atividade02 {

	public static void main(String[] Args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = leia.nextDouble();
		
		if (numero > 0) {
			System.out.println("O n�mero � positivo.");
		} else if (numero < 0) {
			System.out.println("O n�mero � negativo.");
		} else {
			System.out.println("O n�mero � zero.");
		}
	}
}
