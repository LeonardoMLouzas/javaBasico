package atividadesAula19;

//Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2
public class Atividade02 {

	public static void main(String[] Args) {

		int[] a = new int[8];
		int[] b = new int[a.length];

		for (int temp : a) {

			a[temp] = 5;

			b[temp] = a[temp] * 2;

			System.out.println("A: " + a[temp]);
			System.out.println("B: " + b[temp]);
		}
	}
}