
package studiesfuture;
import devsfuture.DevsFuture;
public class Pessoa {
        protected int id;
        protected String nome , morada;
        
        
        public Pessoa(){
                    
        }

    public Pessoa(int id, String nome, String morada) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        
    }


    
    

    @Override
    public String toString() {
        return  "Nome=" + nome + ", ID=" + id + ", Morada = " + morada ;
    }
    
    
        
}
