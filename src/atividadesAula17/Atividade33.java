package atividadesAula17;

import java.util.Scanner;

//Faça um programa que mostre os n termos da Série a seguir: o S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. Imprima no final a soma da série

public class Atividade33 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de N:");
		int n = leia.nextInt();
		
		for(int i = 1, j = 1; i<= n; i++, j+=2) {
			
			System.out.print(i+"/" + j + " + ");
		}
	}

}
