
package herancalivro;

public class Dicionario  extends Livro{
    private int entradas;
    public Dicionario(int paginas,int entradas) {
        super(paginas);
        this.entradas = entradas;
    }
    @Override
public void descreve (){
   this.imprimir("========= Dicionario =========");
   this.imprimir("Numero de Paginas : "+super.getPaginas());
   this.imprimir("Numero de Entradas : "+this.entradas);
}
    
}
