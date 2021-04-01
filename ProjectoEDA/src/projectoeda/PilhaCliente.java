
package projectoeda;

public class PilhaCliente {
    public Object[] vetorCliente;
    public int indice;//dira nos o tamanho da pilha
    PilhaAdministrador pilhaadmin = new PilhaAdministrador();
    public PilhaCliente(){
        Cliente cliente = new Cliente();
        this.indice = -1;//A pilha Ainda esta Vazia
        this.vetorCliente = new Object[100];
        
        
    }
    /**/
    public boolean isEmptyCliente(){ //verifica se esta vazia
                if(this.indice == -1)
                {
                        return true;
        }
                return false;
                
    }
    public int SizeCliente(){// verifica o tamanho
                if(this.isEmptyCliente()){
                        return 0;
                }
                return this.indice+1;
    }
    public Object topCliente(){
            if(isEmptyCliente()){
                        return null;
            } return this.vetorCliente[this.indice];
    }
    public Object popCliente(){
            if(isEmptyCliente()){
                        return "pilha vazia...... ";
            }
            
            Object dado =  this.vetorCliente[this.indice--];
            return dado;
            
            
    }
    public void pushCliente(Object valor){
                if(this.indice< this.vetorCliente.length-1){
                        this.vetorCliente[++indice] = valor;
                }
    }
    public boolean isFull(){
                if(indice == vetorCliente.length-1){
                    System.out.println("Pilha esta cheia.........");
                        return true;
                }return false;
    }

    
    
}
