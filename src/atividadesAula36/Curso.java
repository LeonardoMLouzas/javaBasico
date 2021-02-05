package atividadesAula36;

public class Curso {
    
    private String nomeCurso;
    private String horario;
    private Professor professores;
    private Aluno[] alunos;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Professor getProfessores() {
        return professores;
    }

    public void setProfessores(Professor professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String obterinfo() {
        String info = "Curso " + nomeCurso + "\n";
        for (Aluno a : alunos) {
            info += a.obterInfo() + "\n";
        }
        return info;
    }

}
