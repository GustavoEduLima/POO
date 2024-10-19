package Aula1;

public class Exercicio3 {
    public static void main(String[] args) {
       Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Camiseta";
        produto1.preço = 29.99;
        produto1.quantidade = 10;

        produto2.nome = "Blusa moletom";
        produto2.preço = 80.99;
        produto2.quantidade = 5;
        
        System.out.println("Produto:");
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Preço: R$ " + produto1.preço);
        System.out.println("Quantidade: " + produto1.quantidade);

        System.out.println("Produto:");
        System.out.println("Nome: " + produto2.nome);
        System.out.println("Preço: R$ " + produto2.preço);
        System.out.println("Quantidade: " + produto2.quantidade);
    }
}