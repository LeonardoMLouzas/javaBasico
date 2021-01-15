package atividadesAula33;

//Cria  uma  classe  para  representar  uma  conta  corrente  que  possui  um   número,  um  saldo,  um  status  que  informa  se  ela  é  especial  ou  não,  um   limite. Desenvolva  métodos  para  realizar  saque  (verificando  se  o  cliente   pode  realizar  saques),  despositar  dinheiro,  consultar  saldo  e  verificar  se  o   cliente  está  usando  cheque  especial  ou  não.  Desenvolva  um  programa   para  testar  essa  classe.

public class Atividade02 {

    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    double especialUsado;
    boolean especial;

    boolean realizarSaque(double quantiaSacar) {

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

    void depositarDinheiro(double quantiaDepositar) {

        saldo += quantiaDepositar;
    }

    void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    boolean verificarChequeEspecial() {
        return saldo < 0;
    }
}