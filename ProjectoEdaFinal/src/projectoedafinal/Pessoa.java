
package projectoedafinal;

public class Pessoa {
            protected String nome;
            protected int casa,quarteirao,telefone;
            
           public Pessoa(String nome, int casa , int quarteirao , int telefone){
               this.nome = nome;
               this.casa = casa;
               this.quarteirao = quarteirao;
               this.telefone = telefone;
           }
           
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCasa() {
        return casa;
    }

    public void setCasa(int casa) {
        this.casa = casa;
    }

    public int getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(int quarteirao) {
        this.quarteirao = quarteirao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
           public String toString(){
                return " nome : "+this.nome +" casa : "+this.casa+" quarteirao :"+this.quarteirao +" telefone : "+this.telefone;
           }
            
}
