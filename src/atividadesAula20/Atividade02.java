package atividadesAula20;

//Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso indique qual é o maior e o menor valor da linha 5 e qual o menor e maior valor da coluna 7.

public class Atividade02 {

	public static void main(String[] args) {

		int[][] m = new int[10][10];
		int maior1 = 0, maior2 = 0, menor1 = 10, menor2 = 10;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				m[i][j] = (int) (Math.random() * 10);
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				System.out.print(m[i][j] + " ");
				if (i == 5) {
					if (m[i][j] > maior1) {
						maior1 = m[i][j];
					}
					if (m[i][j] < menor1) {
						menor1 = m[i][j];
					}
				}
				if (j == 7) {
					if (m[i][j] > maior2) {
						maior2 = m[i][j];
					}
					if (m[i][j] < menor2) {
						menor2 = m[i][j];
					}
				}
			}
			System.out.println();
		}
		System.out.println("\nMaior da linha 5: " + maior1 + "\nMenor da linha 5: " + menor1);
		System.out.println("Maior da coluna 7: " + maior2 + "\nMenor da coluna 7: " + menor2);
	}
}