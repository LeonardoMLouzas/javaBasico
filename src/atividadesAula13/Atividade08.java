package atividadesAula13;
import java.util.Scanner;

// Fa�a um Programa que l� o quanto algu�m ganha por hora e o n�mero de horas trabalhadas no m�s, calcule e mostre o total do sal�rio no m�s.

public class Atividade08 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o quanto voc� ganha por hora: ");
		double inSal = scan.nextDouble();
		
		System.out.print("Digite quantas horas voc� trabalhar� no m�s: ");
		double inHor = scan.nextDouble();
		
		System.out.print("Voc� receber�, nesse m�s: " + inSal*inHor);
	}
}