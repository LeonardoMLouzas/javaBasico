package atividadesAula13;
import java.util.Scanner;

// Fa�a um Programa que l� 2 n�meros inteiros e 1 n�mero real, calcule e mostre:
//   A) O produto do dobro do primeiro com metade do segundo. 
//   B) A soma do tripo do primeiro com o terceiro. 
//   C) O terceiro elevado ao cubo

public class Atividade11 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero inteiro, o segundo n�mero inteiro e o n�mero real: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		double d1 = scan.nextDouble();
		
		System.out.println("A): "+((n1*2)*(n2/2)));
		System.out.println("B): "+((n1*3)+d1));
		System.out.println("C): "+Math.pow(d1, 3));
		
	}
}