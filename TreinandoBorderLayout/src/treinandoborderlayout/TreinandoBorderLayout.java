
package treinandoborderlayout;
import java.awt.*;
import javax.swing.*;
public class TreinandoBorderLayout {

    public static void main(String[] args) {
      //Roteiro 
      /*1-Criacao da Janela (Frame) e configuracao
        2-Instanciar Componentes que deseja usar
        3- Criar container ou painel
        4-Adicionar os componentes ao container
        5.adicionar container a janela principal
        6-Tornar a janela visivel
        */
        JFrame frame = new JFrame("Treinando BorderLayout");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton b1 = new JButton("Boatao1");
        JButton b2 = new JButton("Boatao2");
        JButton b3 = new JButton("Boatao3");
        JButton b4 = new JButton("Boatao4");
       JButton b5 = new JButton("Boatao5");
        JTextField campoTexto = new JTextField(50);
         
        JPanel container1 = new JPanel();
        container1.setSize(300,300);
        
        container1.setLayout(new BorderLayout(5,5));//os parametros no border determinam o espacamento
        container1.add(b1,BorderLayout.WEST);
        b1.setBackground(Color.red);
        container1.add(b2,BorderLayout.SOUTH);
        b2.setBackground(Color.black);
        container1.add(campoTexto,BorderLayout.NORTH);
        campoTexto.setBackground(Color.CYAN);
        container1.add(b4,BorderLayout.CENTER);
        b4.setBackground(Color.YELLOW);
       container1.add(b5,BorderLayout.EAST);
        b5.setBackground(Color.ORANGE);
        frame.getContentPane().add(container1);
        
        frame.setVisible(true);
        
    }
    
}
