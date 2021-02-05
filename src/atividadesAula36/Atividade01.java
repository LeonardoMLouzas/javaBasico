package atividadesAula36;

import java.util.Scanner;

public class Atividade01 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        String cont = "º contato: ";

        System.out.println("Digite o nome da agenda: ");
        Agenda agenda = new Agenda();
        agenda.setNomeAgenda(leia.nextLine());

        Contato[] contatos = new Contato[3];
        
        for (int i = 0; i <3; i++) {

            Contato c = new Contato();
            System.out.println("Digite o nome do " + (i+1) + cont);
            c.setNomeContato(leia.nextLine());

            System.out.println("Digite o email do " + (i+1) + cont);
            c.setEmailContato(leia.nextLine());

            System.out.println("Digite o telefone do " + (i+1) + cont);
            c.setTelefoneContato(leia.nextLine());
            contatos[i] = c;
        }
        agenda.setContatos(contatos);

            System.out.println(agenda.obterInfo());
    }
}
