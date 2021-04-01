
package gerelivraria;

import java.io.Serializable;



public class Livro implements Serializable {
    LeituraFicheiro c[]; 
 
    private int codigo, numoroPaginas,anoPublicacao;
    private String titulo,autor;
    private float preco;
    public Livro(int cod ,int numP,int anoP,String tit,String aut,float prec){
            this.codigo=cod;
            this.numoroPaginas=numP;
            this.anoPublicacao=anoP;
            this.titulo=tit;
            this.autor=aut;
            this.preco=prec;
    }
    public Livro(){
        
           for(int i =0 ; i < 4;i++){
                
          }
           
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumoroPaginas() {
        return numoroPaginas;
    }

    public void setNumoroPaginas(int numoroPaginas) {
        this.numoroPaginas = numoroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
}
