package atividadesAula19;

public class Atividade28 {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];

		for (int i = 0; i < a.length; i++) {

			a[i] = (int) (Math.random() * 100);
		}

		for (int i = 0, j = 9; i < a.length; i++, j--) {

			b[i] = a[j];

			System.out.println(a[i] + " | " + b[i]);
		}
	}
}