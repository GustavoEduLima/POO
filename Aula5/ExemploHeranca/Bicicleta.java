package ExemploHeranca;

public class Bicicleta extends EquipamentoEletrico{

    private double resistencia;    

    public Bicicleta(double resistencia, double preco, double conservacao, int voltagem) {
        this.setResistencia(resistencia);
        super.setConsercavacao(conservacao);
        super.setPreco(preco);
        super.setVoltagem(voltagem);
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Bicicleta [resistencia=" + resistencia + ", getVoltagem()=" + getVoltagem() + ", getDtAquisicao()="
                + getDtAquisicao() + ", getPreco()=" + getPreco() + ", getResistencia()=" + getResistencia()
                + ", getConsercavacao()=" + getConsercavacao() + "]";
    }

    

    
    
}
