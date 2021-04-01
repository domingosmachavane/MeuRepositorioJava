
package resumindo;
import java.io.*;
public class Prato {
private String nome;
private int idade;
//Constructor
 public Prato(String nome,int idade)throws IOException{
     this.nome=nome;
     this.idade=idade;
 }
 public String getNome(){
 return nome;
 }
 public void setNome(String nome){
 this.nome=nome;
 }
  public int getidade(){
 return idade;
 }
 public void setidade(int idade){
 this.idade=idade;
 }
 public void ImprimeDados(int t,int k){
      for(int i=0;i<t;i++){
      for(int j=0;j<k;j++){
        System.out.print("Nome:"+this.nome+"Idade:"+this.idade+"\t");
         }
          System.out.println("");
      }
 }
    
    
  
}
