package atividadesAula19;

//Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores [Nota1] e [Nota2] do tipo real. Escreva um programa que calcule a média aritmética simples das notas informadas armazenando o resultado em um vetor [Result] de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação de cada aluno. Se a média calculada for superior ou igual a 7 o aluno estará [aprovado], caso contrário, a situação do aluno será [reprovado].
public class Atividade19 {

	public static void main(String[] args) {

		double[] nota1 = new double[10];
		double[] nota2 = new double[10];
		double[] result = new double[10];

		for (int i = 0; i < nota1.length; i++) {

			nota1[i] = Math.random() * 100;
			nota2[i] = Math.random() * 100;

			result[i] = (nota1[i] + nota2[i]) / 2;

			System.out.println(result[i] + " ");

			if (result[i] >= 70) {

				System.out.println("O aluno " + i + " está aprovado.\n");
			} else {
				System.out.println("O aluno " + i + " está reprovado.\n");
			}
		}
	}
}
