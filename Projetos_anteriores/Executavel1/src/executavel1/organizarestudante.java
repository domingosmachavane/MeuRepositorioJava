
package executavel1;

import java.io.*;

public class organizarestudante {
    //atributos
    private BufferedReader br;
 private estudante est[]=new estudante[5];
    private byte numestudante=0,cont=0;
    //constructor
    public organizarestudante()throws IOException, Exception{
        br=new BufferedReader(new InputStreamReader(System.in));
        byte p=0;
        do{
            try{
            
                    System.out.println("=======================================================\n 1.introduzir estudantes \n 2. ordenar as notas \n 3.Mostrar o estudante com a nota mais alta\n 4.sair do programa");
            p=Byte.parseByte(br.readLine());
            }catch(NumberFormatException b){
                System.out.println(" o numero introduzido nao e introduzido");
            }
            System.out.println("================================================================");
        switch(p){
            case 1:insercao();break;
            case 2:ordenacao();break;
            case 3:NotamaisAlta();break;
            case 4: System.exit(0);
            default: System.out.println(" a opcao introduzida e invalida");break;
        }
        }while(p!=0);
    }
    public  void insercao()throws IOException, Exception{
         System.out.println("Informe o numero de pessoas");
        numestudante = Byte.parseByte(br.readLine());
        for(byte c=0;c<numestudante;c++){
             estudante bv;
             bv=new estudante();
           System.out.println("insira o nome do estudante");
           bv.setNome(br.readLine());
        System.out.println("insira o curso do estudante");
           bv.setCurso(br.readLine());
            System.out.println("insira a nota de admisao");
            bv.setNotadmi(Float.parseFloat(br.readLine()));
            System.out.println("insira o numero de estudante");
            bv.setNumest(Integer.parseInt(br.readLine()));
             est[c]=bv;
             cont++;
        }
    
    }
    public void ordenacao()throws IOException , Exception{
        
     
      
        for (int i = 0; i < numestudante; i++) {
            for (int j = 0; j < numestudante; j++) {
                estudante aux1 = est[i];
                estudante aux2 = est[j];
                if(aux2.getNotadmi()>aux1.getNotadmi()){
                    estudante temp = aux2;
                    est[j] = aux1;
                    est[i] = temp;
                }
            }
            
        }
        System.out.println("Estudantes Ordenados com sucesso");
    }
    
    public void NotamaisAlta(){
        
    
        for (int i = 0; i < numestudante; i++) {
            for (int j = 0; j < numestudante; j++) {
                estudante aux1 = est[i];
                estudante aux2 = est[j];
                if(aux2.getNotadmi()>aux1.getNotadmi()){
                    estudante temp = aux2;
                    est[j] = aux1;
                    est[i] = temp;
                }
            }
            
        }
        System.out.println(" estudante com a maior nota e "+est[numestudante-1].toString());
    }
    
}
