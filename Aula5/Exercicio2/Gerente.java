package Exercicio2;

public class Gerente extends Funcionario{

        @Override
        public void trabalhar() {
            System.out.println("Gerencia equipes e projetos");
        }
    
        @Override
        public void receberSalario() {
            System.out.println("Recebe um salário fixo com bônus por desempenho");
        }
    
}
