
package herancalivro;

public class Livro {
    private int paginas;
    public static int cont=0;
    public Livro(int paginas){
        this.paginas = paginas;
        cont++;
    
    }
    public void setPaginas(int p){
            this.paginas = p;
    }
    public int getPaginas(){
        return this.paginas;
    }
    public void descreve(){
        imprimir("****************LIVRO**************");
            imprimir("Livro com " +this.getPaginas()+ " paginas");
    }
    public static void imprimir(String msg){
        System.out.println(msg);
    }
}
