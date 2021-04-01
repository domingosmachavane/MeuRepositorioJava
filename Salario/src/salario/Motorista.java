package salario;

/**
 *
 * @author Domingos Machavane
 */
public class Motorista implements SalarioInterface {
private String nome;
private int numCarteira;
private int numeroTaxi;
private float
totKmRodados,valorKm;
public Motorista (String n,int nc,int num,float t,float v){
    this.nome = n; 
    this.numCarteira = nc;
    this.numeroTaxi = num;
    this.totKmRodados= t;
    this.valorKm = v;
}
    @Override
    public float getSalarioLiquido() {
        float salBruto = totKmRodados * valorKm;
return salBruto -(salBruto*(float)0.05 );
    }

    @Override
    public float getQuantidadeSalariosMinimo() {
        return (2 * getSalarioLiquido () / SALARIO_MINIMO);
    }
   
}
