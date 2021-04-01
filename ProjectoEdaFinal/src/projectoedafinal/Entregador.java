
package projectoedafinal;

public class Entregador extends Pessoa{
    private int senha;
    public Entregador(String nome, int casa, int quarteirao, int telefone) {
        super(nome, casa, quarteirao, telefone);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
}
