package Exercicio2;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Engenheiro e1 = new Engenheiro();
        Vendedor v1 = new Vendedor();
        Gerente g1 = new Gerente();
    
        System.out.println("Funcionário:");
        f1.trabalhar();
        f1.receberSalario();
    
        System.out.println("\nEngenheiro:");
        e1.trabalhar();
        e1.receberSalario();
    
        System.out.println("\nVendedor:");
        v1.trabalhar();
        v1.receberSalario();
    
        System.out.println("\nGerente:");
        g1.trabalhar();
        g1.receberSalario();
    }
}