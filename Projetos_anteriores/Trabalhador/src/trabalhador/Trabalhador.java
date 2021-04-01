/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
package trabalhador;

/**
 *
 * @author Elton Matsimbe
 */
public class Trabalhador {
    // atributos
    private final short codigo;
    private short idade;
    
   // Construtor. recebe valores iniciais dos atributos (codigo e idade)
    public Trabalhador () throws IOException 
    { System.out.println("Introduza o codigo(1111-9999): ");
        codigo = validarShort((short)1111, (short)9999);
       System.out.println("Idade (18-65): ");
       idade = validarShort((short)18,(short)65);
    }
    
    //metodo de validacao
    private short validarShort (short cod ,short id )throws IOException {
     short c; 
     BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
      
      do
      { c = Short.parseShort(kb.readLine());
        if (c < cod || c > id)
            System.out.println("Valor Invalido! Tente de novo");
      
      } while(c < cod || c > id);
      return c;
    }
    
    public short getIdade() { return idade; //devolve o valor da idade
    // devolve uma linha de informacao do trabalhador.
     public String toString() {
     return "Codigo\tIdade\n"+codigo+"\t"+idade;
     }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
