
package empresacomercial;

import java.io.Serializable;

public abstract class Funcionario implements Serializable{
    private int IdFuncionario;
    private String nome;

    public Funcionario(int IdFuncionario, String nome) {
        this.IdFuncionario = IdFuncionario;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdFuncionario(){
            return IdFuncionario;
    }
    public void setNome(String no){
        this.nome=no;
    }
    public void setIdFuncionario(int id){
        this.IdFuncionario=id;
    }
    
}
