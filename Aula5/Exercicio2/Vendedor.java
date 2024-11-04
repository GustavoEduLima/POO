package Exercicio2;

public class Vendedor extends Funcionario{
    @Override
    public void trabalhar() {
        System.out.println("Vende produtos e serviços");
    }

    @Override
    public void receberSalario() {
        System.out.println("Recebe um salário + comissão por vendas");
    }
    
}
