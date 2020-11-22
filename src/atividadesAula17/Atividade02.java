package atividadesAula17;

import java.util.Scanner;

// Faça um programa que leia um nome de usuário e sua senha e não aceite a senha igual ao usuário, mostrando uma mensagem de erro e voltando a pedir as informações.

public class Atividade02 {

	public static void main(String[] Args) {
		Scanner leia = new Scanner(System.in);

		String user = "";
		String senha = "";

		do {

			System.out.println("Digite o seu usuário: ");
			user = leia.nextLine();
			System.out.println("Digite sua senha: ");
			senha = leia.next();
		} while (user == senha);
	}
}