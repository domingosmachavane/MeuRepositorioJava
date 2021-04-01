package Control;
import Model.*;
import java.util.Vector;

public class Accao 
{
    Vector vetor = new Vector();
    Validacoes valida = new Validacoes();
    
    public Accao()
    {
        
    }  
    
    public void cadastro(int opcao) 
    {
        System.out.printf("/tINSERCAO DE DADOS:%n%n");
        String nome = valida.validaString("Nome: ", 3, 25);
        char sexo = valida.validaChar("Sexo: ");
        valida.imprimir("Endereco:");
        String bairro = valida.validaString("Bairro:  ", 3, 25);
        int  nrDaCasa = valida.validaInt("Numero da casa: ", 1, 10000);
        int nrDoQuarteirao = valida.validaInt("Numero de quarteirao: ", 1, 10000);
        String endereco =  endereco(bairro,  nrDaCasa, nrDoQuarteirao);
        if(opcao == 1){
            
        
        
        }
    }    
    
    public String endereco(String bairro, int nrDaCasa, int nrDoQuarteirao)
    {
        String endereco = String.format("Endereco:%nBairro: %s%nNumero da casa: %d%nNumero do quarteirao: %d%n%n");
        return endereco;
    }
    public void cadastrarEstudante(){
            
    }
}
