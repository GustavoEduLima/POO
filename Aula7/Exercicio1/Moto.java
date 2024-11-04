package Exercicio1;

public class Moto implements Veiculo{
   
    @Override
    public boolean Ligando(){
        System.out.println("A Moto está ligando...");
                return true;
    }

    @Override
    public boolean Desligando(){
        System.out.println("A Moto está Desligando...");
                return false;
    }
}
