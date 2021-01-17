package atividadesAula15;

import java.util.Scanner;

// Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada pelo aluno e apresentar:
// A mensagem "Aprovado" se a média for maior ou igual a 7.
// A mensagem "Reprovado" se a média for menor que 7.
// A mensagem "Perfeito" se a média for igual a 10.

public class Atividade05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua primeira e segunda nota:");
		double nota1 = leia.nextDouble();
		double nota2 = leia.nextDouble();

		nota1 = ((nota1 + nota2) / 2);

		if (nota1 == 10) {
			System.out.println("Perfeito. Média: " + nota1);
			
		} else if (nota1 >= 7) {
			System.out.println("Aprovado. Média: " + nota1);
			
		} else {
			System.out.println("Reprovado. Média: " + nota1);
			
		}
	}
}
