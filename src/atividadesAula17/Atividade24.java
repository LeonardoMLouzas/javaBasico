package atividadesAula17;
import java.util.Scanner;

//O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que j� � um sucesso na sua loja de 1,99. Voc� foi contratado para desenvolver o programa que monta a tabela de pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o informado pelo usu�rio.

public class Atividade24 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o pre�o do p�o: ");
		double pre�o = leia.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de Pre�os");
		
		for (int i = 0; i <= 50; i++) {
			
			System.out.println(i + " - R$ " + (i*pre�o));
		}
	}
}