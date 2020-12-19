package atividadesAula19;

//Ler dois vetores A e B com 10 elementos cada. Construir um vetor C, sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos elementos C deverão receber os elementos de B. Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos. 

public class Atividade29 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[11];
		int[] c = new int[20];

		for (int i = 0, j = 0; i < 20; i++) {

			if (i < 9) {
				a[i] = (int) (Math.random() * 100);
				c[i] = a[i];
				System.out.print("A: " + a[i] + " ");
			} else {
				b[j] = (int) (Math.random() * 100);
				c[i] = b[j];
				System.out.print("B: " + b[j] + " ");
				j++;
			}

			if (i == 8) {
				System.out.println("");
			}
			if (i == 19) {
				System.out.println("");
			}
		}

		for (int i = 0; i < c.length; i++) {
			System.out.print("C: " + c[i] + " ");
		}
	}
}