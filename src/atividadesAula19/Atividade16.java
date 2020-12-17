package atividadesAula19;

//riar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva: a) a soma de elementos armazenados neste vetor que são inferiores a 15; b) a quantidade de elementos armazenados no vetor que são iguais a 15; e c) a média dos elementos armazenados no vetor que são superiores a 15.

public class Atividade16 {

	public static void main(String[] args) {

		int inferior = 0;
		int quinze = 0;
		int superior = 0;
		int superiorTotal = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 30);

			if (a[i] < 15) {
				inferior += a[i];
			} else if (a[i] > 15) {
				superior += a[i];
				superiorTotal++;
			} else {
				quinze++;
			}
			System.out.print(a[i] + " ");
		}
		System.out.println("\nA: " + inferior);
		System.out.println("B: " + quinze);
		System.out.println("C: " + (superior / superiorTotal));
	}
}