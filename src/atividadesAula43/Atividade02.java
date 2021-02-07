package atividadesAula43;

import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        PessoaJuridica pJ = new PessoaJuridica();
        PessoaFisica pF = new PessoaFisica();
        double temp = 0;
        Scanner leia = new Scanner(System.in);

        System.out
                .println("Digite o número correspondente para calcular o imposto: 1- Pessoa Jurídica 2- Pessoa Física");
        temp = leia.nextDouble();

        if (temp == 1) {
            System.out.println("Digite a renda bruta da empresa: ");
            pJ.setRendaBruta(leia.nextDouble());

            pJ.calculaImpostoPJ();

            System.out.println("O total de imposto a ser pago é: " + pJ.getImposto());
        } else {
            System.out.println("Digite seu salário bruto: ");
            pF.setSalarioBruto(leia.nextDouble());

            pF.calculaImpostopF();

            System.out.println("O total de imposto a ser pago é: " + pF.getImposto());
        }
    }
}
