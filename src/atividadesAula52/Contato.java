package atividadesAula52;

public class Contato {

    private String nome;
    private int numero;
    private String email;
    private static int contador = 0;
	public int identificador;

    public Contato() {
        contador++;
        identificador = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "Contato [ID=" + identificador + ", Nome=" + nome + ", Telefone=" + numero + ", email=" + email
                + "]";
    }

}