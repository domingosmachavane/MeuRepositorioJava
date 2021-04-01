package exemplo1;
public class CRefrigerante implements Refrigerante {
    //atributos
    private String tampa;
    private int Quantidade;
    
    //Metodos Especiais
    public CRefrigerante(String tampa){
        this.tampa=tampa;
        this.Quantidade=250;
    }

   private String getTampa() {
        return tampa;
    }

   private void setTampa(String tampa) {
        this.tampa = tampa;
    }

    private int getQuantidade() {
        return Quantidade;
    }

    private void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    //abstractos

    @Override
    public void AbrirRefrigerante() {
        if(getTampa()=="fechada"){
            System.out.println("abrindo.....");
            this.setTampa("aberta");
        }else{
            System.out.println("impossivel abrir com tampa aberta");
        }
    }

    @Override
    public void FecharRefrigerante() {
         if(getTampa()=="aberta"){
            System.out.println("Fechando......");
            this.setTampa("fechada");
        }else{
            System.out.println("impossivel fechar com tampa fechar");
        }
         
        
    }

    @Override
    public void BeberRefrigerante() {
        if(getTampa()=="aberta"){
            System.out.println("Bebendo......");
        }else{
            System.out.println("impossivel beber com tampa fechada");
        }
        
    }

    @Override
    public int EstadoRefrigerante(int quantidade) {
        this.Quantidade=quantidade;
        return this.Quantidade;
        }
}
