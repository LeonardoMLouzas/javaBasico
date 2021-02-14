package atividadesAula46;

public class Quadrado extends Figura2D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }
}