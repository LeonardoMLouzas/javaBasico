package atividadesAula43;

public class ContaPoupanca extends ContaBancaria {

    private double diaRendimento;

    public void calcularNovoSaldo(int dias) {

        saldo += (saldo * diaRendimento) * dias;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        return "ContaPoupanca [diaRendimento=" + diaRendimento + "]" + super.toString();
    }
}
