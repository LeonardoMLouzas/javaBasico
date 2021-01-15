package atividadesAula33;

//Escreva  uma  classe  para  representar  uma  lâmpada.  Desenvolva  métodos   para  ligar,  desligar  a  lampada. 

public class Atividade01 {

    private boolean ligada;

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if (isLigada()) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            setLigada(false);
        } else {
            setLigada(true);
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {

        this.ligada = ligada;
    }
}
