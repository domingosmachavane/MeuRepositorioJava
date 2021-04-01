
package principal;

import java.util.Vector;
public class Medico extends Pessoa{
    //Atributos
    private String especializacao;
    private int senha;
    private int sector;
    //Construtores
    public Medico(int id,String nome, String dataNas, String morada, String bi, int celular, char sexo, String espec, int numMedico, int senha, int sector){
        super(id,nome, dataNas, morada, bi, celular, sexo);
        this.especializacao = espec;
        this.senha = senha;
        this.sector = sector;
    }

    public Medico(){
        this(0,"", "", "", "", 0, ' ', "", 0,0, 0);
    }
    //GETTERS
    public int getSenha() {
        return senha;
    }
    
    public int getSector(){return sector;}
    
    //Metodo Acessor de informacao*
    public String toString(){
        return
                 super.toString()+
                 "Especializaco.........................: "+ especializacao + "\n"
                +"Sector................................: "+ sector+"\n"+
                 "................................................................"+
                 "\n";
    }
}
