
package aula04;


public class Caneta {
   public String modelo;
    private float Ponta;
    public String getModelo(){
    return this.modelo;
    }
     public void setModelo(String m){
     this.modelo=m;
    }
      public float getPonta(){
    return this.Ponta;
    }
       public void setPonta(float d){
     this.Ponta=d;
    }
       public void status(){
           System.out.println("Sobre a Caneta");
           System.out.println("Modelo "  + this.modelo);
           System.out.println("Ponta "   + this.Ponta);
       }
}
