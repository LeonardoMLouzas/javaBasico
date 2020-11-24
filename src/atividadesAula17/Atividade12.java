package atividadesAula17;
import java.util.Scanner;

//.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
//O usuário deve informar de qual numero ele deseja ver a tabuada.

public class Atividade12 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número da tabuada que deseja ver:");
		int escolha = leia.nextInt();
		
		for (int i =0; i < 11; i++) {
			
			System.out.println(escolha + " * " + i + ": " + (escolha*i));
		}
	}
}