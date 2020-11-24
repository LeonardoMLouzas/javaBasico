package atividadesAula17;
import java.util.Scanner;

//Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada

public class Atividade20 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int total = 0;
		System.out.println("Há quantas pessoas na sala? ");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			
			System.out.println("Digite a idade da " + i + "º pessoa. ");
			int idade = leia.nextInt();
			
			total += idade;
		}
		
		if ((total/quantidade)< 26) {
			System.out.println("A turma é jovem. Com a média de " + (total/quantidade) + " anos.");
			
		} else if ((total/quantidade)< 60) {
			System.out.println("A turma é adulta. Com a média de " + (total/quantidade) + " anos.");
			
			
		} else {
			System.out.println("A turma é idosa. Com a média de " + (total/quantidade) + " anos.");

		}
	}
}