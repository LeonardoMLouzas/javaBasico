package atividadesAula17;

import java.util.Scanner;

// Fa�a um programa que leia um nome de usu�rio e sua senha e n�o aceite a senha igual ao usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.

public class Atividade02 {

	public static void main(String[] Args) {
		Scanner leia = new Scanner(System.in);

		String user = "";
		String senha = "";

		do {

			System.out.println("Digite o seu usu�rio: ");
			user = leia.nextLine();
			System.out.println("Digite sua senha: ");
			senha = leia.next();
		} while (user == senha);
	}
}