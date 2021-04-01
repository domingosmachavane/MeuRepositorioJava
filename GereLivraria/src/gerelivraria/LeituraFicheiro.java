package gerelivraria;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

public class LeituraFicheiro {
    //private String ca;

    public void gravarFichObj(String nomeficheirodeobj, Vector<Livro> lista) {
        try {
            FileOutputStream ff = new FileOutputStream(nomeficheirodeobj);
            ObjectOutputStream ss = new ObjectOutputStream(ff);
            ss.writeObject(lista);
            ss.close();
        } catch (IOException xx) {
            System.out.println(xx);

        }
    }

    public Vector<Livro>  lerDadosDoFichObj(String nomeFobj) throws ClassNotFoundException {
        
        Vector<Livro> livros = new Vector();
        try {
            FileInputStream ii = new FileInputStream(nomeFobj);
            ObjectInputStream tt = new ObjectInputStream(ii);
            livros =  (Vector<Livro>) tt.readObject();
            tt.close();
        } catch (FileNotFoundException ff) {
            JOptionPane.showMessageDialog(null,"Ficheiro de obj " + nomeFobj + " nao encontrado!" );
        } catch (IOException pp) {
            JOptionPane.showMessageDialog(null,"Problemas no leitura do ficheiro!" );
        }
        return livros;
    }

    public Vector<Livro> Read(String caminho, Vector<Livro> livros) {

        StringTokenizer str;
        String conteudo = "";
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    Livro li = new Livro();
                    /*this.codigo=cod;
                     this.numoroPaginas=numP;
                     this.anoPublicacao=anoP;
                     this.titulo=tit;
                     this.autor=aut;
                     this.preco=prec;*/
                    str = new StringTokenizer(linha, ";");
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
        
    }

}
