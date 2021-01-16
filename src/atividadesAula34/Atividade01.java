package atividadesAula34;

//Escreva  uma  classe  chamada  Contador,  que  tem  um  atributo  estático  que   é  incrementado  sempre  que  a  classe  for  instanciada.  Crie  métodos  para   zerar,  incrementar  e  retornar  o  valor  do  contador.  Desenvolva  um   programa  para  testar  essa  classe.

public class Atividade01 {

    int conta;

    public Atividade01() {

        conta += 1;
    }

    public void somar() {
        conta += 1;
    }

    public void subtrair() {
        conta -= 1;
    }

    public void mostrar() {
        System.out.println("Contador está em: " + conta);
    }
}
