package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que defina o percentual de elementos pares e ímpares, respectivamente, armazenados neste vetor.

public class Atividade15 {

	public static void main(String[] args) {

		double par = 0;
		double impar = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			System.out.print(a[i] + " ");

			if (a[i] % 2 != 0) {
				impar++;
			} else {
				par++;
			}
		}
		System.out.println("\nA porcentagem de números pares: " + (par / a.length) * 100 + "%");
		System.out.println("A porcentagem de números ímpares: " + (impar / a.length) * 100 + "%");
	}
}