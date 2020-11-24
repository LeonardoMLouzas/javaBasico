package atividadesAula17;
import java.util.Scanner;

//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares

public class Atividade14 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println("Digite o " + i + "º númrero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
				
			} else if (numero % 2 != 0) {
				impar++;
				
			}
		}
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);
	}
}