package atividadesAula20;

import java.util.Scanner;

//Capture do teclado, valores para preenchimento de uma matriz M 3x3. Após a captura, imprima a matriz criada e encontre a quantidade de números pares e ímpares.

public class Atividade03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] m = new int[3][3];
		int par = 0, impar = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				m[i][j] = leia.nextInt();

				if (m[i][j] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
			}
		}
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números impares: " + impar);
	}
}