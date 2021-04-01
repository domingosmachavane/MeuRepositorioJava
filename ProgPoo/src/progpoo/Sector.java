
package progpoo;
public class Sector {
    private String nomeSector;
    private int numSector;
    private int numMedico, numPaciente;
    ValidacoesDados v = new ValidacoesDados();
    
    public Sector(int numP, int numM,String nomeSector,int numSector){
        this.numPaciente = numP;
        this.numMedico = numM;
        this.nomeSector = nomeSector;
        this.numMedico = numSector;
        
    }

    public Sector() {
        
    }
    

    public String getNomeSector() {
        return nomeSector;
    }

    public void setNomeSector(String nomeSector) {
        this.nomeSector = nomeSector;
    }

    public int getNumSector() {
        return numSector;
    }

    public void setNumSector(int numSector) {
        this.numSector = numSector;
    }
    
    
    
    public String toString(){
        return  
                "Numero do paciente................: "+ numPaciente+"\n"+
                "Numero do Medico..................: "+ numMedico+"\n"+
                "Nome do sector....................: "+nomeSector+"\n"+
                "Numero do sector..................: "+ numSector+"\n"+
                ""+ "\n"+
                "................................................................"+ "\n"+
                ""+"\n";
    }
    
    
}
