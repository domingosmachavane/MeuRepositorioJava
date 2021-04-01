
package exerciciosatrasado1;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ExerciciosAtrasado1 extends JFrame implements ActionListener{
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JTextField textfield1, textfield2;
    JPanel jpanel1,jpanel2,jpanel3;
        public ExerciciosAtrasado1(){
            setTitle("Janela Teste");
            setLocation(200,200);
            setSize(300,300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           //------Criando efectivamente os JPanels-------//
            jpanel1 = new JPanel();
            jpanel2 = new JPanel();
            //--------------criando Jpanels e seus elementos-----------------//
            jpanel1.setLayout(new GridLayout(2,2));
           
            //Criando labels e botoes
            l1 = new JLabel("Mudar cor e imprime texto em caixas");
            l2 = new JLabel("Mudar cor e imprime texto de botoes ");
            b1 = new JButton("botao1");
            b2 = new JButton("botao2");
            b1.addActionListener(this);
            // ---------Adicionando botoes e os labels ao jpanel1-------//
            jpanel1.add(l1);
            jpanel1.add(b1);
            jpanel1.add(l2);
            jpanel1.add(b2);
            //definindo a arumacao dos elementos no Jpanel2----
            jpanel2.setLayout(new FlowLayout());
            
            // criando texts fields
            
            textfield1 = new JTextField("Texto inicio1");
            textfield2 = new JTextField("Texto inicio2");
            
            // adicional os fields ao jpanel
            
            jpanel2.add(textfield1);
            jpanel2.add(textfield2);
            
           // criando jpanel3: jpanel1 + jpanel2
            jpanel3 = new JPanel();
            
            // Organizando tudo
            
            jpanel3.setLayout(new BorderLayout());
            jpanel3.add(BorderLayout.NORTH,jpanel1);
            jpanel3.add(BorderLayout.SOUTH,jpanel2);
            
            l3 = new JLabel("Leste");
            l4 = new JLabel(" Oeste");
            
            jpanel3.add(BorderLayout.EAST,l3);
            jpanel3.add(BorderLayout.WEST,l4);
            add(jpanel3);
            setVisible(true);
        }
    public static void main(String[] args) {
        //System.err.println("************************Erro******************************8");
       new ExerciciosAtrasado1();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if( b1 == e.getSource()){
                        JOptionPane.showMessageDialog(null,"Ola Mundo");
        }else
            if(b2 == e.getSource()){
                this.l1.getIcon();
        }
        
    }
    
}
