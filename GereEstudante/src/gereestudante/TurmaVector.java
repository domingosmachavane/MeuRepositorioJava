
package gereestudante;
import java.util.Vector;
/**
 *
 * @author Domingos Machavane
 */
public class TurmaVector {
      private Vector lista;
          public TurmaVector() {
                lista = new Vector(); 
            }
        public void adicEstudante() {
            Estudante est = new Estudante();
            lista.addElement(est);
            lista.trimToSize();
        }
      public String toString() {
            String visualizar="";
            int numEst = lista.size();
            Estudante temp;
            for (int k=0;k<numEst; k++) {
            temp = (Estudante)lista.elementAt(k);
            visualizar += temp.toString(); //.toString() é opcional
            }
            return visualizar;
            }
      public void ordenar() {
        Ordenacao or = new Ordenacao();
        or.ordTurma(lista);
    }

}
