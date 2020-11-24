package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê a altura de uma pessoa e mostre o peso ideal utilizando a fórmula: (72.7*altura)-58

public class Atividade12 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura em metros: ");
		double a = scan.nextDouble();
		
		System.out.print("Seu peso ideal é: " + ((72.7*a)-58));
	}
}