
package empresacomercial;
import java.io.Serializable;


public class Vendedor extends Funcionario implements Serializable {
            private float salarioBase ,comisao;
            private int quantVendas=0;
            final float PERCENTUAL=0.7f;


//System.out.println(decimal.format(valor));
     public Vendedor(int IdFuncionario,String nome) {
         super(IdFuncionario,nome);
        
    }
    public Vendedor(int IdFuncionario, String nome,float salarioBase, int totalVendas ) {
        super(IdFuncionario,nome);
        this.salarioBase = salarioBase;
        this.quantVendas = totalVendas;
    }

    /**
     *
     */
   
    public void AddVendas(int quant){
               this.setQuantVendas(quant);
              
    }
            
            public double ComisaoDeVendas(){
                this.comisao  =  this.PERCENTUAL*this.quantVendas;
            return comisao;
            }
            public void SalarioTot(){
                        this.salarioBase += this.comisao; 
            }
            public void SalarioTotal(){
                System.out.println("====================Salario Total de Vendedor ==============");
                double salarioTotal = ComisaoDeVendas()+this.getSalarioBase();
                System.out.println("Nome: "+super.getNome()+"\nComisao:\t"+ComisaoDeVendas()+"\nSalarioFinal:\t"+salarioTotal);
            
            }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas += quantVendas;
    }

    public float getComisao() {
        return comisao;
    }

    public void setComisao(float comisao) {
        this.comisao = comisao;
    }

 

            
}
