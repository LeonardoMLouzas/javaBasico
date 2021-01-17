package atividadesAula34;

//Escreva  uma  classe  chamada  Contador,  que  tem  um  atributo  estático  que   é  incrementado  sempre  que  a  classe  for  instanciada.  Crie  métodos  para   zerar,  incrementar  e  retornar  o  valor  do  contador.  Desenvolva  um   programa  para  testar  essa  classe.

public class Atividade01 {

    private static int conta;


    public static void somar() {
        conta ++;
    }
    
    public static void subtrair() {
        conta -= 1;
    }
    
    public static void zerar() {
        conta = 0;
    }

    public void mostrar() {
        System.out.println("Contador está em: " + conta);
    }
}
