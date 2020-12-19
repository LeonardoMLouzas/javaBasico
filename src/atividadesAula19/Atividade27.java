package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, obedecendo as seguintes regras de forma��o:
// a) Bi dever� receber 'a' quando Ai for menor que 7
// b) Bi dever� receber 'b' quando Ai for igual a 7
// c) Bi dever� receber 'c' quando Ai for maior que 7 e menor que 10
// d) Bi dever� receber 'd' quando Ai for igual a 10
// e) Bi dever� receber 'e' quando Ai for maior que 10. Sugest�o: char B[10]

public class Atividade27 {

	public static void main(String[] args) {

		int[] a = new int[10];
		char[] b = new char[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 20);

			if (a[i] < 7) {
				b[i] = 'a';
			} else if (a[i] == 7) {
				b[i] = 'b';
			} else if (a[i] > 7 && a[i] < 10) {
				b[i] = 'c';
			} else if (a[i] == 10) {
				b[i] = 'd';
			} else if (a[i] > 10) {
				b[i] = 'e';
			}

			System.out.println(a[i] + " | " + b[i]);
		}
	}
}