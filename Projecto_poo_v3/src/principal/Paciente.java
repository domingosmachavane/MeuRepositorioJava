
package principal;
import java.io.*;
public class Paciente extends Pessoa implements Serializable{
    /*ATRIBUTOS*/
    
    //Construtores
    public Paciente(int id,String nome, String dataNas, String morada, String bi, int celular, char sexo){
        super(id,nome, dataNas, morada, bi, celular, sexo);
    }
    public Paciente(){
        this(0,"", "", "", "", 0,' ');
    }
    
    /*Metodo para Retornar Informacao*/
    public String toString(){
        return super.toString()+
                "\n................................................................."+"\n";
    }
}
