
package studiesfuture;

public class Professor extends Pessoa {
     String disciplina ;
     int horaDeTrabalho;

    public Professor(String Disciplina, int horaDeTrabalho) {
        this.disciplina = Disciplina;
        this.horaDeTrabalho = horaDeTrabalho;
    }

    public Professor(String Disciplina, int horaDeTrabalho, int classe, String nome, String morada) {
        super(classe, nome, morada);
        this.disciplina = Disciplina;
        this.horaDeTrabalho = horaDeTrabalho;
    }
     
}
