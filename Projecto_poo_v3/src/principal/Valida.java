
package principal;

import java.io.*;

public class Valida implements Serializable{
    private BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
    
    public Valida(){
    }
    
    public void imprimir(String msg){
        System.out.println(msg);
    }

    
    public int validaInt(String msg, int a, int b){
        int valor=0;
        do{

          try{
            imprimir(msg);
          
            valor= Integer.parseInt(x.readLine());
            imprimir(String.valueOf(valor));
            }catch (NumberFormatException f){imprimir("ERRO!! Digite um número.");}
             catch (IOException k){imprimir(k.getMessage());}
            if(valor<a || valor>b)
                imprimir("ERRO! Introduza um valor entre "+a+" e "+b+"\n");
        }while(valor<a|| valor>b);

        return valor;
    }
    
    public float validaFloat(String msg, float a, float b){
        float valor=0;
        do{
          try{
            imprimir(msg);
            valor= Float.parseFloat(x.readLine());
            imprimir(String.valueOf(valor));
            }catch (NumberFormatException f){imprimir("ERRO!! Digite um número.");}
             catch(IOException k){imprimir(k.getMessage());}
            if(valor<a || valor>b)
                imprimir("ERRO! Introduza um valor entre "+a+" e "+b+"\n");
        }while(valor<a|| valor>b);
        return valor;
    }

    public short validaShort(String msg, short a, short b){
       short valor=0;
        do{
            try{
            imprimir(msg);
            valor= Short.parseShort(x.readLine());
            imprimir(String.valueOf(valor));
            }catch(NumberFormatException ex){
                imprimir("ERRO!! Digite um número.");}
             catch(IOException w){imprimir(w.getMessage());}
            if(valor<a || valor>b)
                imprimir("ERRO! Introduza um valor entre "+a+" e "+b+"\n");
        }while(valor<a|| valor>b);
        return valor;
    }

    public String validaData(String msg){
        int dia=0;
        int mes=1;
        int ano=19;
        String data="00/00/0000";
        do{
             try{
            imprimir(msg);
            data=x.readLine();
            dia=Integer.parseInt(data.substring(0,2));
            mes = Integer.parseInt(data.substring(3,5));
            ano=Integer.parseInt(data.substring(6,10));
            imprimir(String.valueOf(data));
            }catch(NumberFormatException ex){
                imprimir("ERRO!! Digite um número.");
            }catch(StringIndexOutOfBoundsException ex){
               imprimir("Data invalida!");
            }catch(IOException x){imprimir(x.getMessage());}
            if(dia<0||dia>32||mes<1||mes>12||ano<2020){
                imprimir("Data invalida!");
            }
        }while(dia<0||dia>32||mes<1||mes>12||ano<2020||data.length()!=10);
        return data;
    }

    public char validaChar (String msg){
        char result = 0;
        do{
            imprimir(msg);
            try{
                result= x.readLine().charAt(0);
                result = Character.toLowerCase(result);
            }catch(NumberFormatException nf){System.out.println(nf.getMessage());
            }catch(IOException f){imprimir(f.getMessage());}
            imprimir(result+"");
            if(result!='f' && result!='m')
                imprimir("Erro!, digite f ou m");
        }while(result!='f' && result!='m');
        return result;
    }

    public String validaString(String msg, int a, int b){
        String result = "";
        do{
            imprimir(msg);
            try{
            result= x.readLine();
            }catch(IOException f){imprimir(f.getMessage());}
            imprimir(result);
            if(result.length()<a || result.length()>b)
                imprimir("ERRO! Certifique-se que a quantidade de caracteres esta' entre "+a+" e "+b+"\n");
        }while(result.length()<a || result.length()>b);

        return result;
        
    }
        
}
