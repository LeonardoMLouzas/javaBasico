package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.

public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		double total = 0;
		
		for (int i=1; i<6; i++) {
			System.out.println("Digite o " + i + "� n�mero: ");
			numero = leia.nextInt();
			total += numero;
			
		}
		
		System.out.println("A soma deles �: " + total);
		System.out.println("A m�dia deles �: " + total/5);

	}
}