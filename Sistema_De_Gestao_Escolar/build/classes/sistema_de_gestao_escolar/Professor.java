
package sistema_de_gestao_escolar;

public class Professor extends Pessoa {
    private String especialidade;
    private int horas_trabalho;

    public Professor(String nome, String data_nascimento, String numero_bi, String estado_civil,String especialidade,int horas_trabalho) {
        super(nome, data_nascimento, numero_bi, estado_civil);
        this.especialidade=especialidade;
        this.horas_trabalho=horas_trabalho;
    }
    public void Salario(){
    
        
    }
    public void Bonus(){
            
    }
    public void ReceberAumento(){
    
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getHoras_trabalho() {
        return horas_trabalho;
    }

    public void setHoras_trabalho(int horas_trabalho) {
        this.horas_trabalho = horas_trabalho;
    }
    

   
    
    
}
