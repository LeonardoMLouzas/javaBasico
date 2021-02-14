package atividadesAula46;

public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 6 * (Math.pow(lado, 2));
    }

    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
