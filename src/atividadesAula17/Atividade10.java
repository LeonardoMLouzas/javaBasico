package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles.

public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroMenor, numeroMaior;
		
		System.out.println("Digite o menor n�mero: ");
		numeroMenor = leia.nextInt();
		
		System.out.println("Digite o maior n�mero: ");
		numeroMaior = leia.nextInt();
		
		numeroMenor++;
		for (; numeroMenor < numeroMaior; numeroMenor++) {
			
			System.out.print(numeroMenor + " ");
		}
	}
}