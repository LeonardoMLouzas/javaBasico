package atividadesAula17;

import java.util.Scanner;

// Fa�a um programa que leia um nome de usu�rio e sua senha e n�o aceite a senha igual ao usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.

public class Atividade02 {

	public static void main(String[] Args) {
		Scanner leia = new Scanner(System.in);

		int user = 0;
		int senha = 0;

		do {

			System.out.println("Digite o seu usu�rio: ");
			user = leia.nextInt();
			System.out.println("Digite sua senha: ");
			senha = leia.nextInt();

			if (user == senha) {
				System.out.println("Usu�rio e senha n�o podem ser iguais.");
			} else {
				System.out.println("Logado com sucesso.");
			}
		} while (user == senha);
	}
}