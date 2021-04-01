
package sistemadejornal;


import java.util.Date;

public class Jornal  {
    private float preco;
    private int periodicidade;
    private int numSerie;
    private char formato;

    public Jornal(float preco, int periodicidade, int numSerie, char formato) {
        this.preco = preco;
        this.periodicidade = periodicidade;
        this.numSerie = numSerie;
        this.formato = formato;
        
        
    }
    public void lerJornal(){
        ReadAndWritefOb bb = new ReadAndWritefOb();
                        bb.lerNum("");
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(int periodicidade) {
        this.periodicidade = periodicidade;
    }

    @Override
    public String toString() {
        return "==========Jornal=========\n " + "preco = " + preco + "\n periodicidade = " + periodicidade + "\n numSerie=" + numSerie ;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

   
    
}
