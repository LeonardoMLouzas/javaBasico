package atividadesAula36;

public class Aluno {
    
    private String nomeAluno;
    private String matriculaAluno;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    public void configuraMedia() {

        media = (nota1+nota2+nota3+nota4)/4;
    }

    public String obterInfo() {
        return "Nome do aluno: " + nomeAluno + "\n"
        + "Matrícula: " + matriculaAluno + "\n"
        + "Média: " + media;
    }
}
