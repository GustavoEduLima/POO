import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // AutenticadorPorBiometria a1 = new AutenticadorPorBiometria();
        // AutenticadorPorUsuarioESenha a2 = new AutenticadorPorUsuarioESenha();

        // String dedo = "AHAHAHHAHAHA";

        // if(a1.autenticar(dedo)){
        //     System.out.println("Autenticado");
        // }else{
        //     System.out.println("Credenciais incorretas");
        // }

        // Scanner scn = new Scanner(System.in);
        // System.out.println("Digite o usuario");
        // String usuario = scn.next();
        // System.out.println("Digite a senha");
        // String senha = scn.next();

        // if(a2.autenticar(usuario + ";" + senha)){
        //     System.out.println("Autenticado com usuario e senha");
        // }else{
        //     System.out.println("Invalido");
        // }

        Autenticador a;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolhe o tipo de autenticação: 1 " +
                            "para biometria e 2 para usuario e senha");
        int op = scanner.nextInt();

        if(op == 1){
            a = new AutenticadorPorBiometria();
            String dedo = "AHAHAHHAHAHA";

            if(a.autenticar(dedo)){
                System.out.println("Autenticado");
            }else{
                System.out.println("Credenciais incorretas");
            }

        } else if(op == 2){

            a = new AutenticadorPorUsuarioESenha();

            System.out.println("Digite o usuario");
            String usuario = scanner.next();
            System.out.println("Digite a senha");
            String senha = scanner.next();

            if(a.autenticar(usuario + ";" + senha)){
                System.out.println("Autenticado com usuario e senha");
            }else{
                System.out.println("Invalido");
            }

        }
                    
        
    }
    
}
