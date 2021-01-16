package atividadesAula34;

/*Escreva  a  classe  ConversaoDeUnidadesDeArea  com  métodos  estáticos   para  conversão  das  unidades  de  área  segundo  a  lista  abaixo.
  1  metro  quadrado  =  10.76  pés  quadrados
  1  pé  quadrado  =  929  centimetros  quadrados
  1  milha  quadrada  =  640  acres
  1  acre  =  43.560  pés  quadrados
*/

public class Atividade04 {

    public static double metrosPes(double num) {
        return num * 10.76;
    }

    public static double pesCentimetros(double num) {
        return num * 929;
    }

    public static double milhaAcres(double num) {
        return num * 640;
    }

    public static double acrePes(double num) {
        return num * 43560;
    }
}
