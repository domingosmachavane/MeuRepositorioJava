
package studiesfuture.Acoes;

import java.util.Scanner;

public class Menu {
    Acoes acoes = new Acoes();
    Scanner scanner = new Scanner(System.in);
    public Menu(){
        
    }
    public void MenuPrincipal(){
        int opcao;
        while(true){
           System.out.println("====================================\n"
                       + "|1.CADASTRAR ESTUDANTES|\n"
                       + "|2.CADASTRAR PROFESSORES|\n"
                       + "|3.VER TABELA DE PRECOS|\n"
                       + "|4.IMPRIMIR ESTUDANTES CADASTRADOS|\n"
                       + "|5.IMPRIMIR PROFESSORES CADASTRADOS|\n"
                       + "|6.VERIFICAR DISCIPLINAS|\n"
                       + "|7.SAIR|\n"); 
            System.out.println("Escolha a opcao.");
            opcao = scanner.nextInt();
           switch(opcao){
               case 1: acoes.cadastrar(1); break;
               case 2:acoes.cadastrar(2);break;
               case 5: acoes.imprimeEstudantes();break;
               case 3:System.exit(0);break;
           }
           MenuPrincipal();
        }
    }
}
