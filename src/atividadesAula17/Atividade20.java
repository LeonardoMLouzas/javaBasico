package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa devera verificar se a m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, adulta ou idosa, conforme a m�dia calculada

public class Atividade20 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int total = 0;
		System.out.println("H� quantas pessoas na sala? ");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			
			System.out.println("Digite a idade da " + i + "� pessoa. ");
			int idade = leia.nextInt();
			
			total += idade;
		}
		
		if ((total/quantidade)< 26) {
			System.out.println("A turma � jovem. Com a m�dia de " + (total/quantidade) + " anos.");
			
		} else if ((total/quantidade)< 60) {
			System.out.println("A turma � adulta. Com a m�dia de " + (total/quantidade) + " anos.");
			
			
		} else {
			System.out.println("A turma � idosa. Com a m�dia de " + (total/quantidade) + " anos.");

		}
	}
}