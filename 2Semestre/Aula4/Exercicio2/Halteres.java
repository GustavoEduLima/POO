package Exercicio2;

public class Halteres extends Equipamento{
    
    double peso;

    public Halteres(int anoAquisicao, String estado, double preco, double peso){
        super(anoAquisicao, estado, preco);
         this.peso = peso;
     }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
     
    public void exibirInformacao(){
        System.out.println("Peso do halter: "+ peso);
    }
}

