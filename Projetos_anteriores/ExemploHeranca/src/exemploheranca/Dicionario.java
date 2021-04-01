
package exemploheranca;

public class Dicionario extends Livro{
    private int entradas;

    public Dicionario(int pag,int ent) {
        super(pag);
       this.entradas=ent;
    }
    public void descreve(){
        System.out.println("======Dicionario========");
        System.out.println("Numero de pagians: \t"+paginas);
        System.out.println("Numero de entradas:\t"+entradas);
    }
    
}
