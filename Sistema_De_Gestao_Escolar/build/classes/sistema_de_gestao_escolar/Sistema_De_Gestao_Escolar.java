
package sistema_de_gestao_escolar;
import java.util.Scanner;
import java.io.*;
import java.util.Date;
public class Sistema_De_Gestao_Escolar {
    public static void main(String[] args) {
      Teste teste = new Teste(13,15);
      Aluno aluno=new Aluno(2, "Informatica", "Laboral", true, "Machavane,Domingos Francisco", "05/03/2001", "123456787654y","Solteiro");
      float trab[] = new float [2];
      trab[0]=13;
      trab[1]=15;
      
        System.out.println("A media de  "+aluno.getNome()+" Do Curso de "+ aluno.getCurso()+" Do"+aluno.getTurno()+" eh "+teste.Media(13, 15,trab)+"E Ele "+aluno.getResultado());
        
    }
    
}
