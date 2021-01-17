package atividadesAula17;
import java.util.Scanner;

//O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das temperaturas.

public class Atividade27 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		boolean sair = false;
		int escolha, temperaturaQuantidade = 0;
		double temperatura, temperaturaMaxima = 4.9E-324, temperaturaMinima = 1.7976931348623157E308, temperaturaTotal = 0;
		
		while (sair != true) {
			
			System.out.println("Digite 1 para adicionar uma temperatura, 2 para mostrar os resultados e 3 para sair. 9 reseta os dados.");
			
			escolha = leia.nextInt();
			
			switch (escolha) {

			case 1:
				
				System.out.println("Digite a temperatura: ");
				temperatura = leia.nextDouble();
				temperaturaQuantidade++;
				
				temperaturaTotal += temperatura;
				
				if (temperatura > temperaturaMaxima) {
					temperaturaMaxima = temperatura;	
				}
				if (temperatura < temperaturaMinima) {
					temperaturaMinima = temperatura;
				}
				break;
			case 2:
				
				System.out.println("A maior temperatura registrada é.......: " + temperaturaMaxima);
				System.out.println("A menor temperatura registrada é.......: " + temperaturaMinima);
				System.out.println("A temperatura média registrada é.......: " + temperaturaTotal/temperaturaQuantidade);
				System.out.println("A quantidade de temperaturas informadas: " + temperaturaQuantidade);
				break;
			case 9:
				
				temperaturaMaxima = 4.9E-324;
				temperaturaMinima = 1.7976931348623157E308;
				temperaturaTotal = 0;
				temperaturaQuantidade = 0;
				break;
			case 3:
				
				System.out.println("Saindo...");
				sair = true;
			}
		}
	}
}