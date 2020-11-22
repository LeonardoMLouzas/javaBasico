package atividadesAula15;
import java.util.Scanner;

// faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

public class Atividade08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor dos três produtos:");
		Double num1 = leia.nextDouble();
		Double num2 = leia.nextDouble();
		Double num3 = leia.nextDouble();
		
		if (num1 < num2 && num1 < num3) {
			System.out.println("Você deve comprar o de: " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("Você deve comprar o de: " + num2);
		} else if (num3 < num1 && num3 < num2){
			System.out.println("Você deve comprar o de: " + num3);			
		}
	}

}
