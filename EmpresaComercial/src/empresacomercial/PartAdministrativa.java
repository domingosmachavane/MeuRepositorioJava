
package empresacomercial;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Vector;

public class PartAdministrativa extends Funcionario implements Serializable {
    private float Salario_Fixo ;
    private int HorasTrabExtras=0,QuantDias=0;

    public PartAdministrativa(int IdFuncionario, String nome,float salarioF) {
        super(IdFuncionario, nome);
        this.Salario_Fixo = salarioF;
        
    }

    /**
     *
     * @param Horatrab
     * @param quant
     */
    public void AddHoras_quantDias(int horas , int quant){
                            this.setHorasTrabExtras(horas);
                            this.setQuantDias(quant);
                         //  this.setHorasTrabExtras +=horas;
                          // this.QuantDias +=quant;
    }
    public float calculoHorasExtras(){
        if(this.getQuantDias() <= 0){
                            System.out.println("===Salario Indisponivel para quant de dias menor que 0 ======");
                            return 0;
                        }else{
                float horasExtras = (this.Salario_Fixo / this. HorasTrabExtras)*0.5f;
                return horasExtras;
        }
    }
    public void PagamentoMensal(){
        float p = calculoHorasExtras();
        if(p == 0){
                this.Salario_Fixo = this.Salario_Fixo;
        }else{
                this.Salario_Fixo = this.Salario_Fixo + p; 
        }
               System.out.println("=====================Salario Administrativa=================\nNome: "+super.getNome()+"\n Pagamento: "+this.Salario_Fixo);
    }

    public float getSalario_Fixo() {
        return Salario_Fixo;
    }

    public void setSalario_Fixo(float Salario_Fixo) {
        this.Salario_Fixo = Salario_Fixo;
    }

    public float getHorasTrabExtras() {
        return HorasTrabExtras;
    }

    public void setHorasTrabExtras(float HorasTrabExtras) {
        this.HorasTrabExtras += (int) HorasTrabExtras;
    }

    public float getQuantDias() {
        return QuantDias;
    }

    public void setQuantDias(float QuantDias) {
        this.QuantDias += (int) QuantDias;
    }

        
}
