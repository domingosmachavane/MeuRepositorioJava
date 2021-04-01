
package progpoo;
public class Medico extends Pessoa {
    private String especializacao;
   /*
      public Paciente(String nome, String dataNascimento, String avenida, String bairro, String celular, String bi, Short casa, int numero, int quarteirao, char sexo){
        super(nome,  dataNascimento, avenida,  bairro, celular,  bi,  casa, numero,  quarteirao,  sexo);
    }
    
    */
    public Medico(String nome, String dataNascimento, String avenida, String bairro, String celular, String bi, Short casa, int numero, int quarteirao, char sexo){
        super(nome,  dataNascimento, avenida,  bairro, celular,  bi,  casa, numero,  quarteirao,  sexo);
        especializacao = v.validaString("Digite a especializacao: ",1, 20);
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
    @Override
    public String toString(){
        return
                super.toString()+
                "Especializaco.........................: "+ especializacao + "\n"+
                ""+ "\n"+
                "................................................................"+ "\n"+
                ""+"\n";
    }
}
