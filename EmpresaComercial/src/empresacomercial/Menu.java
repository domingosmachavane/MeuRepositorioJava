
package empresacomercial;
import java.io.*;
import java.util.Scanner;
public class Menu {
    Scanner ler = new Scanner(System.in);
    Operacoes oper  = new Operacoes();
    public void menu_principal() throws ClassNotFoundException, IOException{
    String condicao="sim";
    int opcao;
         
         do{
                                    System.out.println("==========================Menu_principal=====================");
                                    System.out.println("\t1.PartAdministrativa");
                                    System.out.println("\t2.Vendedores");
                                    System.out.println("\t3.Sair");
                                    
                                opcao = ler.nextInt();
                        switch(opcao){
                            case 1:menu_PartAdministrativa(); 
                            break;
                            case 2:menu_Vendedores();
                            break;
                            case 3: System.exit(0);
                            default : System.out.println("Opcao Invalida.......");
                        
                        }
                        System.out.println("Deseja Continuar no Menu principal [sim/nao]-[s/n]");
                        condicao = ler.next();





}while(condicao.equalsIgnoreCase(condicao) || condicao.equalsIgnoreCase("s"));
         }
    public void menu_PartAdministrativa() throws ClassNotFoundException, IOException{
    String condicao;
    
    int opcao;
         
         do{
                                    System.out.println("==========================Menu_PartAdministrativa=========================");
                                    System.out.println("\t1.Insercao de Dados");
                                    System.out.println("\t2.Visualizacao       ");
                                    System.out.println("\t3.Adicionar Quantidade dias e horas  extras :");
                                    System.out.println("\t4.Pagamento Mensal :");
                                    
                                opcao = ler.nextInt();
                        switch(opcao){
                            case 1: oper.insercaodadosAdministrativa();
                                break;
                            case 2: oper.imprimeVetorPartAdministrativa();
                                break;
                            case 3:Adiciona_horasEDias();
                                break;
                            case 4:Pagamento_Mensal();
                                break;
                            default : System.out.println("Opcao Invalida.........");
                        
                        }
                        System.out.println("Deseja Continuar[sim/nao]-[s/n] com Menu_PartAdministrativa");
                        condicao = ler.next();





}while(condicao.equalsIgnoreCase("sim") || condicao.equalsIgnoreCase("s"));
         }
    public void Adiciona_horasEDias(){
                String nome;
                int Id;
    }
    public void Pagamento_Mensal(){
    
    }
 
    public void menu_Vendedores(){
    String condicao="sim";
    int opcao;
         
         do{
                                    System.out.println("=================Menu_Vendedores======================");
                                    System.out.println("\t1.Inserir Dados do Vendedor ");
                                    System.out.println("\t2.Imprimir dados do vetor");
                                    System.out.println("\t3.Inserir quantidade de Vendas");
                                    System.out.println("\t4.Pagamento de Salario ");
                                    System.out.println("\t5.Sair ");
                                    
                                opcao = ler.nextInt();
                        switch(opcao){
                            case 1: oper.insercaodadosVendedor();
                                break;
                            case 2:oper.imprimeVetorVendedor();
                                break;
                            case 3:
                        
                        }
                        System.out.println("Deseja Continuar com Menu_Vendedores ([sim/nao]-[s/n])? ");
                        condicao = ler.next();





}while(condicao.equalsIgnoreCase("sim") || condicao.equalsIgnoreCase("s"));
         }

          
      
      
    
}
