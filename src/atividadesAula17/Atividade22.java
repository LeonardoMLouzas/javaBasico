package atividadesAula17;
import java.util.Scanner;

//Faça um programa que calcule o valor total investido por um colecionador em sua coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar a quantidade de CDs e o valor para em cada um.

public class Atividade22 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int valor =0;
		System.out.println("Quantos CDs você possui?");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			
			System.out.println("Digite quanto pagou no " + i + "º CD: ");
			valor += leia.nextInt();			
		}
		System.out.println("Você gastou ao todo " + valor + " reais. O valor médio é: " + (valor/quantidade) + " reais.");
	}
}