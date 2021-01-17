package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição (ou índice), ou seja: B[i] = A[i] 

public class Atividade05 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[a.length];

		for (int temp : a) {

			a[temp] = 5;

			b[temp] = a[temp] * temp;

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
		}
	}
}