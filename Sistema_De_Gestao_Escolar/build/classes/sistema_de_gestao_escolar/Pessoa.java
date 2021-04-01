
package sistema_de_gestao_escolar;

public abstract class Pessoa {
    private String nome,data_nascimento,numero_bi,estado_civil;

    public Pessoa(String nome, String data_nascimento, String numero_bi, String estado_civil) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.numero_bi = numero_bi;
        this.estado_civil = estado_civil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getNumero_bi() {
        return numero_bi;
    }

    public void setNumero_bi(String numero_bi) {
        this.numero_bi = numero_bi;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }
    
    
    
    
}
