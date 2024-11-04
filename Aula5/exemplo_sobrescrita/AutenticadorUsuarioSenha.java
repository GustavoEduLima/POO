package exemplo_sobrescrita;

public class AutenticadorUsuarioSenha extends Autenticador{

    //"usuario;senha"

    @Override
    public boolean autenticar(String credenciais){
        super.autenticar(credenciais);

        String usuario = credenciais.split(";")[0];
        String senha = credenciais.split(";")[1];

        if(usuario.equals("1") && senha.equals("1")){
            return true;
        }

        return false;

    }
    
}
