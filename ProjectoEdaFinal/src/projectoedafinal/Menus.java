
package projectoedafinal;

import java.util.Scanner;

public class Menus {
       Scanner leitura = new Scanner(System.in);  
       Acoes acoes = new Acoes();
       Pilha cliente = new Pilha();
    public Menus() {
        
    }
    public void MenuPrincipal(){
        String continuar ="";
        int opcao;
          do{
              System.out.println("************Bem vindo ao sistema*****************");
              System.out.println("|1. Menu de Cliente\n"
                                         + "|2.Menu de Entregador");
              System.out.println("Escolha uma opcao");
              opcao = leitura.nextInt();
              switch(opcao){
                  case 1 : MenuCliente();break;
                  case 2 : MenuEntregador();break;
                  default : System.out.println("Opcao Invalida ........");
                        
                      System.out.println(" Deseja continuar no menu principal ?");
                      continuar = leitura.next();
              
              }
              
          }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s") ); 
    }
      public void MenuEntregador(){
            String continuar ="";
        int opcao;
          do{
              System.out.println("************Bem vindo ao Menu do Entregador*****************");
              System.out.println("|1.Visualizar os pedidos \n"
                                         + "|2.Remover pizzas\n"
                                         + "|3.Sair \n");
              System.out.println("Escolha uma opcao");
              opcao = leitura.nextInt();
              switch(opcao){
                  //case 1 : MenuCardapio();break;
                  case 1 : acoes.VisualizarPedidos();break;
                  case 2: acoes.RemoverPizzas();break;
                  case 3 : System.exit(0);break;
                  default : System.out.println("Opcao Invalida ........");
                        
              }
              System.out.println("Deseja continuar no menu do cliente");
              continuar = leitura.next();
          
          
          }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s") );
          
          
    
    }  
      public void MenuCliente(){
           String continuar ="";
        int opcao;
          do{
              System.out.println("************Bem vindo ao Menu do cliente*****************");
              System.out.println("|1.Ver cardapio e Adicionar pizzas  \n"
                                         + "|2.Visualizar os pedidos\n"
                                         + "|3.Remover pizzas \n"
                                         + "4.Sair");
              System.out.println("Escolha uma opcao");
              opcao = leitura.nextInt();
              switch(opcao){
                  case 1 : MenuCardapio();break;
                  case 2 : acoes.VisualizarPedidos();break;
                  case 3: acoes.RemoverPizzas();break;
                  case 4 : System.exit(0);break;
                  default : System.out.println("Opcao Invalida ........");
                        
              }
              System.out.println("Deseja continuar no menu do cliente");
              continuar = leitura.next();
          
          
          }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s") ); 
    
    }
      // @SuppressWarnings("UseOfSystemOutOrSystemErr")
      public void MenuCardapio(){
            String continuar = "";
            double precoPagar = 0;
            int opcao , quantidade;
            //Acoes action = new Acoes();
            acoes.PreencherFormulario();
             float saboresPrecos[] = {400,600,500,800,650,1000};
             String Sabores[] = {"Calabresa ---400MT","Peperone--600MT","Portuguesa---500MT","Frango com Catupir---800","Quatro Estacoes--650MT"};
            do{
                    System.out.println("*********WELCOME********");
                    System.out.println("=======================\n"
                    + "|1.Calabresa--------400Mt\n"
                    + "|2.Peperone--------600Mt \n"
                    + "|3.Portuguesa--------500Mt\n"
                    + "|4.Frango com Catupiry--------800Mt\n"
                    + "|5.quatro estacoes--------650Mt \n"
                    + "|6.Sair                                         \n"
                    + "=======================");
        System.out.println("Que pizzas ira levar ?");
        opcao = leitura.nextInt();
        if(opcao == 6)
                System.exit(0);
        System.out.println("Quantas pizzas desse tipo ira levar ?");
        quantidade = leitura.nextInt();
        acoes.AdicionarPizzas(Sabores[opcao-1], quantidade);
        precoPagar += saboresPrecos[opcao-1]*quantidade;
        System.out.println(" deseja levar mais algumas ??");
        continuar = leitura.next();
            
            
         }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
        acoes.cliente.setPrecoPagar(precoPagar);
        System.out.println("*********************************************");
        System.out.println("Dados do Cliente:  " +acoes.cliente.toString()+" preco a pagar "+ acoes.cliente.getPrecoPagar());
        acoes.VisualizarPedidos();
        System.out.println("*********************************************");
            
            
      
      
      }
      
}
