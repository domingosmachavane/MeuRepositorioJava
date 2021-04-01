
package gerirrevistas;
import java.text.DecimalFormat;
import java.io.*;
public class GerirRevistas {

    public static void main(String[] args) throws IOException{
       ArrayRevista arev=new ArrayRevista();
       DecimalFormat b=new DecimalFormat("###,###,00 Mt");
       arev.LerfichCriarArray();
        System.out.println("Dados do ficheiro armazenados no array:");
        System.out.println(arev);
      System.out.println("Total =" + b.format(arev.CalcTotal())); arev.gravarFicheiro("Out.txt");

    }
    
}
