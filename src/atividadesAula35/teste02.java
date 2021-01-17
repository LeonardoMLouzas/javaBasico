package atividadesAula35;

//Um método recursivo que conta de n até 0.

public class teste02 {
    
    public static void contador(int n) {
        if (n>=0) {
            System.out.print(n + " ");
            contador(n-1);
        }
    }

    public static void main(String[] args) {
        contador(15);
    }
}
