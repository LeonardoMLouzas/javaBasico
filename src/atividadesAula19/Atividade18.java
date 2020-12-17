package atividadesAula19;

//Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas. Escreva um programa que determine e escreva a menor e a maior idades e suas respectivas posições.

public class Atividade18 {

	public static void main(String[] args) {

		int menorPosicao = 0;
		int maiorPosicao = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 80);
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {

			if (a[i] > a[maiorPosicao]) {

				maiorPosicao = i;
			}
			if (a[i] < a[menorPosicao]) {

				menorPosicao = i;
			}
		}
		System.out.println("\nMaior: " + a[maiorPosicao] + " posição: " + maiorPosicao);
		System.out.println("Menor: " + a[menorPosicao] + " posição: " + menorPosicao);
	}
}