package atividadesAula19;

//Criar um vetor A com 5 elementos inteiros. Escreva um programa que imprima a tabuada de cada um dos elementos do vetor A.

public class Atividade32 {

	public static void main(String[] args) {

		int[] a = new int[5];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			for (int j = 0; j <= 10; j++) {

				System.out.println(a[i] + " * " + j + " = " + a[i] * j);
			}
			System.out.println("");
		}
	}
}