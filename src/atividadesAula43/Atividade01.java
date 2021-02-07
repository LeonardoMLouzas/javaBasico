package atividadesAula43;
//import atividadesAula43.ContaBancaria;

import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {

        int tipoConta = 0;
        int dias = 0;

        Scanner leia = new Scanner(System.in);

        ContaPoupanca pessoa = new ContaPoupanca();
        ContaEspecial pessoaEspecial = new ContaEspecial();

        System.out.println("Digite o tipo de conta a ser criada (1 - Poupança 2 - Especial):");
        tipoConta = leia.nextInt();

        if (tipoConta == 1) {
            System.out.println("Digite o seu nome: ");
            pessoa.setNomeCliente(leia.next());

            System.out.println("Digite o número da sua conta");
            pessoa.setNumConta(leia.nextInt());

            System.out.println("Digite o saldo: ");
            pessoa.setSaldo(leia.nextDouble());

            System.out.println("Digite a porcentagem de rendimento: ");
            pessoa.setDiaRendimento(leia.nextDouble() * 0.01);

            System.out.println("Digite quantos dias o dinheiro será aplicado:");
            dias = leia.nextInt();

            pessoa.calcularNovoSaldo(dias);

            // pessoa.setSaldo(pessoa.saldo += (pessoa.saldo * pessoa.diaRendimento) *
            // dias);

            // pessoa.

        } else {
            System.out.println("Digite o seu nome: ");
            pessoaEspecial.setNomeCliente(leia.next());

            System.out.println("Digite o número da sua conta");
            pessoaEspecial.setNumConta(leia.nextInt());

            System.out.println("Digite o saldo: ");
            pessoaEspecial.setSaldo(leia.nextDouble());
            System.out.println("Digite o limite especial: ");
            pessoaEspecial.setLimite(leia.nextDouble());
        }

        System.out.println("Informações:");

        if (tipoConta == 1) {
            pessoa.toString();
        } else {
            pessoaEspecial.toString();
        }
    }
}