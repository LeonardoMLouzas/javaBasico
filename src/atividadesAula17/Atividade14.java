package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares

public class Atividade14 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println("Digite o " + i + "� n�mrero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
				
			} else if (numero % 2 != 0) {
				impar++;
				
			}
		}
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);
	}
}