package atividadesAula19;

//Criar um vetor A com 10 elementos inteiros. Implementar um programa que determine a soma dos elementos armazenados neste vetor que são múltiplos de 5.

public class Atividade13 {

	public static void main(String[] args) {

		int multiplos = 0;
		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);

			System.out.print(a[i] + " ");

			if (a[i] % 5 == 0) {
				multiplos++;
			}
		}
		System.out.println("\nA quantidade de números múltiplos de 5 é: " + multiplos);
	}
}