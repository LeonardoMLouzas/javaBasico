package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a m�dia aritm�tica simples dos elementos �mpares armazenados neste vetor.

public class Atividade14 {

	public static void main(String[] args) {

		double impar = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			System.out.print(a[i] + " ");

			if (a[i] % 2 != 0) {
				impar++;
			}
		}
		System.out.println("\nA quantidade de n�meros �mpar: " + impar + ". A m�dia �: " + a.length/impar);
		
	}
}