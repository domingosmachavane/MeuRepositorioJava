
package hospital;

public class Paciente {
private int numusuario,telefone;
private String bairro,avenida,bi,data_nascimento,nome_paciente;
private char sexo;
private short casa;
private byte quarteirao;

    public Paciente(int numusuario, int telefone, String bairro, String avenida, String bi, String data_nascimento, String nome_paciente, char sexo, short casa, byte quarteirao) {
        this.numusuario = numusuario;
        this.telefone = telefone;
        this.bairro = bairro;
        this.avenida = avenida;
        this.bi = bi;
        this.data_nascimento = data_nascimento;
        this.nome_paciente = nome_paciente;
        this.sexo = sexo;
        this.casa = casa;
        this.quarteirao = quarteirao;
    }


  
     public void Actualizar(int numusuario, int telefone, String bairro, String avenida, String bi, String data_nascimento, String nome_paciente, char sexo, short casa, byte quarteirao){
     
     }
     public String Selecionar(int numusuario){
     return "";
     }

    public int getNumusuario() {
        return numusuario;
    }
     private int Criar_numero_paciente(){
     return 0;
     }
    
    
}
