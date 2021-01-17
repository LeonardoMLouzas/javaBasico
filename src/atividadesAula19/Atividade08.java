package atividadesAula19;

//Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos em A e B, ou seja: C[i] = A[i] * B[i].

public class Atividade08 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];

		for (int temp : a) {

			a[temp] = 3;

			b[temp] = a[temp];

			c[temp] = a[temp] * b[temp];

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
			System.out.println("C: " + c[temp]);
		}
	}
}