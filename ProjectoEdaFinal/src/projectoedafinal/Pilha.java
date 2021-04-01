
package projectoedafinal;

public class Pilha {
     public Object[] vetor;
     public int indice;
      public Pilha(){
        this.indice = -1;//A pilha Ainda esta Vazia
        this.vetor = new Object[10];
        
        
    }
      //Metodos principais 
      public void push(Object elemento){
          try{
                if(vetor.length == indice)
                    System.out.println("pilha cheia....");
                else
                    indice++;
                    vetor[indice] = elemento;
                    System.out.println(elemento+" Inserido com sucesso");
              }catch(Exception msg){ System.out.println(" Pilha esta cheia " +msg.getMessage());}
          
      }
      public Object pop(){
            if(this.indice == -1){
                   System.out.println("******pilha esta vazia******"); 
                    return null;
            }else{
                        Object dado = vetor[indice];
                        indice--;
                        System.out.println(dado+" Removido com sucessoo.");
                        return dado;
            }
        
      }

    
    
      
      
}
