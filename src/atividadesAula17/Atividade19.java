package atividadesAula17;

import java.util.Scanner;

//Fa�a um programa que calcule e mostre a m�dia aritm�tica de N notas

public class Atividade19 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("Quantas notas ser�o calculadas? ");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade ; i++ ) {
			
			System.out.println("Digite a " + i + "� nota: ");
			double nota = leia.nextDouble();
			
			total += nota;
		}
		System.out.println("A m�dia �: " + (total/quantidade));
	}
}