package atividadesAula17;
import java.util.Scanner;

//Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio, mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados tamb�m pelo usu�rio, conforme exemplo abaixo: o Montar a tabuada de: 5 Come�ar por: 4 o Terminar em: 7 o o Vou montar a tabuada de 5 come�ando em 4 e terminando em 7: o 5 X 4 = 20 o 5 X 5 = 25 o 5 X 6 = 30 o 5 X 7 = 35 Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor que o inicial

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
			System.out.println("Digite valores v�lidos.");
		}
		}
		
		for (; valorMin <= valorMax; valorMin++ ) {
			
			System.out.println(tabuada + " x " + valorMin + " = " + (tabuada*valorMin));
		}
	}
}