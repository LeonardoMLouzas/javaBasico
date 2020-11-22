package atividadesAula13;
import java.util.Scanner;

// faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário
// referido no mês, sabendo-se que são descontados 11% para o imposto de renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: 
//    A) Salário bruto. 
//    B) Quanto pagou ao sindicato. 
//    B1) INSS.
//	  B2) Imposto de Renda.
//    C) Salário líquido.

public class Atividade13 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o quanto você ganha por hora: ");
		double inSal = scan.nextDouble();
		
		System.out.print("Digite quantas horas você trabalhará no mês: ");
		double inHor = scan.nextDouble();
		
		System.out.println("A: " + inSal*inHor);
		System.out.println("B: "+ ((inSal*inHor)*0.05));
		System.out.println("B1: "+ ((inSal*inHor)*0.08));
		System.out.println("B2: "+ ((inSal*inHor)*0.11));
		
		//Não funciona:
		System.out.println("C: "+ ((inSal*inHor)*(0.95*0.89*0.92)));
	}
}