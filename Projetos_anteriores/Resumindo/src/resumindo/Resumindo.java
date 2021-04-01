
package resumindo;
import java.io.*;
public class Resumindo {
  public static void main(String[] args) throws IOException{
       BufferedReader br;
       br=new BufferedReader(new InputStreamReader(System.in));
       Prato teste1;
       teste1= new Prato("joao",18);
       teste1.setNome("Justino");
       teste1.setidade(23);
       teste1.ImprimeDados(7, 8);
       Avancando pt=new Avancando();
       pt.impressor(2);
       
       }
 }
