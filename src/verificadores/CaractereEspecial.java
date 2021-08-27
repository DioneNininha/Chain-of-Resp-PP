package verificadores;

import login.Login;

public class CaractereEspecial extends Verificador{


    public CaractereEspecial() {
        super("[\\W]");
    }

    @Override
    public Login handle(Login login) {
        if(match(login.getSenha())){
            super.handle(login);
            //Essa mensagem s� ser� verdade se este item for o ultimo da cadeia
            System.out.println("O ultimo item a ser executado! Login v�lido!"); 
            return login;
        }
        
        System.out.println("N�o h� caractere especial na senha!");
        return super.handle(login);
    }
    
}
