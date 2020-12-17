package atividadesAula19;

//Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]

public class Atividade01 {

	public static void main(String[] args) {

		int[] a = new int[5];
		int[] b = new int[a.length];

		for (int temp : a) {

			a[temp] = 3;

			b[temp] = a[temp];

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
		}
	}
}