package Aula3;

public class ContaBancaria{
    private double saldo;
    private int numeroConta;
    int agencia;
    private Cliente cliente;

    public ContaBancaria (Cliente pessoa, int agencia, int numeroConta){
        this.cliente = pessoa;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}

