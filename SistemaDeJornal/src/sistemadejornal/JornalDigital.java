
package sistemadejornal;
import java.io.*;
import java.util.Date;

public class JornalDigital extends Jornal implements Serializable{
    private String idioma;
    public static int ContD;
//float preco, Date periodicidade, int numSerie
    public JornalDigital(float preco ,int  periodicidade , int numSer ,char formato, String idioma) {
        //super(25, 1, 1222,'F');
        super(15,15,1111,'D');
        this.idioma = idioma;
        ContD++;
    }
    

 
    @Override
     public void lerJornal(){
        ReadAndWritefOb bb = new ReadAndWritefOb();
                        bb.lerNum("JornalDigital.txt");
    }

    @Override
    public String toString() {
        return "JornalDigital{" + "formato=" +super.toString();
    }
     public void AdicionaJornalDigital(){
             System.out.println("====================================Jornal Fisico===============================================");
                        System.out.println("Preco do Jornal : "+getPreco()+" Periodicidade : "+ getPeriodicidade()+" formato :  Digital ");
                        System.out.println("=================================================================================================");
                        lerJornal();
                       System.out.println("Numero Objecto : "+JornalDigital.ContD);
             System.out.println("=================================================================================================");
                        
        }
    
    
    
}
