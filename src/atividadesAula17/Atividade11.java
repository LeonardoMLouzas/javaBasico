package atividadesAula17;

import java.util.Scanner;

//Altere o programa anterior para mostrar no final a soma dos números. 

public class Atividade11 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0, numeroMenor, numeroMaior;

		System.out.println("Digite o menor número: ");
		numeroMenor = leia.nextInt();

		System.out.println("Digite o maior número: ");
		numeroMaior = leia.nextInt();

		numeroMenor++;
		
		for (; numeroMenor < numeroMaior; numeroMenor++) {
			
			soma += numeroMenor;
			System.out.print(numeroMenor + " ");

		}
		System.out.println("");
		System.out.println("A soma deles é: " + soma);
	}
}