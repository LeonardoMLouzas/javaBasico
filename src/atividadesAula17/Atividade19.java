package atividadesAula17;

import java.util.Scanner;

//Faça um programa que calcule e mostre a média aritmética de N notas

public class Atividade19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("Quantas notas serão calculadas? ");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade ; i++ ) {
			
			System.out.println("Digite a " + i + "º nota: ");
			double nota = leia.nextDouble();
			
			total += nota;
		}
		System.out.println("A média é: " + (total/quantidade));
	}
}