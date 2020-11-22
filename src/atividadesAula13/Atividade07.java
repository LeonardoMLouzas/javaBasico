package atividadesAula13;
import java.util.Scanner;

// Faça um programa que calcule a área de um quadrado e em seguida mostre o dobro desta área.

public class Atividade07 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de um dos lados do quadrado: ");
		double l1 = scan.nextDouble();
		
		System.out.println("O dobro da área é: "+ (Math.pow(l1, 2)*2));
	}
}