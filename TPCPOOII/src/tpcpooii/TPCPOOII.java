
package tpcpooii;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
 
public class TPCPOOII extends JFrame{
        public TPCPOOII(){
            
                super("Exercicio do tpc");
                Container c = getContentPane();
                c.setLayout(new GridLayout(4,3));
                c.setLayout(new BorderLayout(1,1));
                c.add(BorderLayout.NORTH, new JTextField());
                c.add(BorderLayout.WEST, new JButton("1"));
                c.add( BorderLayout.CENTER,new JButton("2"));
                c.add(BorderLayout.EAST,new JButton("3"));
                c.add(BorderLayout.WEST,new JButton("4"));
                c.add( BorderLayout.CENTER,new JButton("5"));
                c.add( BorderLayout.EAST,new JButton("6"));
                c.add(BorderLayout.WEST, new JButton("7"));
                c.add( BorderLayout.CENTER,new JButton("8"));
                c.add( BorderLayout.EAST,new JButton("9"));
                 c.add(BorderLayout.WEST,new JButton("*"));
                c.add(BorderLayout.CENTER,new JButton("0"));
                c.add(BorderLayout.EAST,new JButton("#"));
                c.add(BorderLayout.SOUTH, new JTextField());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(600,600);
                setVisible(true);
                
        }
                
    public static void main(String[] args) {
        // criacao do frame 
        
        new TPCPOOII();
       
    }
    
}
