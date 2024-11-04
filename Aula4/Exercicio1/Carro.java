package Exercicio1;

public class Carro extends Veiculos{
    
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("Tu vai bater seu porra!!!!");
    }

}
