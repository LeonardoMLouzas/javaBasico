package atividadesAula33;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

/*******************************************************************/
        Atividade01 lampada = new Atividade01();

        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
/*******************************************************************/
System.out.println("\n\n\n\n\n\n");
/*******************************************************************/
        Atividade02 conta = new Atividade02();
        //Atividade02 conta = new Atividade02("123456", "123", -10, 500, 0, true);
        conta.setNumero("123456");
        conta.setAgencia("123");
        conta.setSaldo(-10);
        conta.setLimiteEspecial(500);
        conta.setEspecialUsado(0);
        conta.setEspecial(true);

        System.out.println("Conta: " + conta.getNumero() + ". Saldo: " + conta.getSaldo());

        boolean saqueEfetuado = conta.realizarSaque(100);
        
        if (saqueEfetuado) {

			System.out.println("Saque efetuado.");
			conta.consultarSaldo();
		} else {
			System.out.println("Saldo não realizado.");
		}

		conta.depositarDinheiro(50);

		conta.consultarSaldo();

		conta.realizarSaque(500);
		if (conta.verificarChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		} else {
			System.out.println("Não está usando cheque especial.");
		}
/*******************************************************************/
System.out.println("\n\n\n\n\n\n");
/*******************************************************************/
        Scanner leia = new Scanner(System.in);

        Atividade03 aluno = new Atividade03();

        System.out.println("Digite o nome do aluno: ");
		aluno.setNome(leia.next());
		System.out.println("Digite o nome do curso: ");
		aluno.setCurso(leia.next());
		
		System.out.println("Digite a matrícula: ");
		aluno.setMatricula(leia.nextDouble());
		
		for (int i = 0; i < aluno.getMaterias().length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1));
            //aluno.materias[i] = leia.next();
            aluno.setNomeDisciplina(i, leia.next());
		}
		
		for (int i = 0; i < aluno.getNotas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getMaterias()[i]);
			for (int j = 0; j < aluno.getNotas()[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
                aluno.getNotas()[i][j] = leia.nextDouble();
                aluno.setNomePosicaoIJ(i, j, leia.nextDouble());
			}
		}
		
		aluno.mostrarInformacoes();
		
		for (int i = 0; i < aluno.getMaterias().length; i++) {
			if (aluno.verificarAprovacao(i)) {
				System.out.println("Aluno aprovado na disciplina " + aluno.getMaterias()[i]);
			} else {
				System.out.println("Aluno reprovado na disciplina " + aluno.getMaterias()[i]);
			}
		}


    }
}
