package atividadesAula19;

//Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento, ou seja: A[i] = 2i . Sugestão int A[11];

public class Atividade36 {

	public static void main(String[] args) {

		int[] a = new int[11];

		for (int i = 0; i < a.length; i++) {

			a[i] = 2 ^ (i);

			System.out.print(a[i] + " ");
		}
	}
}