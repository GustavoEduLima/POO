package AC2;

public class Funcionario extends FuncionarioBase{
    
    // Construtor da classe Funcionário
    public Funcionario (String nome, double salarioBase){
        super(nome, salarioBase, "Funcionário");
    }

    
    // Implementação do método calcularSalario para Funcionário

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }
}