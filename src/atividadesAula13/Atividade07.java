package atividadesAula13;
import java.util.Scanner;

// Fa�a um programa que calcule a �rea de um quadrado e em seguida mostre o dobro desta �rea.

public class Atividade07 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor de um dos lados do quadrado: ");
		double l1 = scan.nextDouble();
		
		System.out.println("O dobro da �rea �: "+ (Math.pow(l1, 2)*2));
	}
}