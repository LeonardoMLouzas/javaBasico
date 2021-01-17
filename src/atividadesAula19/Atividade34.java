package atividadesAula19;

//riar um vetor A com 10 elementos inteiros. Escreva um programa que imprima cada elemento do vetor A e a relação de todos os pares de 0 até o respectivo elemento. 

public class Atividade34 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		for (int i = 0; i < a.length; i++) {
		
			a[i] = (int) (Math.random() *100);
			
			for (int j = 0; j <= a[i];) {
				
				System.out.print(j + " ");
				j+=2;
			}
			System.out.println("");
		}
	}
}