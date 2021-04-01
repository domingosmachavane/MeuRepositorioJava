
package estruturadedadospilha;

//import jdk.nashorn.internal.runtime.Context;

public class Pilha {
    private Object elemento[];
    private int indice;
    
    public Pilha(int tamanho){
            this.elemento = new Object[tamanho];
            this.indice = -1;
    }
     public void empilhar(Object object){ 
                 if(!estaCheia()){
                    indice +=1;
                    this.elemento[indice] = object; 
                } else{
                            throw new RuntimeException("Stcack Overflow");
                 }
             
     }
     public Object desempilhar(){      
         if(estaVazia())
                   throw new RuntimeException("Pilha Vazia");
                 
              Object dado = this.elemento[this.indice]; 
              indice--;
              return dado;
              
     }
     public boolean estaVazia(){
                return (this.indice == -1);       
     }
     public boolean estaCheia(){
                return (this.indice == elemento.length);
     }
     public void aumentaCapacidade(){
     
     }
   
     public Object verTopo(){
            if(estaVazia())
                  return null;
            return this.elemento[indice];
            
     }
     
   
    public Object[] getElemento() {
        return elemento;
    }

    public void setElemento(Object[] elemento) {
        this.elemento = elemento;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "Pilha{" + "elemento=" + elemento[indice] + ", indice=" + indice + '}';
    }
    
     
     
}
