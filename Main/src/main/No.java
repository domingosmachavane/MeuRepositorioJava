
package main;

public class No<T> {
     //'No'- pode se dizer juncao, ponto de referencia
    private No<T> anterior;
    private T elemento;
    private No<T> proximo;

    public No(No<T> anterior, T elemento, No<T> proximo) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(No<T> anterior, T elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public No(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    
}
