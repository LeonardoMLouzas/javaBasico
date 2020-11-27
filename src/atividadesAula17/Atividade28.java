package atividadesAula17;
import java.util.Scanner;

//Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo.

public class Atividade28 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean primo = true;

		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				primo = false;
		}
		if (primo == true) {
			System.out.println("O número é primo.");

		} else {
			System.out.println("O número não é primo.");
			
		}
	}
}