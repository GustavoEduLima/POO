package Aula3;

public class Especialização {
    private String nomeCurso;
    private double valorMensalidade;
    private double valorMaterial;
    private double valorCertificado;

    public Especialização(String nomeCurso, double valorMensalidade, double valorMaterial, double valorCertificado) {
        this.nomeCurso = nomeCurso;
        this.valorMensalidade = valorMensalidade;
        this.valorMaterial = valorMaterial;
        this.valorCertificado = valorCertificado;
    }

    public double calcularMensalidade() {
        return valorMensalidade + valorMaterial + valorCertificado;
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

    public double getValorCertificado() {
        return valorCertificado;
    }
}