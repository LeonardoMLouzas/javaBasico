package atividadesAula13;
import java.util.Scanner;

// Fa�a um programa que l� a altura de uma pessoa e mostre o peso ideal utilizando a f�rmula: (72.7*altura)-58

public class Atividade12 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double a = scan.nextDouble();
		
		System.out.print("Sua altura ideal �: " + ((72.7*a)-58));
	}
}