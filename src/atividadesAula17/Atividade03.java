package atividadesAula17;

import java.util.Scanner;

// Faça um programa que leia e valide as seguintes informações: 
// a: Nome maior que 3 caracteres
// b: Idade entre 0 e 150
// c: Salário maior que 0
// d: Sexo 'f' ou 'm'
// e: Estado Civil 's', 'c', 'v' ou 'd'

public class Atividade03 {

	public static void main(String[] Args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome = "";
		int idade = -1;
		double salario = -1;
		String sexo = "x";
		String relacao = "x";
		
		 while (nome.length() < 3) {
			 
			 System.out.println("Digite seu nome (min. 3 char): ");
			 nome = leia.nextLine();
		 }
		
		 while (idade > 150 || idade < 0) {
			 
			 System.out.println("Digite sua idade (150>idade<0): ");
			 idade = leia.nextInt();
		 }
		 
		 while (salario < 0) {
			 
			 System.out.println("Digite seu salário (salario<0): ");
			 salario = leia.nextDouble();
		 }
		 
		 while (sexo != "f" || sexo != "m") {
			 
			 System.out.println("Digite seu sexo (f ou m): ");
			 sexo = leia.nextLine();
		 }
		 
		 while (relacao != "s" || relacao != "c" || relacao != "v" || relacao != "d") {
			 
			 System.out.println("Digite seu estado civil (s, c, v ou d): ");
			 relacao = leia.next();
		 }
	}
}
