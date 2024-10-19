package Exercicio2;

public class Bicicleta extends Equipamento{

    double PotenciaMotor;

    public Bicicleta(int anoAquisicao, String estado, double preco, double PotenciaMotor){
        super(anoAquisicao, estado, preco);
        this.PotenciaMotor = PotenciaMotor;
    }

    public double PotenciaMotor() {
        return PotenciaMotor;
    }

    public void exibirInformacao(){
        System.out.println("Potencia do motor:" + PotenciaMotor);
    }
    
}
