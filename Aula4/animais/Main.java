package animais;
public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.idade = 5;
        cachorro.dormir();
        cachorro.latir();

        Gato gato = new Gato();
        gato.nome = "Mia";
        gato.idade = 3;
        gato.comer();
        gato.miar();
    }
}