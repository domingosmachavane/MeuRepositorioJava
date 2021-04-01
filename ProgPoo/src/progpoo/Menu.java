
package progpoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    ValidacoesDados v = new ValidacoesDados();
    Admistrador ad ;
    MarcacaoConsulta marc;
     
    
    public Menu(){
        v.imprimir("************************** Preecha os dados do Administrador **********************************************");
        ad = new Admistrador();
        marc  = new MarcacaoConsulta();
    }
    
    public void ApresentarMenu() throws IOException{
        BufferedReader x= new BufferedReader (new InputStreamReader(System.in));
        byte i=0;
        do{
            
            v.imprimir("************ MENU *************\n"
            +"* 1-Adicionar Medico          *\n"
            +"* 2-Adicionar Pacinte         *\n"
            +"* 3-Ver Medicos cadastrados   *\n"
            +"* 4-Ver Pacientes cadastrados *\n"
            +"* 5-Marcar consultas          *\n"
            +"* 6-Ver Sectores/consultas    *\n"
            +"*   Reservadas                *\n"
            +"* 7-Ver Salas reservados      *\n"        
            +"* 8-Alterar dados Medico      *\n"
            +"* 9-Alterar Dados do paciente *\n" 
            +"* 10-Ver o total das diarias  *\n"          
            +"*******************************\n");
            System.out.println("Digite uma opcao: ");
            i = Byte.parseByte(x.readLine());
            System.out.println("******************************************************");
            switch(i){
                case 1:
                    ad.adicMedico();
                    break;
                case 2:
                    ad.adicPaciente();
                    break;
                case 3:
                    v.imprimir(ad.visualizaMedicos());
                    break;
                case 4:
                    v.imprimir(ad.visualizaPaciente());
                    break;
                case 5:
                    ad.marcaConsulta();
                    break;
                case 6:
                     ad.imprSectores();
                    //v.imprimir(marc.visualizarSectoresResevados());
                    break;
                case 7:
                    ad.imprSala();
                   // v.imprimir(marc.visualizarSalasResevados());
                    break;
                case 8:
                    ad.alaterarDadoMedico();
                    break;
                case 9:
                    ad.alaterarDadoPaciente();
                    break;
                case 10:
                    ad.imprimirTotal();
                    //marc.TotalDiarias();
                    break;
                
            }
        if (i>10){
                System.out.println("Numero invalido! Digite novamente");
            }
        
        }while(i!= 0);
    }
    
}
