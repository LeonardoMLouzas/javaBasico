package atividadesAula19;

//Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se para implementar um programa que determine o percentual de números 0's e 1's existentes no vetor A.

public class Atividade22 {

	public static void main(String[] args) {

		double totalZero = 0;
		double totalUm = 0;

		int[] a = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 2);

			System.out.print(a[i] + " ");
			if (a[i] == 0) {
				totalZero++;
			} else {
				totalUm++;
			}
		}
		System.out.println("\nPorcentual de números zero: " + (totalZero / a.length) * 100 + "%");
		System.out.println("Porcentual de números Um: " + (totalUm / a.length) * 100 + "%");
	}
}
