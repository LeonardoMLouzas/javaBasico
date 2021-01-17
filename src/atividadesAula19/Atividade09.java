package atividadesAula19;

//riar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja: C[i] = A[i] / float(B[i]).

public class Atividade09 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];

		for (int temp : a) {

			a[temp] = 3;

			b[temp] = a[temp];

			c[temp] = a[temp] / b[temp];

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
			System.out.println("C: " + c[temp]);
		}
	}
}