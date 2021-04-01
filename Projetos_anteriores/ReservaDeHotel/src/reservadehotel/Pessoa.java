
package reservadehotel;

public class Pessoa {
    protected String nome;
    protected String data_nasc;
    protected String Bi;
    protected int contato1;
    protected int contato2;

    public Pessoa(String nome, String data_nasc, String Bi, int contato1, int contato2) {
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.Bi = Bi;
        this.contato1 = contato1;
        this.contato2 = contato2;
    }
    @Override
    public  String toString(){
        return "Nome: "+this.nome+"\nData de Nascimento:  "+this.data_nasc+"\nBI: "+this.Bi+"\nContacto1:"+this.contato1+"\nContacto2: "+this.contato2+"\n================";
    
    }

    public String getNome() {
        return nome;
    }

    public String getBi() {
        return Bi;
    }

    public void setContato1(int contato1) {
        this.contato1 = contato1;
    }

    public void setContato2(int contato2) {
        this.contato2 = contato2;
    }

   
    
    
}
