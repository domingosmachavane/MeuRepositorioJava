
package conversordebases;

import java.io.*;

public class ConversorDeBases {
  

    public static void main(String[] args)throws IOException {
        BufferedReader v=new BufferedReader(new InputStreamReader(System.in));
        int x,y;
        System.out.println("INTRODUZA O VALOR QUE DESEJA CONVERTER ");  
                x=Integer.parseInt(v.readLine());
                System.out.println("1.binario\n 2.decimal \n 3.hexadecimal \n 4.octal");
                System.out.println("PARA QUE BASE DESEJA CONVERTER "); 
                y=Integer.parseInt(v.readLine());
                switch(y){
                    case 1:binario(x);break;
                    case 2:decimal(x);break;
                    case 3:hexadecimal(x);break;
                    case 4:octal(x);break;
                
                
                }
    }
    
    protected static void binario(int p){
       
        
            
            
         
    
    }
    
     protected static void decimal(int p){
         String j="";
    
    }
      protected static void hexadecimal(int p){
         String b="";
    
    }
       protected static void octal(int p){
         String k="";
    
    }
    
}
