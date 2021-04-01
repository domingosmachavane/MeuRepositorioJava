
package estruturadedadosfilas;
import java.util.Scanner;
public class EstruturaDeDadosFilas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho : ");
        int tamanho =  scanner.nextInt();
         Fila fila = new Fila(tamanho);
         fila.verFila();
         fila.enfileirar("1.joao");
         fila.enfileirar("2.Stela");
         fila.enfileirar("3.Flavia");
         fila.enfileirar("4.Lina");
         fila.enfileirar("5.albertina");
         fila.enfileirar("6.Aida");
         //fila.enfileirar("7.Orildo");
         //fila.enfileirar("8.Basilia");
         fila.verFila();

         while(!fila.estaVazia())
         { 
             Object dado = fila.desenfileirar();
             System.out.println("Elemento retirado  "+ dado);
         }
         Object dado = fila.desenfileirar();
    }
    
}
