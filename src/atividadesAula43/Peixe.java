package atividadesAula43;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe() {
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristica = "Barbatanas e Cauda";
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String toString() {
        String s = super.toString();
        s += "\n Características: " + caracteristica;
        return s;
    }
}
