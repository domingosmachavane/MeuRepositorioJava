
package studiesfuture.Acoes;
import java.util.*;
import studiesfuture.Estudante;
import studiesfuture.Pessoa;
import studiesfuture.Professor;
//import studiesfuture.Pessoa;
public class Acoes {
    
 public double somaValor =0,recebeDepagamento=0;
 Vector vetor = new Vector();
 Validacoes validar = new Validacoes();
 Scanner scanner = new Scanner(System.in);   
  int classe, id , horaDetrabalho;  
  double valorPagar;
  String dataInicio , nome , morada, disciplina;
    public void cadastrar(int i){
        
                System.out.println("==========Welcome============");
                nome = validar.validaString("Informe Seu Nome : ", 4, 20);
                morada = validar.validaString("Informe a sua morada :", 4, 15);
               id = validar.validaInt("Informe Seu Id : ", 1, 12);
            if(i == 1)
                 cadastrarEstudante(nome , morada ,id);
            else
                    if(i == 2)
                        cadastrarprofessor(nome , morada ,id);
           vetor.trimToSize();     
    }
    public void cadastrarEstudante(String nome , String morada , int id){
                     valorPagar = validar.validaFloat("Informe o Valor que vai pagar : ", 300, 5000);
                     dataInicio = validar.validaData("Informe a data de inicio : ");
                     classe = validar.validaInt("Informe A classe do estudante", 1, 12);
                     //int classe, String nome, String morada , double valorPagar , String dataInicio
                    Estudante estudante = new Estudante(id, nome , morada, classe ,valorPagar, dataInicio);
                    vetor.add(estudante);
                    recebeDepagamento = somaPagamentos(valorPagar);
    
    }
     public void cadastrarprofessor(String nome , String morada , int id){
                  horaDetrabalho = validar.validaInt("Informe quantas horas ira trabalhar", 6, 15);
                        disciplina = validar.validaString("Informe A disciplina que ira trabalhar", 6, 20);
                        //String Disciplina, int horaDeTrabalho, int classe, String nome, String morada
                        Professor professor = new Professor(disciplina, horaDetrabalho , id ,nome , morada);
    
    }
    public double somaPagamentos(double valorPagar){
                    this.somaValor +=valorPagar; 
                return somaValor;
    }
    public void imprimeEstudantes(){
        int quant = vetor.size();
            for (int i = 0; i< vetor.size();i++){
                        System.out.println(vetor.get(i).toString());
            }
      //   System.out.println("Soma de Todos Estudantes: "+ quant+" valor total " +recebeDepagamento);
    }
    
}
