package sistemarh;

// Subclasse
class Administrativo extends Funcionario {
    String departamento;

    void gerenciar() {
        System.out.println(nome + " está gerenciando o departamento de " + departamento);
    }
}
