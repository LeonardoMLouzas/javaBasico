package atividadesAula13;
import java.util.Scanner;

//Fa�a um programa que converta metros para cent�metros.

public class Atividade05 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite os metros: ");
		double n1 = scan.nextDouble();
		
		System.out.print("O valor em cent�metros �: " + n1*100);
		
	}
}