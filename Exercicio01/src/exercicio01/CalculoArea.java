package exercicio01;
public class CalculoArea {
    //atributos
    private float apotema;
    private float lado;
    //metodos especiais
    public CalculoArea( float apotema,float lado){
                this.apotema=apotema;
                this.lado=lado;
    }
     public void TrocaValores( float apotema,float lado){
                this.apotema=lado;
                this.lado=apotema;
                
                }
    public float CalculoArea(){
        float area =getApotema()*getLado();
        return area;
    }
    public float CalculoPerimetro(){
        float peri=getApotema()+getLado();
        return peri;
    }
    public void Apresentacao(){
        System.out.println("==================  =====================");
        System.out.println("Olaaaa a Area do pentagno eh : "+CalculoArea());
        System.out.println("olaaaa o perimetro eh: "+CalculoPerimetro());
        System.out.println("Obrigado por Tudo jesus");
    
    }
    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    
     
    
}
