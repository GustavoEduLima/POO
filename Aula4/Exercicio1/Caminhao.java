package Exercicio1;

public class Caminhao extends Veiculos{
        
    public Caminhao(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(){
        System.out.println("Tu vai tombar seu porra!!!!");
    }

}
