package AC2;
import java.util.ArrayList;

public class Departamento {
    
    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    // Construtor da classe Departamento
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    
    // Getters e setters
    public String getNome(){
        return nome;    
    }

    // Método para adicionar um funcionário ao departamento
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para calcular a folha de pagamento do departamento
    public double calcularFolhaPagamento() {
        double total = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    // Método para imprimir os salários dos funcionários
    public void imprimirSalariosFuncionarios() {
        System.out.println("Departamento: " + nome);
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + 
                                ", Cargo: " +funcionario.getCargo()+
                                ", Salário: " + funcionario.calcularSalario());
        }
    }
}