package verificadores;

import login.Login;


public class Numero extends Verificador{

    public Numero() {
        super("\\d");
    }
    
    @Override
    public Login handle(Login login) {
        if(match(login.getSenha())){
            super.handle(login);
            return login;
        }
        
        System.out.println("N�o h� n�meros na senha!");
        return super.handle(login);
    }
    
}
