package atividadesAula17;

import java.util.Scanner;

// Faça um programa que leia um nome de usuário e sua senha e não aceite a senha igual ao usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

public class Atividade02 {

	public static void main(String[] Args) {
		Scanner leia = new Scanner(System.in);

		int user = 0;
		int senha = 0;

		do {

			System.out.println("Digite o seu usuário: ");
			user = leia.nextInt();
			System.out.println("Digite sua senha: ");
			senha = leia.nextInt();

			if (user == senha) {
				System.out.println("Usuário e senha não podem ser iguais.");

			} else {
				System.out.println("Logado com sucesso.");

			}
		} while (user == senha);
	}
}