package Model;

public class Pessoa 
{
    protected String nome;
    protected String endereco;
    protected char sexo;
    protected int contacto;
    protected int id;
    
    public Pessoa(String nome, String endereco, char sexo, int contacto, int id)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.contacto = contacto;
        this.id = id;
    }
    
    public Pessoa()
    {
        
    }

    @Override
    public String toString() 
    {
        return "Pessoa{" + "nome=" + nome + ", endereco=" + endereco + ", sexo="
                    + sexo + ", contacto=" + contacto + ", id=" + id + '}';
    }
}
