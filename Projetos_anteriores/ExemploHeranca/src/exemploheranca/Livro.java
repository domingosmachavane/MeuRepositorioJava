
package exemploheranca;

public class Livro {
    protected int paginas;
    
    public Livro(int p){
    this.paginas=p;
    }
    public void descreve(){
        System.out.println("Livro com "+paginas+"paginas");
    
    }
    
}
