public class AutenticadorPorBiometria implements Autenticador{

    @Override
    public boolean autenticar(String credenciais) {

        if(credenciais.equals("AHAHAHHAHAHA")){
            return true;
        }

        return false;
        
    }

    
    
}
