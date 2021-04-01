
package projectoeda;
import java.util.Scanner;
public class Menu {
    
   public Menu(){
       
   }
   public void Menu1(){
        Acoes acoes = new Acoes();
        Scanner scanner = new Scanner(System.in);
            String continuar = "";
            int opcao;
            do{
                        System.out.println("=========================\n"
                                    + "|1.Entrar como Cliente\n"
                                    + "|2.Entrar com Administrador\n"
                                    + "==============================");
                      System.out.println("Informe a opcao que deseja"); 
                      opcao = scanner.nextInt();
                      switch(opcao){
                          case 1 :MenuCliente() ;break;
                          case 2 : MenuAdministrador();break;
                          default : System.out.println("opcao invalida....");
                      
                      }
                      System.out.println("Deseja continuar?[sim/nao] ");
                      continuar = scanner.next();
            
            }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
                
   }
   public void MenuCliente(){
        Acoes acoes = new Acoes();
        Scanner scanner = new Scanner(System.in);
            String continuar = "";
            int opcao;
            acoes.RegistarCliente();
            do{
                        System.out.println("=========================\n"
                                    + "|1.Mostrar Pizzas Disponiveis e comprar(Adicionar na Pilha)\t|\n"
                                    + "|2.Remover Pizzas / entrega \t\t|\n"
                                    + "|3.Ver Tamanho Da pilha \t\t\n"
                                    + "|4.Ver o Topo\t\t\n"
                                    + "==============================");
                      System.out.println("Informe a opcao que deseja"); 
                      opcao = scanner.nextInt();
                      switch(opcao){
                          //case 1 : acoes.AdicionarNaPilha(opcao);break;
                          case 1 : acoes.VerificarPizzasDisponivel();break;
                          case 2 : acoes.RemoverDaPilhaCliente();break;
                          case 4: acoes.VerTopo();break;
                          default : System.out.println("opcao invalida....");
                      
                      }
                      System.out.println("Deseja continuar?[sim/nao] ");
                      continuar = scanner.next();
            
            }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
   }
   
   public void MenuAdministrador(){
            System.out.println("processando..........");
   }
}
