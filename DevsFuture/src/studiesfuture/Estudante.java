
package studiesfuture;
import devsfuture.DevsFuture;
public class Estudante extends Pessoa {
        private double valorPagar;
        private String dataInicio ;
        private int classe ;
        
       
    public Estudante() {
        this.valorPagar = 0;
        this.dataInicio = "";
    }

    public Estudante(int id, String nome, String morada ,int classe, double valorPagar , String dataInicio) {
        super(id, nome, morada);
        this.classe = classe;
        this.valorPagar = valorPagar;
        this.dataInicio = dataInicio;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getClasse() {
        return id;
    }

    public void setClasse(int classe) {
        this.id = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public String toString() {
        return super.toString()+ " valorPagar =" + valorPagar + ", dataInicio=" + dataInicio + '}';
    }

    
    

    
    
    
    
    
    
}
