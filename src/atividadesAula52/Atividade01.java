package atividadesAula52;

import java.util.Scanner;

public class Atividade01 extends Agenda {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(leia);

            if (opcao == 1) {// Consultar contato
                consultarContato(leia, agenda);
            } else if (opcao == 2) {// Adicionar contato
                adicionarContato(leia, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner leia, Agenda agenda) {

        try {
            System.out.println("Criando um contato. Entre com as informações:");
            System.out.println("Digite o nome: ");
            String nome =  leia.nextLine();
            nome = leia.nextLine();
            System.out.println("Digite o número:");
            int telefone = leia.nextInt();
            System.out.println("Digite o email: ");
            String email = leia.nextLine();
            email = leia.nextLine();

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setNumero(telefone);
            contato.setEmail(email);
            
            agenda.adicionarContato(contato);
            
            System.out.println(contato);

        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos existentes: ");
            System.out.println(agenda);

        }
    }

    public static void consultarContato(Scanner leia, Agenda agenda) {
        String nomeContato = leInformacaoString(leia, "Entre com o nome do contato:");
        nomeContato = leia.nextLine();
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("contato existe");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int obterOpcaoMenu(Scanner leia) {
        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("Digite uma opção: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                opcao = leia.nextInt();
                if (opcao != 1 && opcao != 2 && opcao != 3) {
                    throw new Exception("Entrada inválida.");
                } else {
                    entradaValida = true;
                }
            } catch (Exception e) {
                System.out.println("Entrada Inválida, digite novamente.");
            }
        }
        return opcao;
    }

    public static String leInformacaoString(Scanner leia, String msg) {
        System.out.println(msg);
        String entrada = leia.nextLine();
        return entrada;
    }
}
