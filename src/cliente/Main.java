package cliente;

import java.util.ArrayList;
import java.util.Scanner;
import login.Login;
import verificadores.CaractereEspecial;
import verificadores.Maiusculo;
import verificadores.LoginCadastrado;
import verificadores.Minusculo;
import verificadores.NumerosConsecutivos;
import verificadores.Numero;
import verificadores.TamanhoSenha;

public class Main {

  
  @SuppressWarnings("unchecked")
   
public static void main(String[] args) {
       ArrayList logins = new ArrayList<>();
       Scanner scan = new Scanner(System.in);
       String email, senha;
       
       logins.add(new Login(" abcdefg@dominio.com ", " @ewerR8G9 "));
       logins.add(new Login(" gfedcba@dominio.com ", " ewerR@8ç9 "));
       logins.add(new Login(" natasha@dominio.com ", " iBy5IILG "));
       logins.add(new Login(" usuario@dominio.com ", " ew{erR8}9 "));
       logins.add(new Login(" email", "senha "));
      
       
       //   @ewersdfr
       System.out.println("------------------------");
       
       System.out.print("E-mail: ");
       email = scan.next();
       System.out.print("Senha: ");
       senha = scan.next();
       
       Login login = new Login(email, senha);
       
       LoginCadastrado verificarLogin = new LoginCadastrado(logins);
       
       verificarLogin
               .setNextHandler(new TamanhoSenha()) //  @ewerR8G9dlformdjskwlrçgjdkgldkglto
               .setNextHandler(new Maiusculo())  //   #iewersdfr
               .setNextHandler(new Minusculo())   //  $ ASCDFRTGQ
               .setNextHandler(new Numero()) // !ASCFRTG2
               .setNextHandler(new NumerosConsecutivos())  // 1235IILG " 
               .setNextHandler(new CaractereEspecial());  // ASCDFRTGQ

       System.out.println("------------------------");
       
       Login log = verificarLogin.handle(login);
       
       System.out.println("------------------------");
       
       if(log != null)
           System.out.println("Login verificado: " + log.getEmail() + " - " + log.getSenha());
   }
}