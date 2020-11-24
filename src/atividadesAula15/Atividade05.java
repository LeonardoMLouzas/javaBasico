package atividadesAula15;

import java.util.Scanner;

// Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada pelo aluno e apresentar:
// A mensagem "Aprovado" se a m�dia for maior ou igual a 7.
// A mensagem "Reprovado" se a m�dia for menor que 7.
// A mensagem "Perfeito" se a m�dia for igual a 10.

public class Atividade05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua primeira e segunda nota:");
		double nota1 = leia.nextDouble();
		double nota2 = leia.nextDouble();

		nota1 = ((nota1 + nota2) / 2);

		if (nota1 == 10) {
			System.out.println("Perfeito. M�dia: " + nota1);
			
		} else if (nota1 >= 7) {
			System.out.println("Aprovado. M�dia: " + nota1);
			
		} else {
			System.out.println("Reprovado. M�dia: " + nota1);
			
		}
	}
}
