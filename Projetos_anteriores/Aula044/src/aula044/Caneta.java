
package aula044;

class Caneta {
       public String modelo,cor;
    private float ponta;
    private  boolean tampada;
    public Caneta(String m,String c,float p){
        this.modelo=m;
        this.cor=c;
        this.Tampar();
        this.ponta=p;

    }
    public void Tampar(){
     this.tampada=true;
    }
    public void Destampar(){
    this.tampada=false;
    }
    public String getModelo(){
    return modelo;
    }
    public void setModelo(String m){
        this.modelo=m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
       this.ponta=p;
    } 
    public void status(){
        System.out.println("ABOUT A PEN:");
        System.out.println("MODEL:"+this.modelo);
        System.out.println("PONTA:"+this.ponta);
        System.out.println("a cor "+this.cor);
        System.out.println("a caneta esta:"+this.tampada);
        System.out.println("------------------------:");
    }
}
