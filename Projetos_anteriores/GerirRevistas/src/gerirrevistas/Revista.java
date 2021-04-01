
package gerirrevistas;
import java.io.*;
import java.text.DecimalFormat;
public class Revista {
   //atributos
    private String nome;
    private int quant;
    private float preco;
    private float total;
    private DecimalFormat moeda;
 //Constructor
    public Revista(String n,int q, float pr){
        nome=n;
        quant=q;
        preco=pr;
        total=CalcTotal();
        moeda= new DecimalFormat("###,###,00. Mt");
    }
    private float CalcTotal(){
    return quant*preco;
    }
    public float getTotal(){
    return total;
    }
    public String getNome(){
    return nome;
    }
    public String toString(){
    return nome+" \t"+this.quant+" de preco "+this.moeda.format(preco)+" \t total="+this.moeda.format(total);
    }
}
