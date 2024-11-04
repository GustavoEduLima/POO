package Aula3;

public class CursoAvançado {
    private String nomeCurso;
    private double valorMensalidade;
    private double valorMaterial;

    public CursoAvançado(String nomeCurso, double valorMensalidade, double valorMaterial) {
        this.nomeCurso = nomeCurso;
        this.valorMensalidade = valorMensalidade;
        this.valorMaterial = valorMaterial;
    }

    public double calcularMensalidade() {
        return valorMensalidade + valorMaterial;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public double getTaxaMaterial() {
        return valorMaterial;
    }
}
