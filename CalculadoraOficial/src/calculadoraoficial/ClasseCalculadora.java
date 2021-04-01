
package calculadoraoficial;
import java.awt.*;
import javax.swing.*;
public class ClasseCalculadora extends JFrame{

    public ClasseCalculadora(String nome){
            super(nome);
            setSize(600,600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            Container container = getContentPane();
            container.setLayout(new BorderLayout(5,5));
            container.setLayout(new GridLayout(4,3));
            container.setBackground(Color.blue);
            JButton botao1 = new JButton("1");
            JButton botao2 = new JButton("2");
            JButton botao3 = new JButton("3");
            JButton botao4 = new JButton("4");
            JButton botao5 = new JButton("5");
            JButton botao6 = new JButton("6");
            JButton botao7 = new JButton("7");
            JButton botao8 = new JButton("8");
            JButton botao9 = new JButton("9");
            JButton botao10 = new JButton("10");
            JButton botao11 = new JButton("11");
            JButton botao12 = new JButton("12");
            JTextField campodeTexto = new JTextField();
            campodeTexto.setDragEnabled(true);
            campodeTexto.setSize(50, 600);
            JPanel paineltop = new JPanel();
            paineltop.add(campodeTexto);
            container.setLayout(new BorderLayout(3,3));
            container.add(paineltop , BorderLayout.NORTH);
            
            setVisible(true);
    }
    //JFrame janelaprincipal = new JFrame();
    
}
