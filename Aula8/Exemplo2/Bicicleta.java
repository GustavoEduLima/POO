public class Bicicleta extends Equipamento{

    private double potencia;   
    

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public double custoMensal(){
        return this.potencia * 0.3 * 30;
    }

    @Override
    public String toString() {
        return "Bicicleta [potencia=" + potencia + ", getPotencia()=" + getPotencia() + ", getPreco()=" + getPreco()
                + ", getDataAquisicao()=" + getDataAquisicao() + ", custoMensal()=" + custoMensal() + "]";
    }

    
    
}
