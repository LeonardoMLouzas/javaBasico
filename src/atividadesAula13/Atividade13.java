package atividadesAula13;
import java.util.Scanner;

// fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio
// referido no m�s, sabendo-se que s�o descontados 11% para o imposto de renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�: 
//    A) Sal�rio bruto. 
//    B) Quanto pagou ao sindicato. 
//    B1) INSS.
//	  B2) Imposto de Renda.
//    C) Sal�rio l�quido.

public class Atividade13 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o quanto voc� ganha por hora: ");
		double inSal = scan.nextDouble();
		
		System.out.print("Digite quantas horas voc� trabalhar� no m�s: ");
		double inHor = scan.nextDouble();
		
		System.out.println("A: " + inSal*inHor);
		System.out.println("B: "+ ((inSal*inHor)*0.05));
		System.out.println("B1: "+ ((inSal*inHor)*0.08));
		System.out.println("B2: "+ ((inSal*inHor)*0.11));
		
		//N�o funciona:
		System.out.println("C: "+ ((inSal*inHor)*(0.95*0.89*0.92)));
	}
}