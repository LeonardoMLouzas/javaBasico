package atividadesAula19;

//Ler um vetor A com 20 elementos. Separar os elementos pares e �mpares de A utilizando apenas um vetor extra B. Sugest�o: no in�cio do vetor B armazene os elementos pares de A e nas posi��es restantes do vetor B armazene os elementos de A que s�o �mpares.

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