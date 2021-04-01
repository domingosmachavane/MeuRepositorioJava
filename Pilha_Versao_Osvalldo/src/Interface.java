public interface Interface<T> {
    
    public void pop();
    public void push(T elemento);
    public T peekAndPop();
    public Pilha clone();
    public boolean isEmpty();
    
}