package atividadesAula17;
import java.util.Scanner;

//Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120. A saída deve ser conforme o exemplo abaixo: o Fatorial de: 5 o 5! = 5 . 4 . 3 . 2 . 1 = 120

public class Atividade26 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número a ser fatorado: ");
		
		int numero = leia.nextInt();
		
		System.out.println("Fatorial de: " + numero);
		System.out.print(numero + "! = " + numero + " . ");
		
		for (int i = numero-1; i > 0; i--) {
			
			System.out.print(i + " ");
			
			numero = numero * i;
			
			if (i > 1) {
				
				System.out.print(". ");
			} else {
				System.out.println("= " + numero);
			}
		}
	}
}