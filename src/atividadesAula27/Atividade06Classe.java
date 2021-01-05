package atividadesAula27;

public class Atividade06Classe {

	char[][] tabuleiro = new char[3][3];
	boolean sair = false, jogadaValida = false;
	int opcao = 0, x = 0, y = 0, vencedor = 3, jogada = 0;
	
	void mostrarTabuleiro() {
		
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {

				System.out.print("[" + tabuleiro[i][j] + "]");
			}
			System.out.println("");
		}
	}
	
	
	
	
}