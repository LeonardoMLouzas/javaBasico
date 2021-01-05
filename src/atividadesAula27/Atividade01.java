package atividadesAula27;

//Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.

public class Atividade01 {

	boolean ligada;

	void ligar() {

		ligada = true;
	}

	void desligar() {

		ligada = false;
	}

	void mostrarEstado() {

		if (ligada) {
			System.out.println("Lâmpada ligada.");
		} else {
			System.out.println("Lâmpada desligada.");
		}
	}

	void trocarEstado() {
		
		if(ligada) {
			desligar();
		} else {
			ligar();
		}

	}
}
