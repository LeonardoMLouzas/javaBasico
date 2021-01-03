package atividadesAula20;

//Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0-9. Ap�s isso, determine o maior n�mero da matriz e a sua posi��o (linha/coluna).

public class Atividade01 {

	public static void main(String[] args) {

		int[][] m = new int[4][4];
		int maior = 0, linha = 0, coluna = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				m[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				System.out.print(m[i][j] + " ");

				if (m[i][j] > maior) {
					maior = m[i][j];
					coluna = j;
					linha = i;
				}
			}
			System.out.println();
		}
		System.out.println("Maior valor: " + maior);
		System.out.println("Linha: " + linha + "\nColuna: " + coluna);
	}
}