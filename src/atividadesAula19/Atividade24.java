package atividadesAula19;

//N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda t�m o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros � um pal�ndromo, ou seja, se o primeiro elemento do vetor e igual ao �ltimo, se o segundo elemento do vetor � igual ao pen�ltimo e assim por diante at� verificar todos os elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.

public class Atividade24 {

	public static void main(String[] args) {

		boolean palindromo = true;

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			System.out.print(a[i] + " ");
		}

		for (int i = 0, j = 9; i < a.length; i++, j--) {

			if (a[i] != a[j]) {

				palindromo = false;
			}
		}
		if (palindromo == true) {

			System.out.println("\nO Array � um palindromo.");
		} else {

			System.out.println("\nO Array n�o � um palindromo.");
		}
	}
}