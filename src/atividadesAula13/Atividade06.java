package atividadesAula13;
import java.util.Scanner;

// Fa�a um programa que l� o raio de um circulo, calcule e mostre a �rea dele.

public class Atividade06 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double r1 = scan.nextDouble();
		
		System.out.print("A �ra �:" + (Math.PI*Math.pow(r1, 2)));
		
	}
}