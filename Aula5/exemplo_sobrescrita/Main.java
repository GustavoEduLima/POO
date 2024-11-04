package  exemplo_sobrescrita;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AutenticadorUsuarioSenha a1 = new AutenticadorUsuarioSenha();
        AutenticadorBiometria a2 = new AutenticadorBiometria();

        Scanner scan =  new Scanner(System.in);
        String usuarioSenha = "";
        System.out.println("Usuario");
        usuarioSenha = scan.next();
        System.out.println("Senha");
        usuarioSenha = usuarioSenha + ";" + scan.next();

        if(a1.autenticar(usuarioSenha)){
            System.out.println("Usuario autenticado");
        }else {
            System.out.println("Invalido");
        }

        String biometria = scan.next();

        if(a2.autenticar(biometria)){
            System.out.println("Autenticado");
        }else {
            System.out.println("invalido");
        }


    }
    
}
