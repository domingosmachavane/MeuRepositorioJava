
package preparacaoexame1;
import java.io.*;
public class Tarefas {
    public int quant;
    Estudante estudante[] ;        
    BufferedReader ler;
    public Tarefas(int quant){
                this.quant = quant;
           }
    public void inserirAlunos(){
      estudante  = new Estudante[this.quant];
      String nome;
      int idade;
      float nota1 , nota2;
                ler = new BufferedReader(new InputStreamReader(System.in));
                for(int i =0 ;i < estudante.length ; i++){
                 try{
                System.out.printf("Informe o Nome do %d Estudante ",(i+1));
                nome = ler.readLine();
                 System.out.printf("Informe a idade do %d Estudante ",(i+1));
                idade = Integer.parseInt(ler.readLine());
                 System.out.printf("Informe a nota1 do  Estudante  %d ",(i+1));
                nota1 = Float.parseFloat(ler.readLine());
                 System.out.printf("Informe a nota2 Estudante %d ",(i+1));
                nota2 = Float.parseFloat(ler.readLine());
                estudante[i] = new Estudante ( nome , idade , nota1 , nota2 );
                
                 
                 }catch(IOException erro ){
                            System.out.println("Ola Tivemos Problemas na Leitura de dados " + erro);
                 }
                
                
                
                }
    }
    public void VisualizarEstudantes(){
        for (int i = 0; i < estudante.length ; i++){
              System.out.println( estudante[i].toString() +" ");
        }
                    
    }
    public void gravarFicheiroTxt(String nomeFicheiro){
            String str = " ";
            String umaLinha = " ";
            
            try{
                FileWriter escrever_1 = new FileWriter(nomeFicheiro);
                BufferedWriter escrever_2 = new BufferedWriter(escrever_1);
               
            
            }catch(IOException erro){
                System.out.println("Ocorreu algum erro " + erro);
            }
    }
}
