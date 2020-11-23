package atividadesAula17;
import java.util.Scanner;

//Faça um programa que leia 5 números e informe a soma e a média dos números.

public class Atividade08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero;
		double total = 0;
		
		for (int i=1; i<6; i++) {
		
			System.out.println("Digite o " + i + "º número: ");
			numero = leia.nextInt();
			total += numero;
		}
		
		System.out.println("A soma deles é: " + total);
		System.out.println("A média deles é: " + total/5);
	}
}