package atividadesAula19;

//Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos vetor B e C serão armazenados o valores pares e ímpares de A, respectivamente.

public class Atividade30 {

	public static void main(String[] args) {

		int[] a = new int[20];
		int[] b = new int[20];
		int[] c = new int[20];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			if (a[i] % 2 == 0) {
				b[i] = a[i];
			} else {
				c[i] = a[i];
			}

			System.out.println(a[i] + " | " + b[i] + " | " + c[i]);
		}
	}
}