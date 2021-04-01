
package progpoo;
import java.util.Vector;
public class Admistrador extends Pessoa implements HospInterface{
    private Vector listaPaciente;
    private float total =0;
    private Vector listaDiaria;
    private Vector listaMedico;
    MarcacaoConsulta marcarconsulta = new MarcacaoConsulta();
    
    public Admistrador(){
        listaPaciente = new Vector();
        listaMedico  = new Vector();
        listaDiaria = new Vector();
    }
    
    @Override
    public void adicMedico() {
        v.imprimir("******************************** Criando Medico ************************************************");
        Medico med = new Medico();    
        listaMedico.addElement(med);
        listaMedico.trimToSize();   
    } 
    public String visualizaMedicos() { 
        v.imprimir("******************************** Medicos cadatrados **********************************************");
        String visualizar="";
        int numMed = listaMedico.size();     
        Medico temp;     
        for (int k=0;k<numMed; k++) {       
            temp = (Medico)listaMedico.elementAt(k);
            visualizar += temp.toString(); 
        }
        
        return visualizar;   
    } 
    @Override
    public void adicPaciente() {   
        v.imprimir("*************************** Adicionando Paciente ****************************************");
        Paciente pac = new Paciente();    
        listaPaciente.addElement(pac);
        listaPaciente.trimToSize();   
    } 
    @Override
    public String visualizaPaciente() {  
        v.imprimir("**************************** Pacintes Cadastrados **************************************");
        String visualizar="";
        int numPac = listaPaciente.size();     
        Paciente temp;     
        for (int k=0;k<numPac; k++) {       
            temp = (Paciente)listaPaciente.elementAt(k);
            visualizar += temp.toString(); 
        }
        
        return visualizar;   
    } 
    @Override
    public void alaterarDadoMedico(){
        v.imprimir("****************************** Alterando dados Do medico ******************************");
        Medico medi;
      
         boolean ab = false;
        
        do{
            int procuraCod = v.validaInt("Digite o numero do Medico que pretende alterar os dados",1, 100);

            for(int i = 0; i<listaMedico.size(); i++){
                medi = (Medico)listaMedico.elementAt(i);
                if(procuraCod== medi.getNumero() ){
                    listaMedico.remove(medi);
                    Medico med = new Medico(); 
                    listaMedico.add(i, med);
                   ab = true;
                }
            }
            if (ab == false){
                System.out.println("Numero nao encontrado!");
            }
        }while(ab == false);
    
    }
    @Override
    public void alaterarDadoPaciente(){
        v.imprimir("****************************** Alterando dados Do Paciente ************************************************");
        Paciente pacie;
      
         boolean ab = false;
        
        do{
            int procuraCod = v.validaInt("Digite o numero do Paciente que pretende alterar os dados",1, 100);

            for(int y = 0; y<listaPaciente.size(); y++){
                pacie = (Paciente)listaPaciente.elementAt(y);
                if(procuraCod== pacie.getNumero() ){
                    listaPaciente.remove(pacie);
                    Paciente pac = new Paciente(); 
                    listaPaciente.add(y, pac);
                    ab = true;
                }
            }
            if (ab == false){
                System.out.println("Numero nao encontrado!");
            }
        }while(ab == false);
    
    }
    @Override
    public void marcaConsulta(){
      
        
        marcarconsulta.marca(listaMedico, listaPaciente);
        marcarconsulta.visualizarSectoresResevados();
        
    }
    
    @Override
    public void imprSectores(){
        v.imprimir(marcarconsulta.visualizarSectoresResevados());
    }
    @Override
    public void imprSala(){
        v.imprimir(marcarconsulta.visualizarSalasResevados());
    }
    @Override
    public void imprimirTotal(){
        v.imprimir("Total das diaria: "+"\n");
        marcarconsulta.TotalDiarias();
    }
}
