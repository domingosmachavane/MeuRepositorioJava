
package projectoedafinal;
import java.util.*;
public class Acoes {
 Cliente cliente; 
 Pilha clientes = new Pilha(); 
 Pilha entregador = new Pilha();
 Scanner leitura = new Scanner(System.in); 
    
    public Acoes(){
            
    }
   public void PreencherFormulario(){
        System.out.println("*************************\n"
                                    + "|  preencher o Formulario|\n"
                                    + "**************************");
     String nome;
     int nrcasa , quarteirao , telefone;
       System.out.println("Informe o nome :");
       nome = leitura.next();
       System.out.println("Informe o numero da casa : ");
       nrcasa = leitura.nextInt();
        System.out.println("Informe o numero de quarteirao : ");
       quarteirao = leitura.nextInt();
        System.out.println("Informe o numero de telefone : ");
       telefone = leitura.nextInt();
        cliente = new Cliente(nome,nrcasa,quarteirao,telefone);
        
   }
   public void AdicionarPizzas(Object e , int quantidade){
       for(int i = 0; i< quantidade;i++)
        {
            clientes.push(e);
        
        }
   }
   public void VisualizarPedidos(){
        for(int i =0; i<clientes.vetor.length ;i++){
                    if(clientes.vetor[i] == null)
                        continue;
                    else
                        System.out.println(clientes.vetor[i]+"");
        }
   }
 public void RemoverPizzas()
 {
    
            clientes.pop();
 }
  
    
}
