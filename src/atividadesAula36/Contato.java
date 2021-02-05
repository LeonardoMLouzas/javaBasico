package atividadesAula36;

public class Contato {
    
    private String nomeContato;
    private String telefoneContato;
    private String emailContato;

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    public String obterInfo() {
        return "Nome = " + nomeContato + " ; " + 
                "Telefone = " + telefoneContato + " ; " +
                "Email = " + emailContato;
    }
    
}
