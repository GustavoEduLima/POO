package Aula1;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Gustavo";
        pessoa1.idade = 19;
        
        pessoa2.nome = "Paulo";
        pessoa2.idade = 48;

        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);

        System.out.println("Pessoa:");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
    }
}
