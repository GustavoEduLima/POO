package animais;
// Superclasse
class Animal {
    String nome;
    int idade;

    void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    void comer() {
        System.out.println(nome + " está comendo...");
    }
}
