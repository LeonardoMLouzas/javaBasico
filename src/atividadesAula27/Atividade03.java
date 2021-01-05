package atividadesAula27;

//Escreva uma classe para representar um aluno. Adicione atributos relacionados às características de um aluno, como Nome, Matrícula, Curso, 3 disciplinas e as notas. Desenvolva um método para verificar se o aluno está aprovado (N>=7) em uma determinada disciplina. Escreva um programa para testar essa classe, que pede as informações do aluno e ao usuário final informa o nomr das disciplinas, mostra as notas e mostra se o aluno foi aprovado ou não.

public class Atividade03 {

	String nome;
	double matricula;
	String curso;
	String[] materias = new String[3];
	double[][] notas = new double[3][4];
	boolean aprovado;
	double total;

	void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula " + matricula);
		System.out.println("Curso: " + curso);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina: " + notas[i]);
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	
	boolean verificarAprovacao(int indice) {
		
		double soma = 0;
		
		for(int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		double media = soma /4;
		
		if (media >= 7) {
			return true;
		}
		return false;
	}
}