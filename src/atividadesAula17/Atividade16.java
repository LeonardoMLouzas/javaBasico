package atividadesAula17;

import java.util.Scanner;

//Altere o programa anterior para que a sequencia pare quando o termo chegar/passar de 500.

public class Atividade16 {

	public static void main(String[] args) {


		int antecessor = 1, sucessor = 1, aux = 0;

		System.out.print(antecessor + " ");
		System.out.print(sucessor + " ");
		for (int i = 0; sucessor <= 500; i++) {

			System.out.print(antecessor + sucessor + " ");
			aux = sucessor;
			sucessor = antecessor + sucessor;
			antecessor = aux;
		}
	}
}