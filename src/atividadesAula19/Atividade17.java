package atividadesAula19;

//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior a 35 anos.

public class Atividade17 {

	public static void main(String[] args) {

		int maior = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 80);
			System.out.print(a[i] + " ");

			if (a[i] > 35) {
				maior++;
			}
		}
		System.out.println("\n" + maior);
	}
}