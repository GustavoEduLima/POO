public class AutenticadorPorUsuarioESenha implements Autenticador{

    @Override
    public boolean autenticar(String credenciais){
        //usuario;senha
        String usuario = credenciais.split(";")[0];
        String senha = credenciais.split(";")[1];

        if(usuario.equals("1") &&
            senha.equals("1")){
                return true;

        }

        return false;
    }
    
}
