package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o de pot�ncia da linguagem. 

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
		
		System.out.println("O resultado �: " + total);
	}
}