package atividadesAula13;
import java.util.Scanner;

//Faça um programa que peça um número e então mostre a mensagem: "O número informado foi: [x]."

public class Atividade02 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int num = scan.nextInt();
	
		System.out.printf("O número informado foi: " + num);
	}
}