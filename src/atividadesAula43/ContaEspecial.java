package atividadesAula43;

import javax.lang.model.util.ElementScanner6;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    private void sacar(double quantiaSacar) {

        if (quantiaSacar <= this.getSaldo()) {
            saldo -= quantiaSacar;
            System.out.println("Saque realizado com sucesso.");
        } else if (quantiaSacar <= (saldo + limite)) {
            quantiaSacar -= saldo;
            limite -= quantiaSacar;
            saldo = 0;
            System.out.println("Saldo realizado com uso do limite especial.");
        } else {
            System.out.println("Saque não realizado.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaEspecial [limite=" + limite + "]" + super.toString();
    }
}
