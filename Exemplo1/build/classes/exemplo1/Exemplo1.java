
package exemplo1;
import javax.swing.JOptionPane;
public class Exemplo1 {

    public static void main(String[] args) {
        CRefrigerante t =new CRefrigerante("fechada");
        t.FecharRefrigerante();
        t.BeberRefrigerante();
        JOptionPane.showMessageDialog(null,t.EstadoRefrigerante(250));
        
    }
    
}
