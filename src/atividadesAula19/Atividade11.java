package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a quantidade de elementos armazenados neste vetor que s�o pares.

public class Atividade11 {

	public static void main(String[] args) {

		int par = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			if (a[i] % 2 == 0) {
				par++;
			}

			System.out.print(a[i] + " ");
		}
		System.out.println("\nQuantidade de n�meros pares: " + par);
	}
}