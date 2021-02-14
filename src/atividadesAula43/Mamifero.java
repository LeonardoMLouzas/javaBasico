package atividadesAula43;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        this.setCor("Castanho");
        alimento = "mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "\n Alimento: " + alimento;
        return s;
    }
}
