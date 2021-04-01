
package progpoo;
public class Sala {
    private int numerMedico, numerPaciente, numSector;
    private int numSala;
    private String nomeSecto;
    private String tipoDeConsulta, dataDaConsulta;
    ValidacoesDados v= new ValidacoesDados();
    
    public Sala(String nomesector,int numSec,int numP, int numM){
        this.numerPaciente = numP;
        this.numerMedico = numM;
        this.nomeSecto = nomesector;
        this.numSector = numSec;
        numSala = v.validaInt("Digite o numero de sala: ",1,100);
        tipoDeConsulta = v.validaString("Digite o tipo de consulta [Simples/Especial]: ",1, 20);
        dataDaConsulta = v.validaString("Digite se a consulta e [Urgente]/[Normal]: ",1, 20);
        
    }

    public String getTipoDeConsulta() {
        return tipoDeConsulta;
    }

    public String getDataDaConsulta() {
        return dataDaConsulta;
    }
    
    
    
    
    @Override
    public String toString(){
        return  
                "Numero do pacinete..................: "+ numerPaciente+"\n"+
                "Numero do medico....................: "+ numerMedico+"\n"+
                "Nome do sector......................: "+nomeSecto+"\n"+
                "Numero do sector....................: "+ numSector+"\n"+
                "Numero de sala......................: "+ numSala+"\n"+
                "Tipo de consulta....................: "+ tipoDeConsulta+"\n"+
                "Data da conslta.....................: "+ dataDaConsulta+"\n"+
                ""+ "\n"+
                "................................................................"+ "\n"+
                ""+"\n";
    }
}
