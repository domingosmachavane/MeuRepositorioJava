package salario;

/**
 *
 * @author Domingos Machavane
 */
public class Professor implements SalarioInterface {

    private String nome;
    private int cargaHoraria;
    private float valorHora;
    public Professor (String nome , int cargaHoraria, float valorHora){
    this.nome  = nome;
    this.cargaHoraria  = cargaHoraria;
    this.valorHora  = valorHora;
}

    public Professor() {
    }
    
    public String getNome () { return(nome);}
public int getChsemanal () { return cargaHoraria ;}
public float getValorHora () { return valorHora;}
@Override
 public float getSalarioLiquido(){
float salBruto = valorHora*cargaHoraria*(float)4.5;
return  salBruto*(float)0.08;
}
@Override
            public float getQuantidadeSalariosMinimo() {
      return ( getSalarioLiquido()/SALARIO_MINIMO);
    }
}
