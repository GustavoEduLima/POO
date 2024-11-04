package Exercicio1;

public class Carro implements Veiculo{
   
    @Override
    public boolean Ligando(){
        System.out.println("O carro está ligando...");
                return true;
    }

    @Override
    public boolean Desligando(){
        System.out.println("O carro está Desligando...");
                return false;
    }
}
