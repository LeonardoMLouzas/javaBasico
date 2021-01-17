package atividadesAula13;
import java.util.Scanner;

//Faça um programa que lê a temperatuta em Celsius e mostre a mesma temperatura em Fahrenheit.


public class Atividade10 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite os graus em Celsius: ");
		double c = scan.nextDouble();
		
		System.out.print("A temperatura em Fahrenheit é: " +((c*9/5)+32));
	}
}