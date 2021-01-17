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
		double salarioHora = scan.nextDouble();

		System.out.print("Digite quantas horas você trabalhará no mês: ");
		double horaMes = scan.nextDouble();

		System.out.println("A: " + salarioHora * horaMes);
		System.out.println("B: " + ((salarioHora * horaMes) * 0.05));
		System.out.println("B1: " + ((salarioHora * horaMes) * 0.08));
		System.out.println("B2: " + ((salarioHora * horaMes) * 0.11));

		System.out.println("C: "+ ((salarioHora * horaMes)*0.76));
	}
}