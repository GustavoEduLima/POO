package AC2;

public class Diretor extends FuncionarioBase implements Beneficios{
    
    private double bonusPercentual;
    private double auxilioMoradia;
    
    // Construtor da classe Diretor
    public Diretor(String nome, double salarioBase, double bonusPercentual, double auxilioMoradia) {
        super(nome, salarioBase, "Diretor");
        this.bonusPercentual = bonusPercentual;
        this.auxilioMoradia = auxilioMoradia;
    }

    // Getters e setters
    public double getBonusPercentual() {
        return bonusPercentual;
    }
    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    public double getAuxilioMoradia() {
        return auxilioMoradia;
    }
    
    public void setAuxilioMoradia(double auxilioMoradia) {
        this.auxilioMoradia = auxilioMoradia;
    }
    
    // Implementação do método calcularSalario para Diretor
    @Override
    public double calcularSalario(){
        return getSalarioBase() + (getSalarioBase() * bonusPercentual) + auxilioMoradia;
    }

    // Implementação dos métodos da interface Beneficios
    @Override
    public double calcularBonus(double percentual) {
        return getSalarioBase() * (percentual / 100);
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return valorFixado;
    }
}