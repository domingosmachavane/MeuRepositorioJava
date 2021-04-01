
package herancalivro;
import java.util.Random;
public class HerancaLivro {

    public static void main(String[] args) {
        Livro li[]= new Livro[5];
            li[0]= new Livro(500);
            li[1] = new Dicionario(500,90);
            //li[2].descreve();
        for(int i=0;i<2;i++ ){
            li[i].descreve();
            
        }
        Livro.imprimir(" O numero De Objectos Criados ate Agora e : "+Livro.cont);
    }
   
    
}
