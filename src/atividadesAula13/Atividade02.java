package atividadesAula13;
import java.util.Scanner;

//Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem: "O n�mero informado foi: [x]."

public class Atividade02 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		int num = scan.nextInt();
	
		System.out.printf("O n�mero informado foi: " + num);
	}
}