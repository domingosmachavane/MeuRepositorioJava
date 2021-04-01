
package aula011;

public class ALuno extends Pessoa{
    private int matricula;
    private String curso;
    public ALuno(int mensalidade){
        this.matricula=mensalidade;
    
    }
    public void pagarMensalidade(int valor){
        if(valor<matricula){
             System.out.println("Valor Invalido! ");
        }else{
            System.out.println("Pagando mensalidade de Aluno "+this.getNome());
        
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
