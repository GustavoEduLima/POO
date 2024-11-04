package exemplo_sobrescrita;

public class AutenticadorBiometria extends Autenticador{

    public boolean autenticar(String credenciais){

        System.out.println("Recebendo biometria");
        if(credenciais.equals("aa")){
            return true;
        }

        return false;
    }
    
}
