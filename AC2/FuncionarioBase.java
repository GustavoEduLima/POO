package AC2;
public abstract class FuncionarioBase {
    private String nome;
    private double salarioBase;
    private String cargo;

    // Construtor da classe abstrata
    public FuncionarioBase(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cargo = cargo;
    }

    // Getters e setters    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

     // Método abstrato para calcular o salário
    public abstract double calcularSalario();

    // Método sobrecarregado para calcular o salário com bônus adicional
    public double calcularSalario(double bonusAdicional) {
        return calcularSalario() + bonusAdicional;
    }
}