package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser conforme o exemplo abaixo: o Fatorial de: 5 o 5! = 5 . 4 . 3 . 2 . 1 = 120

public class Atividade26 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o n�mero a ser fatorado: ");
		
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