package atividadesAula43;

public class PessoaJuridica {

    private double rendaBruta;
    private double imposto;

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public void calculaImpostoPJ() {

        imposto = rendaBruta * 0.10;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
