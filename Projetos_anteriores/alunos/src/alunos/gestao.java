
package alunos;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class gestao {
    //atributos
    
  private  pessoa pessoas[] = new pessoa[30];
  private  pessoa masculino[] = new pessoa[30];
  private  pessoa feminino[] = new pessoa[30];
  private BufferedReader br;
  private byte numeroDePessoas = 0,contF = 0, contM = 0;
    
    //constructor
     public gestao() throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        byte i = 0;
        do{
            try{
            System.out.println("1 - Inserir pessoa \n"
                    + "2 - Odenar Pessoas Por altura \n"
                    + "3 - Mais alto Masculino \n"
                    + "4 - Mais alto Femenino \n"
                    + "5 - Gravar txt \n"
                    +"6.sair do programa\n");
            i = Byte.parseByte(br.readLine());
            }catch(NumberFormatException b){
                System.out.println("o valor inserido nao e inteiro"); 
            }            
            System.out.println("******************************************************");
            switch (i){
                case 1:
                    criarPessoa();
                break;
                case 2:
                    organizarPessoas(); imprimirPessoas();
                break;
                case 3:
                    maisAltaMasculino();
                break;
                case 4:
                    maisAltaFeminino();
                break;
                case 5:
                    gravartxt("txt.txt");
                break;
                      case 6:
                  System.exit(0);
                break;
            }
        }while (i!=0);
        
    }
       public void criarPessoa() throws IOException{
        
        System.out.println("Informe o numero de pessoas");
        numeroDePessoas = Byte.parseByte(br.readLine());
        
        for (int i = 0; i < numeroDePessoas; i++) {
            pessoa pessoa = new pessoa();
            
            System.out.println("Informe o sexo");
            pessoa.setSexo(br.readLine().charAt(0));
            
            
            System.out.println("Informe o nome");
            pessoa.setNome(br.readLine());
            
            System.out.println("Informe a altura");
            pessoa.setAltura(Float.parseFloat(br.readLine()));
            
            pessoas[i] = pessoa;
            if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
                feminino[contF] =  pessoa; contF++;
            }else{
                masculino[contM] =  pessoa; contM++;
            }
        }
    }
    
    public void organizarPessoas() throws IOException{
      
        for (int i = 0; i < numeroDePessoas; i++) {
            for (int j = 0; j < numeroDePessoas; j++) {
                pessoa aux1 = pessoas[i];
                pessoa aux2 = pessoas[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    pessoa temp = aux2;
                    pessoas[j] = aux1;
                    pessoas[i] = temp;
                }
            }
            
        }
    }
    public void maisAltaFeminino() throws IOException{
      
        for (int i = 0; i < contF; i++) {
            for (int j = 0; j < contF; j++) {
                pessoa aux1 = feminino[i];
                pessoa aux2 = feminino[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    pessoa temp = aux2;
                    feminino[j] = aux1;
                    feminino[i] = temp;
                }
            }
            
        }
        System.out.println("Mais alto sexo feminino : \n"+ feminino[contF - 1].toString());
    }
    public void maisAltaMasculino() throws IOException{
      
        for (int i = 0; i < contM; i++) {
            for (int j = 0; j < contM; j++) {
                pessoa aux1 = masculino[i];
                pessoa aux2 = masculino[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    pessoa temp = aux2;
                    masculino[j] = aux1;
                    masculino[i] = temp;
                }
            }
            
        }
        System.out.println("Mais alto sexo Masculino : \n"+ masculino[contM - 1].toString());
    }
   
    
    public void imprimirPessoas() throws IOException{
        String auxInfo ="";
        for (int i = 0; i < numeroDePessoas; i++) {
           pessoa aux1 = pessoas[i];
           auxInfo+= aux1.toString() + "\n";
        }
        System.out.println(auxInfo);
    }
    
    public void gravartxt(String nomef) throws IOException{
        FileWriter fr = new FileWriter(nomef);
        BufferedWriter bw = new BufferedWriter(fr);
        
        organizarPessoas();
        bw.newLine();
        bw.write("Todas pessoas Organizado em ordem crescente das alturas");
        bw.newLine();
        for (int i = 0; i < numeroDePessoas; i++) {
            pessoa aux1 = pessoas[i];
            bw.write(aux1.toString());
            bw.newLine();
        }
        maisAltaFeminino();
        bw.write("Mais Alto Feminino");bw.newLine();
        bw.write(feminino[contF - 1].toString());
        bw.newLine();
         
        maisAltaMasculino();
        bw.write("Mais Alto Masculino");bw.newLine();
        bw.write(masculino[contM - 1].toString());bw.newLine();
        
       // bw.close();
        System.out.println("Ficheiro gravado");bw.newLine();
        bw.close();
        fr.close();
    }
    
}
