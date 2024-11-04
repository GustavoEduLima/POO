package sistemarh;

// Superclasse
class Funcionario {
    String nome;
    double salario;

    void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    void receberSalario() {
        System.out.println(nome + " recebeu o salário de R$ " + salario);
    }
}
