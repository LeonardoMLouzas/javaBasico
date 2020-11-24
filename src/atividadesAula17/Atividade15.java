package atividadesAula17;
import java.util.Scanner;

//A série de Fibonacci é formada pela sequência 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
//Faça um programa capaz de gerar a série até o n-ésimo termo.

public class Atividade15 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int antecessor = 1, sucessor = 1, aux = 0;
		System.out.println("Digite a quantidade de termos que deseja ver: ");
		int escolha = leia.nextInt();

		System.out.print(antecessor + " ");
		System.out.print(sucessor + " ");
		for (int i = 0; i <= escolha; i++) {

			System.out.print(antecessor + sucessor + " ");
			aux = sucessor;
			sucessor = antecessor + sucessor;
			antecessor = aux;
		}
	}
}