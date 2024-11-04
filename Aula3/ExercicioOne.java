package Aula3;

public class ExercicioOne {
    public static void main(String[] args) {
        Cliente pessoa = new Cliente();

        pessoa.cpf = "11111";
        pessoa.endereço = "Rua 1";
        if(pessoa.validarCpf()){
            System.out.println("CPF Válido");
        }

        ContaBancaria cc = new ContaBancaria(pessoa, 111, 111);
        cc.agencia = 111;
        cc.setNumeroConta(111);
        cc.setSaldo(200.00);
        cc.setCliente(pessoa);

        System.out.println("Cliente: "+ cc.getCliente().nome +
                            "CC" + cc.getNumeroConta());
    }
}
