package Aula1;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Volkswagen";
        carro1.modelo = "Virtus";
        carro1.ano = 2019;

        carro2.marca = "Volkswagen";
        carro2.modelo = "Voyage";
        carro2.ano = 2013;

        System.out.println("Carro:");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        
        System.out.println("Carro:");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
