
package exercicio;
import java.io.*;

public class Trabalhador {
    //atributos
    private int codigo,idade;
        //constructor
public Trabalhador()throws IOException{
    Validacao b= new Validacao();
    System.out.println("insira o valor da idade(18-65);");
     idade=b.getValidacao();
    System.out.println("insira o valor do codigo (1111)-(9999)"); 
    codigo=b.getValidacao();
        }
}
