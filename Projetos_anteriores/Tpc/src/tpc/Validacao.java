package tpc;
import java.io.*;
public class Validacao {
//atributos
        private short b,a;
    public Validacao(short vn,short tn )throws Exception{
   
    
    }
      private short getvalidarshort(short a, short b)throws IOException{
short c;

do{
    c=Short.parseShort(y.readLine());
if(c<a||c>b)
        System.out.println("VALOR INVALIDO! TENTE DE NOVO");
}while(c<a||c>b);
return c;
}
    BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
    Trabalhador x= new Trabalhador();
}
