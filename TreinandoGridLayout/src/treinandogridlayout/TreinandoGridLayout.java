
package treinandogridlayout;
import javax.swing.*;
import java.awt.*;
public class TreinandoGridLayout extends JFrame{
        public TreinandoGridLayout(){
                    super("Exercicio tpc");
                    Container c = getContentPane();
                    JTextField field = new JTextField();
                    field.setFont(new Font("serif",Font.PLAIN,26));
                    c.add(BorderLayout.NORTH, field);
                    Container n = new JPanel();
                    Container n1 = new JPanel();
                    JButton botao1 = new JButton("botao1");
                    JButton botao2 = new JButton("botao2");
                    JButton botao3 = new JButton("botao3");
                    JButton botao4 = new JButton("botao4");
                     JButton botao5 = new JButton("botao5");
                     JButton botao6 = new JButton("botao6");
                     JButton botao7 = new JButton("botao7");
                     JButton botao8 = new JButton("botao8");
                     JButton botao9 = new JButton("botao9");
                     JButton botao10 = new JButton("salvar");
                     JButton botao11 = new JButton("enviar");
                    n.setLayout(new GridLayout(3,3,5,5));
                    n1.setLayout(new GridLayout(1,2,10,10));
                    //n.setLayout(new BorderLayout());
                    n.add(botao1);
                    n.add(botao2);
                    n.add(botao3);
                    n.add(botao4);
                    n.add(botao5);
                    n.add(botao6);
                    n.add(botao7);
                    n.add(botao8);
                    n.add(botao9);
                    n1.add(BorderLayout.CENTER,botao10);
                    n1.add(BorderLayout.CENTER,botao11);
                    c.add(BorderLayout.CENTER,n);
                    c.add(BorderLayout.SOUTH,n1);
                  
                    setSize(300,300);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setVisible(true);
        }
    public static void main(String[] args) {
                
                
                new TreinandoGridLayout();
          
                
    }
    
}
