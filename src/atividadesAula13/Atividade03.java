package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê dois números e imprime a soma deles.

public class Atividade03 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double n1 = scan.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double n2 = scan.nextDouble();
		
		System.out.println("A soma deles é:" + (n1 + n2));
	}
}