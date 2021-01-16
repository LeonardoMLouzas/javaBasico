package atividadesAula33;

//Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,  um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite. Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),  despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque  especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.

public class Atividade02 {

    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    double especialUsado;
    boolean especial;

    public Atividade02() {

    }

    public Atividade02 (String numero, String agencia, double saldo, double limiteEspecial, double especialUsado, boolean especial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.especialUsado = especialUsado;
        this.especial = especial;
    }

    public boolean realizarSaque(double quantiaSacar) {

        if (saldo >= quantiaSacar) {// Tem saldo na conta.
            saldo -= quantiaSacar;
            return true;

        } else {// Não tem saldo na conta.
            if (especial) {// verificar se a conta é especial e se tem limite especial.
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaSacar) {
                    saldo -= quantiaSacar;
                    return true;
                } else {
                    return false;
                }
            } else {// Não é especial e não tem saldo.
                return false;
            }
        }
    }

    public void depositarDinheiro(double quantiaDepositar) {

        saldo += quantiaDepositar;
    }


    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    boolean verificarChequeEspecial() {
        return saldo < 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getEspecialUsado() {
        return especialUsado;
    }

    public void setEspecialUsado(double especialUsado) {
        this.especialUsado = especialUsado;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
}