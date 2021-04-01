
package exercicio;
import java.io.*;


public class Validacao {
    //atributos
        private short c, codigo,idade;
        private int q;
            //constructor
public Validacao()throws IOException{
        Validacao(codigo,idade);
        
    }
private short Validacao(short a,short b)throws IOException{
   
 BufferedReader x=new BufferedReader(new InputStreamReader(System.in));       
    do{
        
        c=Short.parseShort(x.readLine());
    
    if(c<a||c>b)
            System.out.println("VALOR INVALIDO! tente novamente");
    }while(c<a||c>b);
    return c;
    
    }
private int ValidaQuant()throws IOException{
   
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
  do{
  System.out.println(" quantos Trabalhadores Sao?");
  q = Integer.parseInt(a.readLine());
  if( q <= 0) System.out.println("Valor invalido! Tente de novo");
  } while (q <= 0); 
  return q; }

public int getValidaQuant(){
return q;
}
public short getValidacao(){
return c;
}
public String toString(){
return"codigo\t idade\n"+codigo+"\t"+idade;
    }
}
