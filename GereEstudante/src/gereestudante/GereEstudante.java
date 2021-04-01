
package gereestudante;

/**
 *
 * @author Domingos Machavane
 */
public class GereEstudante {

    public static void main(String[] args) {
             TurmaVector est = new TurmaVector();
             Validacoes v = new Validacoes();
             byte opcao;
             do {
                    System.out.println("\tEscolha uma das opcoes:\n" );
                    System.out.println("\t1. Adicionar estudante");
                    System.out.println("\t2. Ordenar estudantes pela media");
                    System.out.println("\t3. Visualizar Lista de estudantes");
                    System.out.println("\t4. Terminar\n");
                    opcao = v.validarByte("Escolha opcao",(byte)1,(byte)4);
                    switch (opcao) {
                    case 1: est.adicEstudante(); break;
                    case 2: est.ordenar();
                    System.out.println("Ordenado com sucesso!");
                    break;
                    case 3: System.out.println(est.toString()); break;
                    }
             } while (opcao != 4);
             }

    }
    

