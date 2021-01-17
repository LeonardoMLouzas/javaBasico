package atividadesAula19;

//Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) Ci deverã receber 1 quando Ai for maior que Bi; b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for menor que Bi.

public class Atividade26 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);
			b[i] = (int) (Math.random() * 100);

			if (a[i] > b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}

			System.out.println(a[i] + " | " + b[i] + " | " + c[i]);
		}
	}
}
