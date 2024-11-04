package Exercicio2;

public class Engenheiro extends Funcionario{
    
    public void trabalhar() {
        System.out.println("Projeta e desenvolve soluções");
    }

    @Override
    public void receberSalario() {
        System.out.println("Recebe por hora trabalhada");
    }
}