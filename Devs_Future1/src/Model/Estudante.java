package Model;
public class Estudante extends Pessoa
{
    private String dataInicio;
    private String nivelAcademico;
    private int nrDeDisciplinas;

    public Estudante(String dataInicio, String nivelAcademico, int nrDeDisciplinas, 
                String nome, String endereco, char sexo, int contacto, int id) 
    {
        super(nome, endereco, sexo, contacto, id);
        this.dataInicio = dataInicio;
        this.nivelAcademico = nivelAcademico;
        this.nrDeDisciplinas = nrDeDisciplinas;
    }

    public Estudante(String dataInicio, String nivelAcademico, int nrDeDisciplinas)
    {
        this.dataInicio = dataInicio;
        this.nivelAcademico = nivelAcademico;
        this.nrDeDisciplinas = nrDeDisciplinas;
    }

    public String getDataInicio() 
    {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) 
    {
        this.dataInicio = dataInicio;
    }

    public String getNivelAcademico() 
    {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) 
    {
        this.nivelAcademico = nivelAcademico;
    }

    public int getNrDeDisciplinas()
    {
        return nrDeDisciplinas;
    }

    public void setNrDeDisciplinas(int nrDeDisciplinas) 
    {
        this.nrDeDisciplinas = nrDeDisciplinas;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudante{" + "dataInicio=" + dataInicio + ", nivelAcademico=" + 
                    nivelAcademico + ", nrDeDisciplinas=" + nrDeDisciplinas + '}';
    }
}
