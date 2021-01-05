package atividadesAula27;

import java.util.Scanner;

public class Atividade00_Main {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Atividade01 lampada = new Atividade01();

		lampada.ligada = true;

		lampada.mostrarEstado();

		lampada.desligar();

		lampada.mostrarEstado();

		lampada.ligar();

		lampada.mostrarEstado();

		lampada.trocarEstado();

		lampada.mostrarEstado();

		System.out.println("\n\n\n");

		Atividade02 contaCorrente = new Atividade02();
		contaCorrente.numero = "123456";
		contaCorrente.agencia = "123";
		contaCorrente.especial = true;
		contaCorrente.limiteEspecial = 500;
		contaCorrente.saldo = -10;
		contaCorrente.especialUsado = 0;

		System.out.println("Conta: " + contaCorrente.numero + ". Saldo: " + contaCorrente.saldo);

		boolean saqueEfetuado = contaCorrente.realizarSaque(500);

		if (saqueEfetuado) {

			System.out.println("Saque efetuado.");
			contaCorrente.consultarSaldo();
		} else {
			System.out.println("Saldo não realizado.");
		}

		contaCorrente.depositarDinheiro(50);

		contaCorrente.consultarSaldo();

		contaCorrente.realizarSaque(500);
		if (contaCorrente.verificarChequeEspecial()) {
			System.out.println("Está usando cheque especial.");
		} else {
			System.out.println("Não está usando cheque especial.");
		}

		System.out.println("\n\n\n");

		Atividade03 aluno = new Atividade03();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = leia.next();
		System.out.println("Digite o nome do curso: ");
		aluno.curso = leia.next();
		
		System.out.println("Digite a matrícula: ");
		aluno.matricula = leia.nextDouble();
		
		for (int i = 0; i < aluno.materias.length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1));
			aluno.materias[i] = leia.next();
		}
		
		for (int i = 0; i < aluno.notas.length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.materias[i]);
			for (int j = 0; j < aluno.notas[i].length; j++) {
				System.out.println("Digite a nota " + (j+1));
				aluno.notas[i][j] = leia.nextDouble();
			}
		}
		
		aluno.mostrarInformacoes();
		
		for (int i = 0; i < aluno.materias.length; i++) {
			if (aluno.verificarAprovacao(i)) {
				System.out.println("Aluno aprovado na disciplina " + aluno.materias[i]);
			} else {
				System.out.println("Aluno reprovado na disciplina " + aluno.materias[i]);
			}
		}
		

	}
}