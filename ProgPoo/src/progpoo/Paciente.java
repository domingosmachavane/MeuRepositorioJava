
package progpoo;
public class Paciente extends Pessoa {
    
    public Paciente(String nome, String dataNascimento, String avenida, String bairro, String celular, String bi, Short casa, int numero, int quarteirao, char sexo){
        super(nome,  dataNascimento, avenida,  bairro, celular,  bi,  casa, numero,  quarteirao,  sexo);
    }
    
    @Override
    public String toString(){
        return 
                super.toString()+
                ""+"\n"+
                "......................................................................"+"\n"+
                ""+"\n";
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getNumero() {
        return numero;
    }
    
    
}
