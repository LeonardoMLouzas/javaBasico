package atividadesAula19;

//Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que cada elemento do vetor A � formado pela pot�ncia de base 2 elevado ao expoente igual a posi��o do respectivo elemento, ou seja: A[i] = 2i . Sugest�o int A[11];

public class Atividade36 {

	public static void main(String[] args) {

		int[] a = new int[11];

		for (int i = 0; i < a.length; i++) {

			a[i] = 2 ^ (i);

			System.out.print(a[i] + " ");
		}
	}
}