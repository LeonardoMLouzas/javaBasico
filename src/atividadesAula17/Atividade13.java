package atividadesAula17;
import java.util.Scanner;

//Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem. 

public class Atividade13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("Digite a base: ");
		double base = leia.nextDouble();
		
		System.out.println("Digite o expoente: ");
		double expoente = leia.nextDouble();
		
		for (int i =0; i < expoente; i++) {
		
			total += base;
		}
		
		System.out.println("O resultado é: " + total);
	}
}