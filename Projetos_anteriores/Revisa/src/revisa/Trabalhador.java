
package revisa;
import java.io.*;
public class Trabalhador {
    private short codigo,idade;
    private  BufferedReader br;
 //construtor
  public  Trabalhador()throws IOException{
      System.out.println("Indique o seu Codigo");
        this.codigo=Validashort((short)1111,(short)9999);
           System.out.println("Indique A sua Idade");
        this.idade=Validashort((short)18,(short)65);
        toString();
        
    
    }
    public short Validashort(short a,short b)throws IOException{
       
        br=new BufferedReader(new InputStreamReader(System.in));
        short c;
       
        do{  c=Short.parseShort(br.readLine());
            if(c<a || c>b){
                System.out.println("O valor inserido e invalido");
                System.out.println("Digite um outro valor valido");
            }
        }while(c<a||c>b);
        
    return c;
    }
    public short getIdade(){return this.idade;}
    public String toString(){
        String b="a idade e:\n"+this.idade+" \n o codigo e :\n"+ this.codigo;
        System.out.println(b);
        return b;}
    
}
