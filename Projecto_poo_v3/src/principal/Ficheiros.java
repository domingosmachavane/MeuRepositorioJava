package principal;
import java.io.*;
import java.util.Vector;
import java.util.StringTokenizer;
public class Ficheiros {
    //Construtor
    public Ficheiros(){
    }
    
    //Metodo para Gravar no ficheio de objecto
    public void gravarObj(Vector x, String nomeFichObj){
        try{
            FileOutputStream fos = new FileOutputStream(nomeFichObj);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(x);
            oos.close();
        }catch(IOException io){System.out.println(io.getMessage());}
    }
    
    /*METODO PARA LER DADOS DO FICHEIRO DE OBJECTOS,
      O TIPO DE RETORNO SERA UM VECTOR JA PREENCHIDO
      COM A INFORMACAO PREVIAMENTE GRAVADA*/
    public Vector lerObj(String nomeFichObj){
        Vector x = new Vector();
        try{
            FileInputStream fin = new FileInputStream(nomeFichObj);
            ObjectInputStream oin = new ObjectInputStream(fin);
            x = (Vector)oin.readObject();
            oin.close();
        }catch(FileNotFoundException fnf){System.out.println("Ficheiros de Objectos nao encontrado: "+fnf.toString());
        }catch(ClassNotFoundException cnf){System.out.println("Classe nao encontrada! "+cnf.getException());
        }catch(IOException io){System.out.println(io.getMessage());}
        return x;
    }
    
    //PARA LER TXT
    public void lerTxt(Vector v, String nomeF){
        StringTokenizer umaCadeia;
        String umaLinha = "", nome1, data;
        int id1, sala;
        Consulta consulta;
        try{
            BufferedReader br = new BufferedReader(new FileReader(nomeF));
            umaLinha = br.readLine();
            while(umaLinha != null){
                umaCadeia = new StringTokenizer(umaLinha,";");
                id1 = Integer.parseInt(umaCadeia.nextToken());
                nome1 = umaCadeia.nextToken();
                sala = Integer.parseInt(umaCadeia.nextToken());
                data = umaCadeia.nextToken();
                consulta = new Consulta(id1, nome1, sala, data);
                v.addElement(consulta);
                v.trimToSize();
                umaLinha = br.readLine();
            }
            br.close();
        }catch(FileNotFoundException fn){System.out.println("Ficheiro Nao Encontrado!");
        }catch(NumberFormatException nf){System.out.println("NAO EH UM NUMERO!");
        }catch(IOException ex){System.out.println(ex.getMessage());}
    }
    
    /*METODO PARA GRAVAR TXT*/
    public void gravarTxt(Vector v, String nomeF){
        Consulta consulta;
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(nomeF));
            for(int i = 0; i < v.size(); i++){
                consulta = (Consulta)v.elementAt(i);
                bw.write(consulta.getIdPa()+";"+consulta.getNomePa()+";"+consulta.getSala()+";"+consulta.getData());
                bw.newLine();
            }
            bw.close();
        }catch(IOException io){System.out.println(io.getMessage());}
    }
}
