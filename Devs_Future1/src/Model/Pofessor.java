package Model;
public class Pofessor extends Pessoa
{
    private String disciplina;
    private int nrDeTurmas; 
    private int nrDeFaltas;

    public Pofessor(String disciplina, int nrDeTurmas, int nrDeFaltas, String nome, String endereco, 
                char sexo, int contacto, int id) 
    {
        super(nome, endereco, sexo, contacto, id);
        this.disciplina = disciplina;
        this.nrDeTurmas = nrDeTurmas;
        this.nrDeFaltas = nrDeFaltas;
    }

    public Pofessor(String disciplina, int nrDeTurmas, int nrDeFaltas) 
    {
        this.disciplina = disciplina;
        this.nrDeTurmas = nrDeTurmas;
        this.nrDeFaltas = nrDeFaltas;
    }

    public String getDisciplina() 
    {
        return disciplina;
    }

    public void setDisciplina(String disciplina) 
    {
        this.disciplina = disciplina;
    }

    public int getNrDeTurmas() 
    {
        return nrDeTurmas;
    }

    public void setNrDeTurmas(int nrDeTurmas) 
    {
        this.nrDeTurmas = nrDeTurmas;
    }

    public int getNrDeFaltas() 
    {
        return nrDeFaltas;
    }

    public void setNrDeFaltas(int nrDeFaltas) 
    {
        this.nrDeFaltas = nrDeFaltas;
    }

    @Override
    public String toString() {
        return super.toString()+"Pofessor{" + "disciplina=" + disciplina + ", nrDeTurmas=" +
                    nrDeTurmas + ", nrDeFaltas=" + nrDeFaltas + '}';
    }   
}

