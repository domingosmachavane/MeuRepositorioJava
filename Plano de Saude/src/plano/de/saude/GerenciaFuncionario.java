/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano.de.saude;

import java.util.Scanner;

/**
 *
 * @author Domingos Machavane
 */
public class GerenciaFuncionario  {
    private int opcao;
     private String cont;
    Funcionario f;
    Scanner scanner = new Scanner(System.in);
    //Funcionario f = new FuncionarioGold("Domingos",19,'M',878904085,2000000);
    //Funcionario fg= new FuncionarioSilver("Domingos",19,'M',878904085,2000000);
    
    /*public GerenciaFuncionario(){
        
    }*/
    public void Menu(){
        do{
                    System.out.println("==========Menu=======");
                    System.out.println("1.Funcionario Gold ");
                    System.out.println("2.Funcionario silver");
                    System.out.println("3.Sair");
                    opcao = scanner.nextInt();
                    switch(opcao){
                    
                    
                    }
                    System.out.println("Deseja continuar ");
                    cont = scanner.next();
        }while()        
    
    }
         
        
        

    
        
    
    
}
