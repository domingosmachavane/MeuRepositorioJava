
package executavel1;
import java.io.*;
public class estudante {
  //atributos
    private String nome;
    private int numest;
    private String curso;
    private float notadmi;
    BufferedReader br;
    //constructor
    public estudante()throws Exception{
    
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotadmi() {
        return notadmi;
    }

    public void setNotadmi(float notadmi) {
        this.notadmi = notadmi;
    }

    public int getNumest() {
        return numest;
    }

    public void setNumest(int numest) {
        this.numest = numest;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
   

    public String toString(){
    return " o estudante "+nome+" admitiu para o curso de "+this.curso+"  com a nota de "+Math.round(notadmi)+" e o seu numero de estudante e "+this.numest+". ";
    }

}
