public class Halter extends Equipamento{

    private double peso;

    @Override
    public double custoMensal() {

        return super.getPreco() * 0.01;
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Halter [peso=" + peso + ", custoMensal()=" + custoMensal() + ", getPreco()=" + getPreco()
                + ", getPeso()=" + getPeso() + ", getDataAquisicao()=" + getDataAquisicao() + "]";
    }

    

    
    
}
