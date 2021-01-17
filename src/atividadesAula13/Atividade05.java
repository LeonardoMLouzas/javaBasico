package atividadesAula13;
import java.util.Scanner;

//Faa um programa que converta metros para centímetros.

public class Atividade05 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite os metros: ");
		double n1 = scan.nextDouble();
		
		System.out.print("O valor em centímetros é: " + n1*100);
	}
}