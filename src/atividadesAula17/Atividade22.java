package atividadesAula17;
import java.util.Scanner;

//Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de CDs e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade de CDs e o valor para em cada um.

public class Atividade22 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int valor =0;
		System.out.println("Quantos CDs voc� possui?");
		int quantidade = leia.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			
			System.out.println("Digite quanto pagou no " + i + "� CD: ");
			valor += leia.nextInt();			
		}
		System.out.println("Voc� gastou ao todo " + valor + " reais. O valor m�dio �: " + (valor/quantidade) + " reais.");
	}
}