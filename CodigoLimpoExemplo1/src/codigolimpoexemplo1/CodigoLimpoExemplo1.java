
package codigolimpoexemplo1;
import java.io.*;
public class CodigoLimpoExemplo1 {

    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int  verificapar = 2;
        int contapares  = 0, intervaloDesejado = 0;
        try{
            System.out.println("Informe de 0 ate que numero deseja ver os pares :");
            intervaloDesejado = Integer.parseInt(read.readLine());
        }catch(NumberFormatException number){
                        System.out.println("Insira um Inteiro Por favor " + number.getMessage());
        }catch(IOException input){
              System.out.println("Problema na leitura " + input.getMessage());      
        }
        
        for(int contador = 0; contador< intervaloDesejado;contador++){
            if(contador % verificapar == 0){
                        imprimirMensagem(contador);
                        System.out.print(contador+" , ");
                        contapares++;
            }
        
        }
        System.out.println();
       
    }
    public static void imprimirMensagem(int contador){
            if(contador != 0){
                
            }else{
                    System.out.println("Numeros Pares de 0 ate  ....."); 
            }
    }
    
}
