
package main;

public class Pilha<T> implements Interface<T> {
    //criacao dos estremos da pilha
    private No<T> base,topo;
    private int totalElemento;
    
    public Pilha() {
        base = null;
        topo = null;
        totalElemento=0;
    }
    

    
    //Metodo que adiciona novo elemento na pilha
    @Override
    public void push(T elemento) {
        if(elemento==null)
            throw new NullPointerException("ELEMENTO VAZIO");
        No<T> novo=new No(elemento);
        if(isEmpty())
            base=topo=novo;
        else{
            novo.setAnterior(topo);
            topo.setProximo(novo);
            topo=novo;
        }
        totalElemento++;
       }
    //Metodo que elimina o ultimo elemento inserido
    @Override
    public void pop() {
        this.peekAndPop();
         }
    
    // Metodo retorna o ultimo elemento depois de ser eliminado estrutura
    @Override
    public T peekAndPop() {
       
        if(isEmpty())
            throw new NullPointerException("ESTRUTURA VAZIA");
        
        T aux=this.topo.getElemento();
        this.topo=this.topo.getAnterior();
       // this.topo.setProximo(null);
        totalElemento--;
        if(totalElemento==0)
            topo=base=null;
        return aux;
            }

    //Metodo que verifica se a estrutura esta vazia ou nao
    @Override
    public boolean isEmpty() {
        return totalElemento==0;
        }
    
    // Metodo toString aprimorado com aspeto dum array
    public String toString(){
        if(isEmpty())
            return "[ Estrutura Vazia ]";
        else{
            StringBuilder st= new StringBuilder();
            st.append("[ ");
                while(!isEmpty() & totalElemento >1){
                    st.append(peekAndPop());
                    st.append(", ");
                }
            st.append(peekAndPop());
            st.append(" ]");
        return st.toString();
    }
        }
    
    // Metodo que faz e retorna a copia da duma pilha
    @Override
    public Pilha <T> clone() {
        Pilha aux = new Pilha();
        Pilha retorno = new Pilha<T>();
        
        while(!this.isEmpty())
            aux.push(this.peekAndPop());
        while(!aux.isEmpty()){
            T entrega=(T)aux.peekAndPop();
            this.push(entrega);
            retorno.push(entrega);
        }
        return retorno;
        }
}
