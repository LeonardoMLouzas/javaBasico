package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
//Ex.: 5!=5.4.3.2.1=120

public class Atividade17 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o n�mero a ser fatorado: ");
	int numero = leia.nextInt();
	
	for (int i = numero-1; i >= 1; i--) {
		
		numero = numero * i;
	}
	
	System.out.println("total �: " + numero);
	}
}