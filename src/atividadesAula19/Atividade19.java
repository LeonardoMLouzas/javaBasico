package atividadesAula19;

//Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas em dois vetores �Nota1� e �Nota2� do tipo real. Escreva um programa que calcule a m�dia aritm�tica simples das notas informadas armazenando o resultado em um vetor �Result� de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situa��o de cada aluno. Se a m�dia calculada for superior ou igual a 7 o aluno estar� �aprovado�, caso contr�rio, a situa��o do aluno ser� �reprovado�.
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

				System.out.println("O aluno " + i + " est� aprovado.\n");
			} else {
				System.out.println("O aluno " + i + " est� reprovado.\n");
			}
		}
	}
}
