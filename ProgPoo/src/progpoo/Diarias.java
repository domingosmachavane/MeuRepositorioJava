
package progpoo;
public class Diarias {
    private float valor, total;
    private int codPac;
    private Sala consultoria;
   
    
    
    public Diarias(int num, Sala consultoria){
        this.codPac= num;
        this.consultoria= consultoria;
        
        if((this.consultoria.getTipoDeConsulta().equalsIgnoreCase("simples")) && (this.consultoria.getDataDaConsulta().equalsIgnoreCase("normal"))){
            valor = 100;
        }else 
            if(this.consultoria.getTipoDeConsulta().equalsIgnoreCase("especial") && (this.consultoria.getDataDaConsulta().equalsIgnoreCase("normal"))){
                valor = 500;
            }else
                if(this.consultoria.getTipoDeConsulta().equalsIgnoreCase("Simples") && this.consultoria.getDataDaConsulta().equalsIgnoreCase("urgente")){
                    valor = 200;
                }else
                    if(this.consultoria.getTipoDeConsulta().equalsIgnoreCase("especial") && this.consultoria.getDataDaConsulta().equalsIgnoreCase("urgente")){
                        valor = 1000;
                    }
        imprimirDiarias();
        this.total +=valor;
        
    }

   

   
    
    public void imprimirDiarias(){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Numero do Paciente: " + codPac + "\n") ;
            System.out.println("Tipo de consulta: " + this.consultoria.getTipoDeConsulta()+ "\n");
            System.out.println("Data para a realizacao: " + this.consultoria.getDataDaConsulta() +"\n");
            System.out.println("Valor a pagar: " + this.valor + "\n");
            System.out.println("-------------------------------------------------------------------------");

    }
     public float getValor() {
        return valor;
    }
    
   
    public float getTotal() {
        return total;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
}
