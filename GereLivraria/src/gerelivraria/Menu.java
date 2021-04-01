
package gerelivraria;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    public void Menu() throws ClassNotFoundException{
      
            Scanner input = new Scanner(System.in);
            int opcao=5;
            String continua;
            /*Messagem="\t1.Ler dados de  Ficheiro normal guardar no vetor e posteriomente gravar num ficheiro de Objectos: "
                        + "",Messagem2="\t2.Visualizar os livros publicados até o ano de 2015 e o livro de maior preço \t\t: "
                        + " ",Messagem3="\t3.Calcular a média dos preços dos livros da livraria\t\t\t : "
                        ,Messagem4="\t4.Remover um livro pelo ano de publicação\t\t\t\t : "
                        ,Messagem5=
            System.out.println(Messagem.length());
                        */
            Alineas ali = new Alineas();
           
           
          
        
          
         do{
  opcao = Integer.parseInt(JOptionPane.showInputDialog ("*********************************************************************Menu**********************************************"
                         + "\n\t1.Ler dados de  Ficheiro normal guardar no vetor e posteriomente gravar num ficheiro de Objectos: "+
                         "\n\n\t2.Visualizar os livros publicados até o ano de 2015 e o livro de maior preço \t\t:"+
                         "\n\n\t3.Calcular a média dos preços dos livros da livraria\t\t\t :"+
                         ""
                         + "\n\n\t4.Remover um livro pelo ano de publicação\t\t\t\t :\n\n" +
                         "\n\t5.Sair do programa\t\t\t\t\t" ));
                         
            
            
            
            
            
            
            
            
            
         
         
             try{
             
             
             switch(opcao){
                 case 1:ali.ImpressaoDoVetor();break;
                 case 2:ali.AlineA();break;
                 case 3:ali.AlineaB();break;
                 case 4:ali.AlineaC();break;
                 case 5: System.exit(0);break;
                 default: JOptionPane.showMessageDialog(null, "Valor Invalido");break;
             
             
             }
              }catch(Exception msg){
                    JOptionPane.showMessageDialog(null,"Valor Invalido");
                   // System.exit(0);
             }
             System.out.println();
             continua = (JOptionPane.showInputDialog("Deseja continuar?[S/N]"));
            
             
             
         }while(continua.equalsIgnoreCase("S") || continua.equalsIgnoreCase("sim"));
         
    }
}
