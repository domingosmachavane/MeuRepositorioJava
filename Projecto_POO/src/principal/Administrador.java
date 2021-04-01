
package principal;
import java.io.*;
public class Administrador extends Pessoa implements Serializable{
    private int senha;
    
    //Construtores
    public Administrador(int id,String nome, String dataNas, String morada, String bi, int celular, char sexo, int numAdmin, int senha){
        super(id, nome, dataNas, morada, bi, celular, sexo);
        this.senha = senha;
    }
    
    public Administrador(){
        this(0,"", "", "", "", 0, ' ', 0, 0);
    }
    
    //Getters
    public int getSenha(){
        return senha;
    }
    
    //METODO PARA INFORMACAO
    public String toString(){
        return super.toString()+"\n"+
                "\n........................................................................................\n";
    }   
}
