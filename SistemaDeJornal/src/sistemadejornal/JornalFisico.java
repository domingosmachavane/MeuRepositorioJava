
package sistemadejornal;

import java.util.Date;

public class JornalFisico extends Jornal {
        public  static int ContF = 0;
    public JornalFisico(float preco, int periodicidade, int numSerie , char formato) {
        super(25, 1, 1222,'F');
        ContF = ContF+25;
    }

      public void AdicionaJornalFisico(){
            //Jornal jj = new Jornal(15f,d,67);
            System.out.println("====================================Jornal Fisico===============================================");
                        System.out.println("Preco do Jornal : "+getPreco()+" Periodicidade : "+ getPeriodicidade()+" formato :  Fisico ");
                        System.out.println("=================================================================================================");
                        lerJornal();
                        System.out.println("Numero Objecto : "+JornalFisico.ContF);
             System.out.println("=================================================================================================");
                        
        }
    @Override
    public void lerJornal(){
        ReadAndWritefOb bb = new ReadAndWritefOb();
                        bb.lerNum("Jornal.txt.txt");
    }

    @Override
    public String toString() {
        return "JornalFisico{" + "formato=" +super.toString();
    }
    

   
    
    
    
}
