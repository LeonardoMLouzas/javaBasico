package atividadesAula43;

public class Atividade03 {

    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        camelo.setPatas(4);
        camelo.setCor("Amerelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(2);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(1);

        Animal[] animais = new Animal[3];

        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("---------------------");
        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println("---------------------");
        }
    }
}