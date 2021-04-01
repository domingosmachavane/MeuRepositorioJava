
package aula05;
import java.io.*;
public class Aula05 {
    public static void main(String[] args)throws IOException {
       ContaBanco p1=new ContaBanco();
       p1.setNumConta(2345);
       p1.setDono("Domingos");
       p1.abrirConta("CC");
       
      ContaBanco p2=new ContaBanco();
       p2.setNumConta(4345);
       p2.setDono("Shar");
        p2.abrirConta("CP");
      
       p1.depositar(100);
       p2.depositar(500);
       p2.sacar(6056);
       p1.estadoactual();
        p2.estadoactual();  
    }
}
