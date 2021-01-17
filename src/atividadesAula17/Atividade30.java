package atividadesAula17;
import java.util.Scanner;

//Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo abaixo: o Montar a tabuada de: 5 Começar por: 4 o Terminar em: 7 o o Vou montar a tabuada de 5 começando em 4 e terminando em 7: o 5 X 4 = 20 o 5 X 5 = 25 o 5 X 6 = 30 o 5 X 7 = 35 Obs: Você deve verificar se o usuário não digitou o final menor que o inicial

public class Atividade30 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		boolean correto = false;
		int valorMin = 0, valorMax = 0;
		
		System.out.println("Digite o valor para a tabuada: ");
		int tabuada = leia.nextInt();
		
		while (correto != true) {
			
		System.out.println("Digite o menor valor: ");
		valorMin = leia.nextInt();
		
		System.out.println("Digite o maior valor: ");
		valorMax = leia.nextInt();
		
		if (valorMin < valorMax) {
			correto = true;
		} else {
			System.out.println("Digite valores válidos.");
		}
		}
		
		for (; valorMin <= valorMax; valorMin++ ) {
			
			System.out.println(tabuada + " x " + valorMin + " = " + (tabuada*valorMin));
		}
	}
}