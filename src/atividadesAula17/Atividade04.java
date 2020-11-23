package atividadesAula17;

//supondo que a população de um país a seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes a 1.5% ao ano
//Faça um programa que calcule e mostre os anos necessários para que a população do país A iguale ou ultrapasse a população do B.

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
		
		System.out.println("Total de anos para a população A alcançar a população B: " + anos);
		System.out.println("Total da população A: " + popA);
		System.out.println("Total da população B: " + popB);
	}
}