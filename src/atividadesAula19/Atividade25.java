package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for ímpar.

public class Atividade25 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			if (a[i] % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
			System.out.println(a[i] + " | " + b[i]);
		}
	}
}