
package estruturadedadospilha;

public class EstruturaDeDadosPilha {

    public static void main(String[] args) {
        Pilha p1 = new Pilha(3);
        p1.empilhar("Pilha1");
        p1.empilhar("Pilha2");
        p1.empilhar("Pilha3");
       //Object d = p1.verTopo();
        System.out.println("Topo: "+p1.verTopo());
       while(!p1.estaVazia()){
           Object dado;
           dado= p1.desempilhar();
           System.out.println("["+dado+"]");
       }
       
    }
    
}
