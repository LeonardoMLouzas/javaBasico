package atividadesAula33;

public class Atividade03 {
    
    private String nome;
	private double matricula;
	private String curso;
	private String[] materias;
	private double[][] notas;
	private boolean aprovado;
    private double total;
    
    public Atividade03 () {
        materias = new String[3];
        notas = new double[3][4];
    }

    public Atividade03(String nome, double matricula, String curso, boolean aprovado, double total) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.aprovado = aprovado;
        this.total = total;
        materias = new String[3];
        this.notas = new double[3][4];
    }

	public void mostrarInformacoes() {
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
	
	public boolean verificarAprovacao(int indice) {
		
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
    
    public void setNomeDisciplina (int posicao, String materias) {
        this.materias[posicao] = materias;
    }

    public void setNomePosicaoIJ(int posI, int posJ, double nota) {
        this.notas[posI][posJ] = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
