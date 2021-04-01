
package verificatriangulo;
import java.io.*;
public class VerificaTriangulo {

    
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        introduz();
    }
     public static void imprimir(String msg) {
        // para imprimir mensagens na tela
         System.out.println(msg);
         
    }
      public static void verifica(float a,float b,float c) {
        // para verificar se e um triangulo
          if((a+b>c)&&(c+a>b)&&(b+c>a))
              imprimir("trata-se de um triangulo");
          else
              imprimir("nao gera um triangulo");
          
        
    }
      
       public static void introduz()throws IOException {
            // insercao dos valores
           BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
       float num1 = 0,num2 = 0,num3 = 0;
       do{
       try{
           
       imprimir("introduza o primeiro lado do triangulo");
       num1=Float.parseFloat(x.readLine());
        imprimir("introduza o segundo lado do triangulo");
       num2=Float.parseFloat(x.readLine());
        imprimir("introduza o terceiro lado do triangulo");
       num3=Float.parseFloat(x.readLine());
      if(num1<0 && num2<0 && num3<0 ){
            System.out.println("uma das entradas e invalida");
      }
       }catch(NumberFormatException b){
            System.out.print("formato invalido");
       }catch(IOException mm){
       System.out.print(mm.getMessage());
       }
    }while((num1<0) &&( num2<0 )&&( num3<0));
        verifica(num1,num2,num3);
       }
   
    
}
