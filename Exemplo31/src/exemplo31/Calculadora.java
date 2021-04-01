
package exemplo31;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Calculadora extends JFrame {
     public Calculadora(String titulo){
                super(titulo);
                this.setSize(600,600);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //this.setLocation(100, 188);
                Container containerprincipal = getContentPane(); 
                containerprincipal.setLayout(new BorderLayout(8,6));
                containerprincipal.setLayout(new GridLayout(4,3));
                containerprincipal.setBackground(Color.YELLOW);
                JButton botao1 = new JButton("1");
                JButton botao2 = new JButton("2");
                JButton botao3 = new JButton("3");
                JButton botao4 = new JButton("4");
                JButton botao5 = new JButton("5");
                JButton botao6 = new JButton("6");
                JButton botao7 = new JButton("7"); 
                JButton botao8 = new JButton("8");
                JButton botao9 = new JButton("9");
                JButton botao10 = new JButton("*");
                JButton botao11 = new JButton("0");
                JButton botao12 = new JButton("#");
              //  this.pack();
                JTextField campoTexto = new JTextField(90);
                 JTextField campoTexto1 = new JTextField(90);
                campoTexto.setPreferredSize(new Dimension(600,30));
                JPanel topPainel = new JPanel();
                JPanel topPainel1 = new JPanel();
                JPanel topPaine2 = new JPanel();
                topPainel.setSize(600,30);
                topPainel.setBorder(new  LineBorder(Color.BLACK));
                topPainel.setBackground(Color.RED);
                //topPainel.setLayout(new FlowLayout());
                topPainel.add(campoTexto);
                containerprincipal.add(topPainel ,BorderLayout.NORTH);
                topPainel1.setBorder(new  LineBorder(Color.BLACK,3));
                topPainel1.setBackground(Color.ORANGE);
                topPainel1.setLayout(new FlowLayout());
                topPainel1.add(campoTexto1);
                containerprincipal.add(topPainel1 ,BorderLayout.SOUTH);
                //pack();
                this.setVisible(true);
                
                
     }
    
}
