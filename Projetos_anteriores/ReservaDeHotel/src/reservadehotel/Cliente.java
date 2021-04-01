
package reservadehotel;

public class Cliente extends Pessoa{
    private int num_ocup;
    private String tipo_quarto;
    private String tipo_cama;
    private double valortotal;
   
    
    

    public Cliente(String nome, String data_nasc, String Bi, int contato1, int contato2,int num_ocup) {
        super(nome, data_nasc, Bi, contato1, contato2);
        this.num_ocup=num_ocup;
    }
      public double ValorMensal(String tipo_quarto,String tipo_cama){
          if(tipo_quarto.equals("Luxuoso")){
              if(tipo_cama.equals("Casal")){
                  valortotal=valortotal+2000;
              }else{
                  if(tipo_cama.equals("solteiro")){
                      valortotal=valortotal+1500;
                  }
              }
          }else{
                     if(tipo_quarto.equals("Simples")){
                         if(tipo_cama.equals("Casal")){
                             valortotal=valortotal+1200;
                         
                         }else{
                             if(tipo_cama=="solteiro"){
                             valortotal=valortotal+1000;
                             }
                         }
                             
                      }
          }
          return valortotal;
       
    }
    
     
      public String toString(){
      return super.toString()+"Tipo de quarto:"+this.tipo_quarto+"\nTipo de Cama:"+this.tipo_cama+"\n Valor total="+this.valortotal;
      }
    
    
    
}
