
package gereestudante;
import java.util.Vector;

/**
 *
 * @author Domingos Machavane
 */
public class Ordenacao {
    public void ordTurma(Vector lst) { //ordena por ordem decresc. da média
        Estudante aux1,aux2; int i_maior, numEst = lst.size();
        for (int i=0; i < numEst-1; i++) {
        i_maior = localizarMaior(lst,i);
        aux1 = (Estudante)lst.elementAt(i);
        aux2 = (Estudante)lst.elementAt(i_maior);
        lst.setElementAt(aux2,i);
        lst.setElementAt(aux1,i_maior);
        }
}
    private int localizarMaior(Vector x,int inicio) {
          int i_max = inicio; Estudante t1,t2;
        for (int k = inicio+1; k < x.size(); k++) {
        t1 = (Estudante)x.elementAt(k);
        t2 = (Estudante)x.elementAt(i_max);
        if (t1.getMedia() > t2.getMedia())
        i_max = k;
        }
        return i_max;
}


    
}
