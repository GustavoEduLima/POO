package Exercicio1;

public class Main{
    public static void main(String[] args) {
        Carro car = new Carro("Toyota", "Corolla", 2023);
        Moto bike = new Moto("Honda", "CG 160", 2022);
        Caminhao truck = new Caminhao("Mercedes-Benz", "Actros", 2021);

        System.out.println ("Carro:");
        car.exibirInformacoes();
        car.acelerar();

        System.out.println ("Moto:");
        bike.exibirInformacoes();
        bike.empinar();
        bike.acelerar();

        System.out.println ("Caminhão:");
        truck.exibirInformacoes();
        truck.acelerar();
    }
}
