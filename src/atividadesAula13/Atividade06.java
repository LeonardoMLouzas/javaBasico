package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê o raio de um circulo, calcule e mostre a área dele.

public class Atividade06 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double r1 = scan.nextDouble();
		
		System.out.print("A ára é:" + (Math.PI*Math.pow(r1, 2)));
		
	}
}