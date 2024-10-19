package Exercicio1;

public class Moto extends Veiculos{
    
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    public void empinar(){
        System.out.println("Tu vai cair seu porra!!!!");
    }

}
