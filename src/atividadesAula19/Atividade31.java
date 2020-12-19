package atividadesAula19;

//Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B armazene os elementos pares de A e nas posições restantes do vetor B armazene os elementos de A que são ímpares.

public class Atividade31 {

	public static void main(String[] args) {

		int[] a = new int[20];
		int[] b = new int[20];

		for (int i = 0, j = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		for (int i = 0, j = 19; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				b[j] = a[i];
				j--;
			}
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] + " | " + b[i]);
		}
	}
}