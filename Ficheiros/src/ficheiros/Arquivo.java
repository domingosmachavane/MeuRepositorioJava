package ficheiros;
/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
*/
import java.io.*;
public class Arquivo {
    public static String Read(String Caminho){
            String conteudo="";
            try{
                FileReader arq= new FileReader(Caminho);
                BufferedReader lerArq = new BufferedReader(arq);
                String linha="";
                try{
                    linha=lerArq.readLine();
                    while(linha!=null){
                        conteudo+=linha+"\r\n";
                        linha=lerArq.readLine();
                    
                    }
                    arq.close();
                
                
                }catch(IOException ex){
                    conteudo="Erro : nao foi possivel ler o aruivo!";
                }
            
            
            
            }catch(FileNotFoundException ex){
                    conteudo="Erro: Arquivo nao Encontrado";
            }
            if(conteudo.contains("Erro"))
                return "";
            else
                return conteudo;
    
    
    }
    public static boolean write(String Caminho,String texto){
        try{
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq= new PrintWriter(arq);
            gravarArq.println(texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    
    }
}
