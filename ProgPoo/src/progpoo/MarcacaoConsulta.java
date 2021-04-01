
package progpoo;
import java.util.Vector;
public class MarcacaoConsulta {
    private int numPac, numMed;
    private Vector listaSector; 
    private Vector listaSala;
    private Vector listaDiaria;
    private boolean ver = false;
    private boolean verM = false;
    private float totalDiaria;
    Sector sec;
    
    ValidacoesDados v = new ValidacoesDados();
    
    public MarcacaoConsulta(){
        listaSector  = new Vector();
        listaSala  = new Vector();
        listaDiaria = new Vector();
        totalDiaria = 0;
    }
    
    public void marca(Vector listMed, Vector listPac){
        v.imprimir("*********************************** Marcacao de Consultas *************************************************");
        Paciente pac; Medico med;
        String nomPa = "",  nomeMe;
        do{
            numPac = v.validaInt("Digite o numero do paciente que deseja marcar a consulta: ",1, 100);
            for(int i = 0; i<listPac.size(); i++){
                pac = (Paciente)listPac.elementAt(i);
                if(numPac == pac.getNumero() ){
                    ver = true;
                    nomPa = pac.getNome();}
            }
        }while(ver ==false);
        if(ver == true){
            v.imprimir("Marcando consulta para: "+nomPa);
            
            do{
            numMed = v.validaInt("Digite o numero do Medico que fara a consulta: ",1, 100);
            for(int i = 0; i<listMed.size(); i++){
                med = (Medico)listMed.elementAt(i);
                if(numMed == med.getNumero() )
                    verM = true;
                    //nomeMe =  med.getNome();
            }
            }while(verM ==false);
            if(verM==true){
                  //= new Sector() ;
                 sec.setNomeSector( v.validaString("Digite o nome do Sector: ",1,20));
                 sec.setNumSector(v.validaInt("Digite o numero do sector: ",1,100));
                 sec = new Sector(numPac, numMed,sec.getNomeSector(),sec.getNumSector());
                 listaSector.addElement(sec);
                 listaSector.trimToSize();
                 Sala sal = new Sala(sec.getNomeSector(), sec.getNumSector(), numPac, numMed);
                 Diarias dia = new Diarias(numPac,sal);
                 listaDiaria.addElement(dia);
                 listaDiaria.trimToSize();
                 totalDiaria +=dia.getTotal();
                 listaSala.addElement(sal);
                 listaSala.trimToSize();
                 
                 
                 v.imprimir("Consulta Marcada com sucessso!.........");
            }else
                if(verM == false){
                    v.imprimir("Medico nao registrado!");
                }
           
        }else
            if(ver == false){
                v.imprimir("O Paciente nao esta resgistrado! Prv registre primero.");
            }
    }
    public void TotalDiarias(){
       float tot=0; Diarias di;
       //return  totalDiaria;
       for(int e=0; e<listaDiaria.size(); e++){
           di = (Diarias)(listaDiaria.elementAt(e));
           tot += di.getTotal();
       }
       v.imprimir(" "+tot);
    }
    
    public String visualizarSectoresResevados(){
        v.imprimir("******************************** Sectores Reservados *************************************************");
        String visual ="";
        int numSect = listaSector.size();
        Sector temp;
        for(int s=0; s<numSect; s++){
            temp = (Sector)listaSector.elementAt(s);
            visual +=temp.toString();
        }
        return visual;
    }
     
    public String visualizarSalasResevados(){
        v.imprimir("************************************* Salas Reservadas ****************************************************");
        String visual ="";
        int numSal = listaSala.size();
        Sala temp;
        for(int s=0; s<numSal; s++){
            temp = (Sala)listaSala.elementAt(s);
            visual +=temp.toString();
        }
        return visual;
    }
}
