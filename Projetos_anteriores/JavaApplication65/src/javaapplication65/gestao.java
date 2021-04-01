
package javaapplication65;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class gestao {
    Pessoa pessoas[] = new Pessoa[30];
    Pessoa masculino[] = new Pessoa[30];
    Pessoa feminino[] = new Pessoa[30];
    BufferedReader br;
    byte numeroDePessoas = 0,indexF = 0, indexM = 0;
    
    public gestao() throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        byte i = 0;
        do{
            System.out.println("1 - Inserir pessoa \n"
                    + "2 - Odenar Pessoas Por altura \n"
                    + "3 - Mais alto Masculino \n"
                    + "4 - Mais alto Femenino \n"
                    + "5 - Gravar txt \n");
            i = Byte.parseByte(br.readLine());
            
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
            }
        }while (i!=0);
        
    }
    
    public void criarPessoa() throws IOException{
        numeroDePessoas =0;
        System.out.println("Informe o numero de pessoas");
        numeroDePessoas = Byte.parseByte(br.readLine());
        
        for (int i = 0; i < numeroDePessoas; i++) {
            Pessoa pessoa = new Pessoa();
            
            System.out.println("Informe o sexo");
            pessoa.setSexo(br.readLine().charAt(0));
            
            
            System.out.println("Informe o nome");
            pessoa.setNome(br.readLine());
            
            System.out.println("Informe a altura");
            pessoa.setAltura(Float.parseFloat(br.readLine()));
            
            pessoas[i] = pessoa;
            if(pessoa.getSexo() == 'F' || pessoa.getSexo() == 'f'){
                feminino[indexF] =  pessoa; indexF++;
            }else{
                masculino[indexM] =  pessoa; indexM++;
            }
        }
    }
    
    public void organizarPessoas() throws IOException{
      
        for (int i = 0; i < numeroDePessoas; i++) {
            for (int j = 0; j < numeroDePessoas; j++) {
                Pessoa aux1 = pessoas[i];
                Pessoa aux2 = pessoas[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    Pessoa temp = aux2;
                    pessoas[j] = aux1;
                    pessoas[i] = temp;
                }
            }
            
        }
    }
    public void maisAltaFeminino() throws IOException{
      
        for (int i = 0; i < indexF; i++) {
            for (int j = 0; j < indexF; j++) {
                Pessoa aux1 = feminino[i];
                Pessoa aux2 = feminino[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    Pessoa temp = aux2;
                    feminino[j] = aux1;
                    feminino[i] = temp;
                }
            }
            
        }
        System.out.println("Mais alto sexo feminino : \n"+ feminino[indexF - 1].toString());
    }
    public void maisAltaMasculino() throws IOException{
      
        for (int i = 0; i < indexM; i++) {
            for (int j = 0; j < indexM; j++) {
                Pessoa aux1 = masculino[i];
                Pessoa aux2 = masculino[j];
                if(aux2.getAltura()>aux1.getAltura()){
                    Pessoa temp = aux2;
                    masculino[j] = aux1;
                    masculino[i] = temp;
                }
            }
            
        }
        System.out.println("Mais alto sexo Masculino : \n"+ masculino[indexM - 1].toString());
    }
   
    
    public void imprimirPessoas() throws IOException{
        String auxInfo ="";
        for (int i = 0; i < numeroDePessoas; i++) {
           Pessoa aux1 = pessoas[i];
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
            Pessoa aux1 = pessoas[i];
            bw.write(aux1.toString());
            bw.newLine();
        }
        maisAltaFeminino();
        bw.write("Mais Alto Feminino");bw.newLine();
        bw.write(feminino[indexF - 1].toString());
        bw.newLine();
         
        maisAltaMasculino();
        bw.write("Mais Alto Masculino");bw.newLine();
        bw.write(masculino[indexM - 1].toString());bw.newLine();
        
       // bw.close();
        System.out.println("Ficheiro gravado");bw.newLine();
        bw.close();
        fr.close();
    }
}
