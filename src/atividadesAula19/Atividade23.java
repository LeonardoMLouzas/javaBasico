package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se "todos" os elementos do vetor A são pares. Se pelo menos um elemento do vetor não for par o processo de repetição para percorrer os elementos do vetor deve ser encerrado, como sugestão: utilize uma variável do tipo flag para atingir este propósito.

public class Atividade23 {

	public static void main(String[] args) {

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			System.out.print(a[i] + " ");
			if (a[i] % 2 != 0) {
				break;
			}
		}
	}
}
