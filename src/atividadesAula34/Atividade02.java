package atividadesAula34;

//Escreva  uma  classe  Calculadora  que  tenha  os  seguintes  métodos:  somar,   subtrair,  multiplicar,  dividir  (dois  números),  elevar  à  potência  n.   Desenvolva  um  programa  para  testar  essa  classe.

public class Atividade02 {

    public static double somar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
    }

    public static int fatorial(int num) {

        if (num == 0) {
            return 1;
        }

        int total = 1;
        for (int i = num; i > 1; i--) {
            total *= i;
        }
        return total;
    }
}
