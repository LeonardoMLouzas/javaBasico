package atividadesAula17;
import java.util.Scanner;

//Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, por exemplo na Criptografia. Um n�mero primo � aquele que � divis�vel apenas por um e por ele mesmo. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.

public class Atividade28 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		boolean primo = true;

		System.out.println("Digite um n�mero: ");
		int numero = leia.nextInt();

		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				primo = false;
		}
		if (primo == true) {
			System.out.println("O n�mero � primo.");

		} else {
			System.out.println("O n�mero n�o � primo.");
			
		}
	}
}