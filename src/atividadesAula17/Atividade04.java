package atividadesAula17;

//supondo que a popula��o de um pa�s a seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000 habitantes a 1.5% ao ano
//Fa�a um programa que calcule e mostre os anos necess�rios para que a popula��o do pa�s A iguale ou ultrapasse a popula��o do B.

public class Atividade04 {

	public static void main(String[] Args) {

		int popA = 80000;
		int popB = 200000;
		int anos = 0;
		while (popA < popB) {

			popA += (popA / 100) * 3;
			popB += (popB / 100) * 1.5;
			anos++;
		}
		
		System.out.println("Total de anos para a popula��o A alcan�ar a popula��o B: " + anos);
		System.out.println("Total da popula��o A: " + popA);
		System.out.println("Total da popula��o B: " + popB);
	}
}