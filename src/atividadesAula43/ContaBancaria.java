package atividadesAula43;

public class ContaBancaria {

    String nomeCliente;
    int numConta;
    double saldo;

    private void Sacar(double quantiaSacar) {

        if (quantiaSacar <= saldo) {
            saldo -= quantiaSacar;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não pôde ser realizado.");
        }
    }

    private void Depositar(double quantiaDepositar) {

        saldo += quantiaDepositar;
        System.out.println("Depósito realizado com sucesso.");
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
    }
}