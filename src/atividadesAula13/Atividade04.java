package atividadesAula13;
import java.util.Scanner;

// Fa�a um programa que l� 4 notas de um aluno e imprima a m�dia delas.

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
		
		System.out.println("A m�dia �: " + ((n1+n2+n3+n4)/4));
	}
}