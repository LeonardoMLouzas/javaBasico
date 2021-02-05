package atividadesAula36;

import java.util.Scanner;

public class Atividade02 {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        double total = 0;
        Curso curso = new Curso();
        Aluno[] alunos = new Aluno[5];

        for(int i = 0; i <5; i++) {

            Aluno a = new Aluno();
            

            System.out.println("Digite o nome do " + (i+1) + "º aluno: ");
            a.setNomeAluno(leia.nextLine());
            a.setNomeAluno(leia.nextLine());
            
            System.out.println("Digite a 1º nota do aluno: " );
            a.setNota1(leia.nextDouble());
            total += a.getNota1();
            
            System.out.println("Digite a 2º nota do aluno: " );
            a.setNota2(leia.nextDouble());
            total += a.getNota2();
            
            System.out.println("Digite a 3º nota do aluno: " );
            a.setNota3(leia.nextDouble());
            total += a.getNota3();
            
            System.out.println("Digite a 4º nota do aluno: " );
            a.setNota4(leia.nextDouble());
            total += a.getNota4();

            a.configuraMedia();

            alunos[i] = a;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterinfo());
    }
}
