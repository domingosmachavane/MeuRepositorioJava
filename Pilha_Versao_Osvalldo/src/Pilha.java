
import static javafx.scene.input.KeyCode.T;

public class Pilha {
    
    public class Pilha  implements Interface<T> {
    
    private No base,topo;
    private int totalElemento;
    
    public Pilha() {
        base = null;
        topo = null;
        totalElemento=0;
    }
    

    

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
    @Override
    public void pop() {
        this.peekAndPop();
         }
    
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

    @Override
    public boolean isEmpty() {
        return totalElemento==0;
        }

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

    
}
