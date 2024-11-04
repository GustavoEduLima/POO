package AC2;

public class Gerente extends FuncionarioBase implements Beneficios{
    
    private double bonusPercentual;

    // Construtor da classe Gerente
    public Gerente (String nome, double salarioBase, double bonusPercentual){
        super(nome, salarioBase, "Gerente");
        this.bonusPercentual =  bonusPercentual;
    }
    
     // Getters e setters
    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

     // Implementação do método calcularSalario para Gerente
    @Override
    public double calcularSalario(){
        return getSalarioBase()+ (getSalarioBase() * bonusPercentual/100);
    }

    // Implementação dos métodos da interface Beneficios
    @Override 
    public double calcularBonus(double Percentual){
        return getSalarioBase() * (Percentual/100);
    }

    // Gerente não recebe auxílio-moradia
    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return 0;
    }
    
}