package Exercicio2;

public class Esteira extends Equipamento {
    
    double potencia;

    public Esteira(int anoAquisicao, String estado, double preco, double potencia){
       super(anoAquisicao, estado, preco);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    public void exibirInformacao(){
        System.out.println("Potencia da esteira: " + potencia);
    }
}
