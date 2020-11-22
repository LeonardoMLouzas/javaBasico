package atividadesAula13;
import java.util.Scanner;

// Faça um programa que lê o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps), calcule e informe o tempo
// aproximado de download do arquivo usando este link (em minutos).

public class Atividade14 {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo em MB: ");
		double t = scan.nextDouble();
		
		System.out.print("Digite a velocidade do link em MBps: ");
		double s = scan.nextDouble();
		
		System.out.println("O tempo estimado para baixar o arquivo, em minutos, é: " + (t/s));
	}
}