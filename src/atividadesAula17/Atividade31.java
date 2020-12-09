package atividadesAula17;

import java.util.Scanner;

//Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que: . Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00; a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial; b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo que o usuário digite o salário inicial do funcionário.

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

		System.out.println("Digite o salário atual: ");
		double salario = leia.nextDouble();

		double aumento = 1.5;

		for (int i = 1996; i <= 2020; i++) {

			salario = salario * aumento;

			aumento += aumento;
		}

		System.out.println("Em 2020 ele recebe " + salario + " reais.");
	}

}