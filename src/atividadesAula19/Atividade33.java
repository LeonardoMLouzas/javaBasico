package atividadesAula19;

//riar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e uma mensagem indicando se o respectivo elemento é um número primo ou não.

public class Atividade33 {

	public static void main(String[] args) {

		int[] a = new int[10];
		boolean primo = true;

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0)
					primo = false;
			}
			if (primo == true) {
				System.out.println("O número " + a[i] + " é primo.");
			} else {
				System.out.println("O número " + a[i] + " não é primo.");
			}
		}
	}
}