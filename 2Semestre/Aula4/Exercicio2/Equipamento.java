package Exercicio2;

public class Equipamento {
    private int anoAquisicao;
    private String estado;
    private double preco;
    
    public Equipamento(int anoAquisicao, String estado, double preco) {
        this.anoAquisicao = anoAquisicao;
        this.estado = estado;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("Ano de Aquisição " + anoAquisicao);
        System.out.println("Estado de Conservação: " + estado);
        System.out.println("Preço: " + preco);
    }


    public int getAnoAquisição() {
        return anoAquisicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPreço() {
        return preco;
    }       

}

