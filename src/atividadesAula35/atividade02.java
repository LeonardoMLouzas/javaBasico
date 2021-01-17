package atividadesAula35;

//Escreva  um  método  recursivo  e  estático  que  receba  um  número  inteiro   positivo  N  e  calcule  o  somatório  dos  números  de  1  a  N  

public class atividade02 {

    public static int somatorio(int n) {

        if (n == 1) {
            return 1;
        }

        return n + somatorio(n-1);
    }

    public static void main(String[] args) {

        System.out.println(somatorio(5));
    }
}
