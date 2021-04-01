
package revisa;
import java.io.*;
public class Calcula {
     private int q;
     public  Calcula() throws IOException { 
         q = validQuant(); }
     private int validQuant() throws IOException {
         BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
         do { System.out.println("Quantos sao trabalhadores ? ");
         q = Integer.parseInt(a.readLine());
         if( q <= 0) System.out.println("Valor invalido! Tente de novo"); 
         } while (q <= 0); 
         return q; }
     //Devolve a quantidade
     public int getQuant()  { return q; }
     public float Calculamedia()throws IOException{
         float soma=0;
         for(int i=0;i<q;i++){
          System.out.println("Dados do "+i+"-o trabalhador:"); 
          Trabalhador trab = new Trabalhador();
          System.out.println(trab);//chamar o metodo to string da classe trabalhador
         soma += trab.getIdade();
         }
         return Math.round(soma/q);
     } 
}
