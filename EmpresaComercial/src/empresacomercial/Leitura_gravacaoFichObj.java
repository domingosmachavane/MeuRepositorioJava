/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresacomercial;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Leitura_gravacaoFichObj {
    //private String ca;

    public void gravarFichObjVendedor(String nomeficheirodeobj, Vector<Vendedor> lista) {
        try {
            FileOutputStream ff = new FileOutputStream(nomeficheirodeobj);
            ObjectOutputStream ss = new ObjectOutputStream(ff);
            ss.writeObject(lista);
            ss.close();
        } catch (IOException xx) {
            System.out.println(xx);

        }
    }
    
    /*
     public Object ler(File file) {
ObjectInputStream oos = null;
try {
// cria o FileInputStream
FileInputStream fos = new FileInputStream(file);
// cria o ObjectInputStream
oos = new ObjectInputStream(fos);
// lê do arquivo
Object o = oos.readObject();
return o;
} finally {
// fecha
if (oos != null) {
			oos.close();
		}
}
return null;
}
    */

    public Vector<Vendedor>  lerDadosDoFichObjVendedor(String nomeFobj )  {
        
        Vector<Vendedor> livros = new Vector <> ();
        try {
            FileInputStream ii = new FileInputStream(nomeFobj);
            ObjectInputStream tt = new ObjectInputStream(ii);
            livros =   (Vector<Vendedor>) tt.readObject();
            tt.close();
        } catch (FileNotFoundException ff) {
            JOptionPane.showMessageDialog(null,"Ficheiro de obj " + nomeFobj + " nao encontrado!" );
        } catch (IOException pp) {
            JOptionPane.showMessageDialog(null,"Problemas no leitura do ficheiro!"+ pp.getMessage() );
        }catch(ClassNotFoundException cnfe){
                               System.out.println("Verifique a existencia da classe Revista!!!");
        }
        return livros;
    }
    public void gravarFichObjAdmistrativa(String nomeficheirodeobj, Vector<PartAdministrativa> lista) {
        try {
            FileOutputStream ff = new FileOutputStream(nomeficheirodeobj);
            ObjectOutputStream ss = new ObjectOutputStream(ff);
            ss.writeObject(lista);
            ss.close();
        } catch (IOException xx) {
            System.out.println(xx);

        }
    }

    public Vector<PartAdministrativa>  lerDadosDoFichObjAdm(String nomeFobj ) throws ClassNotFoundException, IOException {
        
         Vector<PartAdministrativa> admin = new Vector<>();
        try {
            FileInputStream ii = new FileInputStream(nomeFobj);
            ObjectInputStream tt = new ObjectInputStream(ii);
            admin =  (Vector<PartAdministrativa>) tt.readObject();
            tt.close();
        } catch (FileNotFoundException ff) {
            JOptionPane.showMessageDialog(null,"Ficheiro de obj " + nomeFobj + " nao encontrado!" );
        }catch (IOException pp) {
            JOptionPane.showMessageDialog(null,"Problemas no leitura do ficheiro!" );
        }
        return admin;
    }

   /* public Vector<Vendedor> Read(String caminho, Vector<Vendedor> livros) {

        StringTokenizer str;
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                   Vendedor li = new Vendedor();
                    /*this.codigo=cod;
                     this.numoroPaginas=numP;
                     this.anoPublicacao=anoP;
                     this.titulo=tit;
                     this.autor=aut;
                     this.preco=prec;*/
                    /*str = new StringTokenizer(linha, ";");
                    li.setCodigo(Integer.parseInt(str.nextToken()));
                    li.setNumoroPaginas(Integer.parseInt(str.nextToken()));
                    li.setAnoPublicacao(Integer.parseInt(str.nextToken()));
                    li.setTitulo(str.nextToken());
                    li.setAutor(str.nextToken());
                    li.setPreco(Float.parseFloat(str.nextToken()));
                    livros.add(li);

                    linha = lerArq.readLine();
                }
                arq.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Ficheiros Nao Encontrados");
        }
      
            return livros;
        
    }*/

  

}
