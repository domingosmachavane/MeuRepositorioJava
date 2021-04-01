
public class Conta {
   private int numConta;
   private String Correntlista;
   private float valor;
   
   public Conta(){
   
   }
   public void setnumConta(int num){
   this.numConta=num;
   }
   
   public int getnumConta(){
   return this.numConta;
   }

    public String getCorrentlista() {
        return Correntlista;
    }

    public void setCorrentlista(String Correntlista) {
        this.Correntlista = Correntlista;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
   
}
