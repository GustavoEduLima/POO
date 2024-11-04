package Aula3;

public class CursoBasico {
    private String nomeCurso;
    private double valorMensalidade;

    public CursoBasico(String nomeCurso, double valorMensalidade){
        this.nomeCurso = nomeCurso;
        this.valorMensalidade = valorMensalidade;
    }

    public double calcularMensalidade() {
        return valorMensalidade;
    }

    public void setValorBase(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
}