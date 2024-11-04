package ExemploHeranca;


public class Haltere extends Equipamento{

    private double peso;

    public Haltere(String dtAquisicao, double preco, double peso){
        super.setDtAquisicao(dtAquisicao);
        super.setPreco(preco);
        this.setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Haltere [peso=" + peso + ", getDtAquisicao()=" + getDtAquisicao() + ", getPeso()=" + getPeso()
                + ", getPreco()=" + getPreco() + ", getConsercavacao()=" + getConsercavacao() + "]";
    } 

    
    
}
