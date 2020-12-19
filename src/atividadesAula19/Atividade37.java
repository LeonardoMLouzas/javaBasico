package atividadesAula19;

//Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do elemento correspondente em A.

public class Atividade37 {

	public static void main(String[] args) {

		int temp = 0;
		int[] a = new int[15];
		int[] b = new int[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 10);
		}
	}
}