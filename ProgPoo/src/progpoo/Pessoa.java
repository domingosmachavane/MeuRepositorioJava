
package progpoo;
public  class Pessoa {
    protected String nome,dataNascimento, avenida, bairro, celular, bi;
    protected short casa;
    protected int numero,  quarterao;
    protected char sexo;
   // protected ValidacoesDados v = new ValidacoesDados();
     Tarefas tarefas = new Tarefas();

    public Pessoa(String nome, String dataNascimento, String avenida, String bairro, String celular, String bi, short casa, int numero, int quarterao, char sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.avenida = avenida;
        this.bairro = bairro;
        this.celular = celular;
        this.bi = bi;
        this.casa = casa;
        this.numero = numero;
        this.quarterao = quarterao;
        this.sexo = sexo;
    }

    
   
    
    public String toString(){
        return
                "Nome..................................: "+nome +"\n"+
                "Data de nascimento....................: "+dataNascimento +"\n"+
                "Sexo..................................: "+sexo+"\n"+
                "Bi....................................: "+bi +"\n"+
                "Avenida...............................: "+avenida+"\n"+
                "Casa..................................: "+casa+"\n"+
                "Bairro................................: "+bairro+"\n"+
                "Quarterao.............................: "+quarterao+"\n"+
                "Celular...............................: "+celular+"\n"+
                "Numero................................: "+numero+"\n";
                
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
   
}
