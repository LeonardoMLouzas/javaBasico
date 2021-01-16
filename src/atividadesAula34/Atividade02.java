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

    public static double fatorial(double num1) {

        double total = num1;
        double f = total;
        while (total>1) {
            f = f*(total-1);
            total--;
        }
        return f;
    }
}
