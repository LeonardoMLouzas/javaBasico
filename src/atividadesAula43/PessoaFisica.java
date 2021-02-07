package atividadesAula43;

public class PessoaFisica {

    private double salarioBruto;
    private double imposto;

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public void calculaImpostopF() {

        if (salarioBruto > 1400 && salarioBruto <= 2100) {
            imposto = salarioBruto * 0.10 - 100;
        } else if (salarioBruto > 2100 && salarioBruto <= 2800) {
            imposto = salarioBruto * 0.15 - 270;
        } else if (salarioBruto > 2800 && salarioBruto <= 3600) {
            imposto = salarioBruto * 0.25 - 500;
        } else if (salarioBruto > 3600) {
            imposto = salarioBruto * 0.30 - 700;
        }
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
