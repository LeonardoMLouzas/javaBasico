package atividadesAula13;
import java.util.Scanner;

// Faça um Programa que lê o quanto alguém ganha por hora e o número de horas trabalhadas no mês, calcule e mostre o total do salário no mês.

public class Atividade08 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o quanto você ganha por hora: ");
		double inSal = scan.nextDouble();
		
		System.out.print("Digite quantas horas você trabalhará no mês: ");
		double inHor = scan.nextDouble();
		
		System.out.print("Você receberá, nesse mês: " + inSal*inHor);
	}
}