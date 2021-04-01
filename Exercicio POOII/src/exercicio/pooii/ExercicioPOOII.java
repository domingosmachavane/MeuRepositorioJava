
package exercicio.pooii;
import javax.swing.*;
public class ExercicioPOOII {
//Roteiro de uma interface
    public static void main(String[] args) {
          //criacao da janela principal
        JFrame janela = new JFrame();
        janela.setSize(600,500);
        // criacao de de componentes 
        JLabel label1 = new JLabel("primeira amostra de uso da label");
          JLabel label2 = new JLabel("label com imagem", new ImageIcon("C:\\Users\\Domingos Machavane\\Documents\\NetBeansProjects\\Exercicio POOII\\src\\exercicio\\pooii\\logojava.png"), JLabel.CENTER);
          //criacao do painel ou container
          JPanel painel = new JPanel();
          //adicionar componentes  ao painel
          painel.add(label1);
          painel.add(label2);
          //adicionar o painel ao frame principal
          janela.getContentPane().add(painel);
          //tornar a janela visivel
          janela.setVisible(true);
        // criacao da janela
      /* JFrame janela = new JFrame();
       janela.setSize(600, 300);
       // instaciar os componentes
       JLabel label = new JLabel("Informe sua idade");
       JTextField meutexto = new JTextField(30);
      // JButton botao = new JButton("salvar");
        System.out.println("");
       JLabel label1 = new JLabel("Informe seu Nome");
       JTextField meutexto1 = new JTextField(30);
       JButton botao = new JButton("salvar");
       //criar um container .
       JPanel painel = new JPanel();
       //adicionar os componentes ao containner 
       painel.add(label1);
       painel.add(meutexto);
       painel.add(label);
       painel.add(meutexto1);
       painel.add(botao);
       
       //adicionar o painel a janela principal
       janela.getContentPane().add(painel);
       //tornar a janela visivel
       janela.setVisible(true);*/
       
       
       
    }
    
}
