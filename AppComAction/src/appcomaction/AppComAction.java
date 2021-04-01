
package appcomaction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AppComAction extends JFrame implements ActionListener {
            public AppComAction(){
                       setSize(400,400);
                       setLocationRelativeTo(this.getContentPane());
                       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                       JButton botao1 = new JButton("Clicar");
                       //setBounds(300,200,100,60);
                       
                       JPanel painel = new JPanel();
                       painel.add(botao1);
                       
                       getContentPane().add(painel);
                       botao1.addActionListener(this);
                       setVisible(true);
                       
            
            }
    public static void main(String[] args) {
        // TODO code application logic here
        new AppComAction();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Ola Mundo kkkkkkkkk");
    }
    
}
