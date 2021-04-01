
package estruturadedadosfilas;

public class Fila {
    public int primeiro, ultimo , total;
    public Object elementos[];
   public Fila(int tamanho){
        this.elementos = new Object[tamanho];
        this.primeiro = 0;
        this.ultimo = 0;  
        this.total = 0;
        
    }
   public void enfileirar(Object elemento){
       if(estaCheia()){
            throw new RuntimeException("Pilha Esta Cheia");
       }
      this. elementos[ultimo]  =  elemento;
      this.ultimo = (ultimo+1) % elementos.length;
      total++;
   }
   public Object desenfileirar()
   {
        if(estaVazia()){
            throw new RuntimeException("Fila Esta Vazia");
       }
        Object valores = elementos[primeiro];
        this.primeiro = (primeiro+1) % elementos.length;
        total--;
        return valores;
   }
   public boolean estaVazia()
   {
        return (this.total == 0);
   }
   public boolean estaCheia()
   {
        return (total == this.elementos.length);
   }
   public void verFila(){
       if(estaVazia())
           System.out.println("Fila esta vazia nada podemos imprimir");
    for(int i = 0 ; i < total ; i++){
           System.out.println(elementos[i]);
    }
   }
   
    
    
    
}
