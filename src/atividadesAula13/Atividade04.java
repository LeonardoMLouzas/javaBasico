package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê 4 notas de um aluno e imprima a média delas.

public class Atividade04 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = scan.nextDouble();
	
		System.out.print("Digite a segunda nota: ");
		double n2 = scan.nextDouble();	
	
		System.out.print("Digite a terceira nota: ");
		double n3 = scan.nextDouble();	

		System.out.print("Digite a quarta nota: ");
		double n4 = scan.nextDouble();
		
		System.out.println("A média é: " + ((n1+n2+n3+n4)/4));
	}
}