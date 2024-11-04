package AC2;

public class Main {
    public static void main(String[] args) {
        Departamento tecnologia = new Departamento("Tecnologia");
        
        Funcionario joao = new Funcionario("João", 3000);
        Gerente maria = new Gerente("Maria", 5000, 20);
        Diretor carlos = new Diretor("Carlos", 10000, 30, 2000);

        tecnologia.adicionarFuncionario(joao);
        tecnologia.adicionarFuncionario(maria);
        tecnologia.adicionarFuncionario(carlos);

        System.out.println("Folha de pagamento total do departamento "+ tecnologia.getNome() + ": " 
                            + tecnologia.calcularFolhaPagamento());
        System.out.println("Salários dos funcionários:");
        tecnologia.imprimirSalariosFuncionarios();  
    }
}
