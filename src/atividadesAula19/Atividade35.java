package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os divisores do respectivo elemento.

public class Atividade35 {

	public static void main(String[] args) {

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			for (int j = 1; j <= a[i]; j++) {

				if (a[i] % j == 0) {
					System.out.println(j + " é divisor de " + a[i]);
				}
			}
			System.out.println("");
		}
	}
}