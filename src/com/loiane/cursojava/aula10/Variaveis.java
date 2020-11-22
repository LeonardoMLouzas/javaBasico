package com.loiane.cursojava.aula10;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String nomee = scan.next();
		int a = scan.nextInt();
		boolean b = scan.nextBoolean();
		
		System.out.println(nomee);
		System.out.println(a);
		System.out.println(b);
	}

}
