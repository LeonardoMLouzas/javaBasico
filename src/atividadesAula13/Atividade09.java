package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê a temperatuta em Fahrenheit e mostre a mesma temperatura em Celsius. C = (5*(F-32)/9)

public class Atividade09 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double f = scan.nextDouble();
		
		System.out.print("A temperatura em Celsius é: "+ (5*(f-32)/9));
	}
}