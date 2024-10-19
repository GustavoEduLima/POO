package Exercicio2;

public class Main {
    public static void main(String[] args) {
        // Criando uma Esteira
        Esteira est = new Esteira(2024, "Pessimo",2000.00, 3.0);

        // Criando uma Bicicleta Ergométrica
        Bicicleta bike = new Bicicleta(2020, "Bom",1500.00, 1.0);
    

        // Criando um Halteres
        Halteres halt = new Halteres(2024, "Otimo",200.00, 20.0);
       
        // Imprimindo as informações dos equipamentos
        System.out.println("Esteira:");
        est.exibirInformacoes();
        est.exibirInformacao();

        System.out.println("Bicicleta: ");
        bike.exibirInformacoes();
        bike.exibirInformacao();
        
        System.out.println("Halteres: ");
        halt.exibirInformacoes();
        halt.exibirInformacao();
    }
}
