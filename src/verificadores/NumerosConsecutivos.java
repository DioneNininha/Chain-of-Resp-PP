package verificadores;

import login.Login;


public class NumerosConsecutivos extends Verificador{

    public NumerosConsecutivos() {
        super("\\d{3,}");
    }

    @Override
    public Login handle(Login login) {
        if(!match(login.getSenha())){
            super.handle(login);
            return login;
        }
        
        System.out.println("A senha n�o pode ter n�meros consecutivos!");
        return super.handle(login);
    }
}
