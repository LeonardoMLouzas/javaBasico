package atividadesAula17;

import java.util.Scanner;

//Um funcion�rio de uma empresa recebe aumento salarial anualmente: Sabe-se que: . Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00; a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial; b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Fa�a um programa que determine o sal�rio atual desse funcion�rio. Ap�s concluir isto, altere o programa permitindo que o usu�rio digite o sal�rio inicial do funcion�rio.

/*
 * public class Atividade31 {
 * 
 * public static void main(String[] args) {
 * 
 * double salario = 1000; double aumento = 1.5;
 * 
 * for(int i = 1996; i <= 2020; i++) {
 * 
 * salario = salario*aumento;
 * 
 * aumento +=aumento; }
 * 
 * System.out.println("Em 2020 ele recebe " + salario + "reais."); }
 * 
 * }
 */

public class Atividade31 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o sal�rio atual: ");
		double salario = leia.nextDouble();

		double aumento = 1.5;

		for (int i = 1996; i <= 2020; i++) {

			salario = salario * aumento;

			aumento += aumento;
		}

		System.out.println("Em 2020 ele recebe " + salario + " reais.");
	}

}