package atividadesAula19;

//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).

public class Atividade04 {

	public static void main(String[] args) {

		int[] a = new int[15];
		int[] b = new int[a.length];

		for (int temp : a) {

			a[temp] = 5;

			b[temp] = (int) Math.sqrt(a[temp]);

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
		}
	}
}