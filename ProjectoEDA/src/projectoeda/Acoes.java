
package projectoeda;
import java.io.*;
import java.util.Scanner;

public class Acoes 
{
    private String nomeCliente;
    private int contactCliente , quantidade;
    private String casaCliente, quarteirCliente;
     Scanner ler = new Scanner(System.in); 
     Cliente cliente = new Cliente();
     PilhaCliente pilhaCliente = new PilhaCliente();
     PilhaAdministrador pilhaAdmin = new PilhaAdministrador();
    public Acoes ()
    { 
    
    }
    public void VerTopo(){
                System.out.println("O Elemento Que esta no topo e :"+pilhaCliente.topCliente()+"e eh de : "+cliente.toString());
    }
    
    public void RegistarCliente()
    {
        
        Cliente   cliente = new Cliente(); 
        System.out.println("**********************************\n"
                                   + "*         Preencha o formulario         *\n"
                                    + "***********************************");
        System.out.println("Introduza o nome: ");
        nomeCliente = ler.next();
        cliente.setNomeCliente(nomeCliente);
        
        System.out.println("Introduza o contacto: ");
        contactCliente = ler.nextInt();
        cliente.setContactCliente(contactCliente);
    
        System.out.println("Introduza o numero do quarteirao: ");
        quarteirCliente = ler.next();
        cliente.setQuarteirCliente(quarteirCliente);

        System.out.println("Introduza o numero da casa: ");
        casaCliente = ler.next();
        cliente.setCasaCliente(casaCliente);
    }
    public void AdicionarNaPilha(Object escolha){
                    pilhaCliente.pushCliente(escolha);
                    //if(pilhaCliente.isFull()){
                              
                   // }
                        
                        
        }
    
  
    public void VerificarPizzasDisponivel()
    {
        float saboresPrecos[] = {400,600,500,800,650,1000};
        String Sabores[] = {"1.Calabresa ---400MT","2.Peperone--600MT","3.Portuguesa---500MT","4.Frango com Catupir---800","5.Quatro Estacoes--650MT"};
        String continuar = "";
        int escolha , quantidade;
        double precoTotal=0 ;
        System.out.println("*********WELCOME********");
        do{
        System.out.println("=======================\n"
                    + "|1.Calabresa--------400Mt\n"
                    + "|2.Peperone--------600Mt \n"
                    + "|3.Portuguesa--------500Mt\n"
                    + "|4.Frango com Catupiry--------800Mt\n"
                    + "|5.quatro estacoes--------650Mt \n"
                    + "|6.Sair                                         \n"
                    + "=======================");
        System.out.println("Que pizzas ira levar ?");
        escolha = ler.nextInt();
        if(escolha == 6)
                System.exit(0);
        
        System.out.println("Quantas Dessas pilhas deseja levar ");
        quantidade = ler.nextInt();
        for(int i= 0; i <= quantidade;i++){
                AdicionarNaPilha(Sabores[escolha-1]);
        }
        precoTotal += precoTotal(quantidade , saboresPrecos[escolha-1]);
       // precoTotal += saboresPrecos[escolha-1]; 
            System.out.println("Deseja levar mais Algumas pizzas [sim/nao]?");
            continuar = ler.next();
        }while(continuar.equalsIgnoreCase("sim") || continuar.equalsIgnoreCase("s"));
        System.out.println("O preco que Deve Pagar pelas pizzas e : " +precoTotal);
        System.out.println("*********************************************");
        
    }
    public double precoTotal(int quantidade , float escolha){
        double precoTotal = quantidade*escolha;
          return precoTotal;  
    }
    public void RemoverDaPilhaCliente()
    {
        Object e;
        //e = pilhaCliente.popCliente();
        //System.out.println("Removendo "+ e);
        System.out.println(" "+pilhaCliente.popCliente());
    }
    
    
   
}
