package atividadesAula19;

//Números palíndromos são aqueles que escritos da direita para a esquerda têm o mesmo valor quando escritos da esquerda para a direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao último, se o segundo elemento do vetor é igual ao penúltimo e assim por diante até verificar todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.

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

			System.out.println("\nO Array é um palindromo.");
		} else {

			System.out.println("\nO Array não é um palindromo.");
		}
	}
}