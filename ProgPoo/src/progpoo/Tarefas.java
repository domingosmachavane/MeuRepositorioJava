
package progpoo;

public class Tarefas {
    ValidacoesDados v = new ValidacoesDados();
    public Tarefas() {
        
    }
 
    public void AdicionaPessoa(){
        String nome , dataNascimento , bi ,avenida,bairro , celular;
        char sexo;
        Short casa;
        int quarteirao , numero;
        
       nome = v.validaString("Digite o nome: ",3, 15);
       dataNascimento = v.validaData("Digite a data de nascimento[dd/mm/aa]: ");
       sexo = v.validaChar("Digite o sexo[F/M]: ");
       bi = v.validaString("Digite o numero de BI: ",1, 20);
       avenida = v.validaString("Digite a avenida: ", 3, 20);
       casa = v.validaShort("Digite o numero de casa: ",(short)1,(short)100);
       bairro = v.validaString("Digite o bairro: ",3, 20);
        quarteirao = v.validaInt("Digite o quarterao: ",1, 100);
        celular = v.validaString("Digite o celular: ",3,15);
        numero = v.validaInt("Digite o numero da pessoa: ",1, 200);
        //String nome , String dataNascimento , String avenida , String bairro, String Bi , Short Casa , int numero , int quaarteirao , char sexo 
        Pessoa p =  new Pessoa( nome,  dataNascimento, avenida,  bairro, celular,  bi,  casa, numero,  quarteirao,  sexo);
    }
}
