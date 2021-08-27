package verificadores;

import login.Login;


public class Maiusculo extends Verificador{

    public Maiusculo() {
        super("[A-Z]");
    }
    
    @Override
    public Login handle(Login login) {
        if(match(login.getSenha())){
            super.handle(login);
            return login;
        }
        
        System.out.println("A senha não tem um caractere em maiúsculo!");
        return super.handle(login);
    }
}









//import java.util.regex.Matcher;
//import java.util.regex.Pattern;//import java.util.regex.Matcher;
//import java.util.regex.Pattern;