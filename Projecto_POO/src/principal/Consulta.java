package principal;
import java.io.*;
public class Consulta implements Serializable{
    //Atributos
    private int sala, idPa, idMe;
    private String data, nomePa,nomeMe;
    //Construtor
    public Consulta(int idPa,String nome, int sala, String data){
        this.idPa = idPa;
        this.nomePa = nome;
        this.sala = sala;
        this.data = data;
    }
    public Consulta(){
        this(0, "", 0,"");
    }
    
    /*GETTERS*/
    public int getSala() {
        return sala;
    }

    public int getIdPa() {
        return idPa;
    }

    public String getData() {
        return data;
    }

    public String getNomePa() {
        return nomePa;
    }

    //METODO tOString()
    public String toString(){
        return ""
                +"Id paciente....................: "+idPa+"\n"
                +"Nome Paciente..................: "+nomePa+"\n"
                +"Sala Para a consulta...........: "+sala+"\n"
                +"data da Consulta...............: "+data+"\n";
    }
}
