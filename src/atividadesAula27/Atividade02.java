package atividadesAula27;

//Crie uma classe para representar uma conta corrente que possui um n�mero, um saldo, um limite e um status que informe se ela � especial ou n�o. Desenvolva m�todos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente est� usando chege especial ou n�o. Desenvolva um programa para testar essa classe.

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

		} else {// N�o tem saldo na conta.
			if (especial) {// verificar se a conta � especial e se tem limite especial.
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaSacar) {
					saldo -= quantiaSacar;
					return true;
				} else {
					return false;
				}
			} else {// N�o � especial e n�o tem saldo.
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
