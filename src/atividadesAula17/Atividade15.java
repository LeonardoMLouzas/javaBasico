package atividadesAula17;
import java.util.Scanner;

//A s�rie de Fibonacci � formada pela sequ�ncia 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
//Fa�a um programa capaz de gerar a s�rie at� o n-�simo termo.

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