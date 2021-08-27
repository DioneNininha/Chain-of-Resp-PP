package verificadores;

import login.Login;



public class TamanhoSenha extends Verificador{

    @Override
    public Login handle(Login login) {
        String senha = login.getSenha();
        
        if(senha.length() >= 8 && senha.length() <= 16){
            super.handle(login);
            return login;
        }
        
        System.out.println("A senha não tem um tamanho adequado!");
        return super.handle(login);
    }
    
}
