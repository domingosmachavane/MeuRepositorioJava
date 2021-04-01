
package gerirrevistas;
import java.util.StringTokenizer;
import java.io.*;
public class ArrayRevista {
    //atributos
    private Revista lista[];
    private int cont;
    public ArrayRevista(){
        lista=new Revista[12];
        cont=0;
    }
    public void LerfichCriarArray() throws IOException{
        StringTokenizer umaCadeia;
        String umaLinha="",non,nomFich="C:/Users/Domingos Machavane/Documents/NetBeansProjects/GerirRevist as/src/gerirrevistas/revista.txt";
        int qtd;
        float preco;
        try{
            FileReader fr=new FileReader(nomFich);
            BufferedReader fichIn= new BufferedReader(fr);
            umaLinha=fichIn.readLine();
            while(umaLinha!=null){
                umaCadeia=new StringTokenizer(umaLinha+";");
                non=umaCadeia.nextToken();
                qtd=Integer.parseInt(umaCadeia.nextToken());
                preco=Float.parseFloat(umaCadeia.nextToken());
                lista[cont]=new Revista(non,qtd,preco);
                cont++;
                umaLinha=fichIn.readLine();
            }
            fichIn.close();
        }catch(FileNotFoundException fn){
            System.out.println("Ficheiro nao encontrado");
        }catch(NumberFormatException mm){
            System.out.println(mm.getMessage());
        }
    }
    public float CalcTotal(){
    float soma=0;
        for(int j=0;j<cont;j++)
            soma+=lista[j].getTotal();
            return soma;
        
    }
    public String toString(){
        String x="";
                for(int a=0;a<cont;a++)
                    x+=lista[a]+"\n";
                return x;
    }
    public void gravarFicheiro(String nf){
        try{
            FileWriter fw=new FileWriter(nf);
            BufferedWriter fichOut=new BufferedWriter(fw);
           for(int k=0;k<cont;k++){
               fichOut.write(lista[k].getNome()+";"+lista[k].getTotal());
               fichOut.newLine();
           } 
        fichOut.close();
        }catch(IOException xx){
            System.out.println(xx.getMessage());
        }
    }
    
}
