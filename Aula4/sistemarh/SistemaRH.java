package sistemarh;

public class SistemaRH {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor();
        dev.nome = "Lucas";
        dev.salario = 6000.00;
        dev.linguagemDeProgramacao = "Java";
        dev.trabalhar();
        dev.programar();
        dev.receberSalario();

        Administrativo admin = new Administrativo();
        admin.nome = "Mariana";
        admin.salario = 5000.00;
        admin.departamento = "Financeiro";
        admin.trabalhar();
        admin.gerenciar();
        admin.receberSalario();
    }
}

