package atividadesAula35;

//Um método recursivo que conta de 0 até N

public class teste01 {
    
    public static void contador(int n) {
        if (n>=0) {
            contador(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        
        contador(5);
    }
}