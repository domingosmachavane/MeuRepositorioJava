
package principal;
import java.io.Serializable;
public class Pessoa implements Serializable{
    /*ATRIBUTOS DA CLASSE*/
    protected String nome,dataNascimento,morada , bi;
    protected int id,celular;
    protected char sexo;
    
    /*CONSTRUTORES*/
    public Pessoa(int id,String nome, String dataNas, String morada, String bi, int celular, char sexo){
        this.id=id;
        this.nome = nome;
        this.dataNascimento = dataNas;
        this.morada = morada;
        this.bi = bi;
        this.celular = celular;
        this.sexo = sexo;
    }
    public Pessoa(){
        this(0, "", "", "", "", 0, ' ');
    }
    
    //GETTER
    public int getId(){
      return id;  
    }
    
    public String getNome(){return nome;}
    /*METODO PARA ACESSAR A INFORMACAO DA CLASSE*/
    public String toString(){
        return  "ID(Identificador Unico)...............: "+id+"\n"+
                "Nome..................................: "+nome +"\n"+
                "Data de nascimento....................: "+dataNascimento +"\n"+
                "Sexo..................................: "+sexo+"\n"+
                "BI....................................: "+bi +"\n"+ 
                "Morada................................: "+morada+"\n"+
                "Numero de Celular.....................: "+celular+"\n";
    }
}
