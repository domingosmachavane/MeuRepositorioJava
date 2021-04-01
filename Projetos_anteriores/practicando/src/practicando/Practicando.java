
package practicando;
import java.io.*;
public class Practicando {

   
    public static void main(String[] args)throws IOException {
       BufferedReader br;
       br=new BufferedReader(new InputStreamReader(System.in));
       float a=0,b=0,c=0;
       try{
           Math.atan(((3)^1/2)/2f);
           System.out.println("|==============================|");
           System.out.println("insira o primeiro valor");
           a=Float.parseFloat(br.readLine());
           System.out.println("|==============================|");
           System.out.println("insira o segundo valor");
           b=Float.parseFloat(br.readLine());
            System.out.println("|==============================|");
           System.out.println("insira o segundo valor");
           c=Float.parseFloat(br.readLine());
            System.out.println("|==============================|");
            
             calculaarea cv=new calculaarea(a ,b, c);
             cv.setAltura( 70.9f);
             System.out.println("  "+ cv.getAltura());
             
            }catch(NumberFormatException ni){
           System.out.println("FORMATO INVALIDO ");
       }
    calculaperimtro np=new calculaperimtro(a,b,c);
    
   
    }
    
}
 