
package resumindo;
import java.io.*;
public class Avancando {
    //atributos
   private String descktop;
   private int codigo;
   private double preco;
   //construtor

    public Avancando() {
    }

    public String getDescktop() {
        return descktop;
    }

    public void setDescktop(String descktop) {
        this.descktop = descktop;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
   public void impressor(int p){
       for(int i=0;i<p;i++){
       System.out.println(" se tua vida fosse um filme assistiria com teus pais ");
     }
   }  
}
