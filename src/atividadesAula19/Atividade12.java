package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina e escreva a soma de todos os elementos armazenados neste vetor.

public class Atividade12 {

	public static void main(String[] args) {

		int total = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			total += a[i];
			System.out.println(a[i]);
		}
		System.out.println("O total é: " + total);
	}
}