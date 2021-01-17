package atividadesAula17;
import java.util.Scanner;

//O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver o programa que monta a tabela de preços de pães, de 1 até 50 pães, a partir do preço do pão informado pelo usuário.

public class Atividade24 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o preço do pão: ");
		double preço = leia.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int i = 0; i <= 50; i++) {
			
			System.out.println(i + " - R$ " + (i*preço));
		}
	}
}