
package aula011;

public class Bolsista extends ALuno{
    private float bolsa;

    public Bolsista(int mensalidade) {
        super(mensalidade);
    }
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    //@Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" e bolsista ! pagamento facilitado ");
    
    
}

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
