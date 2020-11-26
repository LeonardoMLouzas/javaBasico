package atividadesAula17;
import java.util.Scanner;

//O Sr. Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,99 e agora possui uma loja de conveni�ncias. Fa�a um programa que implemente uma caixa registradora rudimentar. O programa dever� receber um n�mero desconhecido de valores referentes aos pre�os das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final da compra. O programa deve ent�o mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu, para ent�o calcular e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto inicial, para registrar a pr�xima compra.

public class Atividade25 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int escolha = 1;
		int produto = 0;
		double total = 0, valor = 0;
		
		System.out.println("Lojas Tabajara");
		
		while (escolha != 0) {
			
			produto++;
			
			System.out.print("Produto " + produto + ": R$ ");
			valor = leia.nextDouble();
			total += valor;
			
			if (valor == 0) {
				escolha = 0;
			}
		}
		System.out.println("Total: R$ " + total);
		
		System.out.print("Dinheiro: R$ ");
		valor = leia.nextDouble();
		
		System.out.println("Troco: R$ " + (valor - total));
	}
}