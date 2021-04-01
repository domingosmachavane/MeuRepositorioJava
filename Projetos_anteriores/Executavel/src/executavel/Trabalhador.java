
package executavel;
import java.io.*;
public class Trabalhador {
    //atributos 
 private Short Codigo,idade;
 //Constructor. Recebe Valores inicicias dos atributos(Codigo e idade)
 public Trabalhador()throws IOException{
     System.out.println("Introduza o Codigo(1111-9999);");
     Codigo=ValidarShort((short)1111,(short)9999);
     System.out.println("Idade(18-65);");
     idade=ValidarShort((short)18,(short)9999);
 }
     
}
