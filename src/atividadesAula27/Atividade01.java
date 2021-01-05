package atividadesAula27;

//Escreva uma classe para representar uma l�mpada. Desenvolva m�todos para ligar e desligar a l�mpada.

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
			System.out.println("L�mpada ligada.");
		} else {
			System.out.println("L�mpada desligada.");
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
