package gerelivraria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Alineas {
    private float soma=0,media;

  LeituraFicheiro leitura = new LeituraFicheiro();
      
         float maior = 0;
    int posicao = 0;

    public  void AlineA() {
       int posicao = 0;
        float maior = 0;
        Vector<Livro> livros = new Vector<>();
        leitura.Read("Livros.txt", livros);
        for (int i = 0; i < livros.size(); i++) {
            if (livros.elementAt(i).getAnoPublicacao() <= 2015) {
                 JOptionPane.showMessageDialog(null," ======LIVRO " + (i + 1) + "=================="
                + "\nAutor : " + livros.get(i).getAutor()+"\nCodigo : " + livros.get(i).getCodigo()
                +"\nAno de Publicacao : " + livros.get(i).getAnoPublicacao()+"\nTitulo : " + livros.get(i).getTitulo() 
                 +"\nPreco : " + livros.get(i).getPreco());
               
            }
            if (maior < livros.get(i).getPreco()) {
                maior = livros.get(i).getPreco();
                posicao = i;

            }
        }
        JOptionPane.showMessageDialog(null,"O livro De Maior preco e : " + livros.get(posicao).getTitulo() + " Com O preco De : " + livros.get(posicao).getPreco());
        
    }

    public void ImpressaoDoVetor() {
        Vector<Livro> livrosOb = new Vector<>();
        leitura.Read("Livros.txt", livrosOb);
        for (int i = 0; i < livrosOb.size(); i++) {
        JOptionPane.showMessageDialog(null," ======LIVRO " + (i + 1) + "=================="
                + "\nAutor : " + livrosOb.get(i).getAutor()+"\nCodigo : " + livrosOb.get(i).getCodigo()
                +"\nAno de Publicacao : " + livrosOb.get(i).getAnoPublicacao()+"\nTitulo : " + livrosOb.get(i).getTitulo() 
                 +"\nPreco : " + livrosOb.get(i).getPreco());

        }
    }

    public void AlineaC() throws ClassNotFoundException {
        Vector<Livro> livrosOb = new Vector<>();
        LeituraFicheiro leitura = new LeituraFicheiro();
        livrosOb = leitura.lerDadosDoFichObj("livrosObejecto.txt");
       
        for (int i = 0; i < livrosOb.size(); i++) {
           
            System.out.println(" ======LIVRO " + (i + 1) + "=================="
                + "\nAutor : " + livrosOb.get(i).getAutor()+"\nCodigo : " + livrosOb.get(i).getCodigo()
                +"\nAno de Publicacao : " + livrosOb.get(i).getAnoPublicacao()+"\nTitulo : " + livrosOb.get(i).getTitulo() 
                 +"\nPreco : " + livrosOb.get(i).getPreco());

        }
        int ano_remover;
        Scanner scanner = new Scanner(System.in);
        ano_remover = Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano que deseja Remover "));
        //JOptionPane.showMessageDialog(null,"qual e Ano que pretende Remover? ");
       // ano_remover = scanner.nextInt();
        for (int i = 0; i < livrosOb.size(); i++) {
            if (livrosOb.get(i).getAnoPublicacao() == ano_remover) {
                livrosOb.remove(livrosOb.get(i));
                //livros.remove(i);
            }
        }
        leitura.gravarFichObj("livrosObejecto.txt", livrosOb);

        livrosOb = leitura.lerDadosDoFichObj("livrosObejecto.txt");
        
        for (int i = 0; i < livrosOb.size(); i++) {
            JOptionPane.showMessageDialog(null," ======LIVRO " + (i + 1) + "=================="
                + "\nAutor : " + livrosOb.get(i).getAutor()+"\nCodigo : " + livrosOb.get(i).getCodigo()
                +"\nAno de Publicacao : " + livrosOb.get(i).getAnoPublicacao()+"\nTitulo : " + livrosOb.get(i).getTitulo() 
                 +"\nPreco : " + livrosOb.get(i).getPreco());

        }
    }
    public void AlineaB(){
        Livro book = new Livro();
        Vector<Livro> livrosOb = new Vector<>();
        leitura.Read("Livros.txt", livrosOb);
        for(int i=0;i<livrosOb.size();i++){
            this.soma += livrosOb.get(i).getPreco();
            
                
        }
       this.media = Math.round(soma/livrosOb.size());
       JOptionPane.showMessageDialog(null,"A   Media dos Salarios  e : "+ this.media);
        
    }
}
