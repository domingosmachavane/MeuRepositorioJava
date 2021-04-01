
package exercicio.pooii;

import javax.swing.*;

public class Exemplo2 {
    
    public static void main(String[] args) {
        //criacao da janela principal
        JFrame janela = new JFrame();
        janela.setSize(600,500);
        // criacao de de componentes 
        JLabel label1 = new JLabel("primeira amostra de uso da label");
          JLabel label2 = new JLabel("label com imagem",new ImageIcon("logojava.png"),JLabel.CENTER);
          //criacao do painel ou container
          JPanel painel = new JPanel();
          //adicionar componentes  ao painel
          painel.add(label1);
          painel.add(label2);
          //adicionar o painel ao frame principal
          janela.getContentPane().add(painel);
          //tornar a janela visivel
          janela.setVisible(true);
          
    }
}
