/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
package trabalhadorcriar;

/**
 *
 * @author Elton Matsimbe
 */
public class TrabalhadorCriar {
    private int q;
    
    public TrabalhadorCriar() throws IOException  
    {
      q = validarInt();  
        
    }
    
    // validar quantidade de Trabalhadores
    private int validarInt() throws IOException 
    {   
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        
        do
        {
            System.out.println("Introduza o nr de Trabalhadores: ");
            q = Integer.parseInt(kb.readLine());
            if(q <=0)
                System.out.println("Valor Invalido! Tente novamente. ");
            
        }while(q<=0);
        return q;
    }   
        //Devolve a quantidade
        public  getQuant () 
        { return q;}
        
        public float calcMedia () throws IOException
        {   float soma = 0;
            for(int i =1; i<=q; i++){
            System.out.println("Dados do "+i+"- o trabalhador:");
            Trabalhador trab = new Trabalhador();
            System.out.println(trab); //chamada do metodo toString()
            soma += trab.getIdade();
            } return Math.round(soma/q);
        }
}
            //*************************************************
            
        
              
              
            
        
        
        
    
    
    /**
     * @param args the command line arguments
     */
import java.io.*;
public class Executavel {
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
      TrabalhadorCriar t = new TrabalhadorCriar();
      System.out.println("idade media dos "+ t.getQuant()+" trabalhadores "+t.calcMedia());
    }
    
    
}
