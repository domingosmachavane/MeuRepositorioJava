
package sistemadejornal;
import java.util.Vector;
import java.util.Scanner;
public class Gerencia {
  Vector vet = new Vector();
  Scanner sc = new Scanner(System.in);
  Validacoes vv = new Validacoes();
  //float preco, String periodicidade, int numSerie
  Jornal jf ; 
    public Gerencia() {
      
    }
        public void Menu(){
                    int opcao;
                    String Cont = "Sim";
                    do{
                        System.out.println("===========Bem Vindo Ao sistema de Gestao de Jornal==========");
                        System.out.println("1.Jornal Fisico");
                        System.out.println("2.Jornal Digital");
                         System.out.println("3.Sair");
                        opcao = vv.validaShort(" ", (short)1, (short) 3);
                        switch(opcao){
                            //case 1: AdicionaJornalFisico(); break;
                            //case 2: AdicionaJornalDigital();break;
                            case 3: System.out.println("Saindo....................."); System.exit(0); break;
                            default : System.out.println("Opcao Invalida");
                        }
                       Cont = vv.validaString("Desja Continuar?", 1, 3);
                    
                    
                    }while(Cont.equalsIgnoreCase("sim") || Cont.equalsIgnoreCase("s"));
        }  
       public void adicionarNoVector(){
           //float preco, int periodicidade, int numSerie , char formato
           JornalFisico jf = new JornalFisico(15,1,12,'F');
           vet.addElement(jf);
           
                    
       }
    
        
}
