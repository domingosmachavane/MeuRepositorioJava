package exercicio02;
public final class Televisor {
    //atributos 
    private int ano_fabrico;
    private boolean televisao_smart;
    private float preco;
    private int numero_polegadas;
    private String marca;
   int cont=0;
    float preco_medio=0;
    float media=1;
    //Metodos especiais

    public Televisor(int ano_fabrico, boolean televisao_smart, float preco, int numero_polegadas, String marca) {
        this.setAno_fabrico(ano_fabrico);
        this.setTelevisao_smart(televisao_smart); 
        this.setPreco(preco);
        this.setNumero_polegadas(numero_polegadas);
        this.setMarca(marca);
        
    }
    public float preco_medio(){
        this.preco_medio+=this.preco;
        if(this.preco_medio==0){
            System.out.println("Impossivel divisao por zero");
            System.exit(0);
        }else{
                float media=this.preco_medio/this.cont;
        }
        
        
        
    return media;
    }
    public void apresentcao(){
        System.out.println("olaaaaa a media:"+preco_medio());
        
    
    }

    public int getAno_fabrico() {
        return ano_fabrico;
    }

    public void setAno_fabrico(int ano_fabrico) {
       if( this.ano_fabrico<=2012 && this.ano_fabrico>=2019){
                this.ano_fabrico=ano_fabrico;
       }else{
           System.out.println("==========Impossivel========");
       }
    }

    public boolean getTelevisao_smart() {
        return televisao_smart;
    }

    public void setTelevisao_smart(boolean televisao_smart) {
        this.televisao_smart = televisao_smart;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if( this.preco<=10000 && this.preco>=7000){
            this.preco=preco;
         }else{
            System.out.println("========impossivel=========");
        }
    }

    public int getNumero_polegadas() {
        return numero_polegadas;
    }

    public void setNumero_polegadas(int numero_polegadas) {
        if(this.numero_polegadas>=32 && this.numero_polegadas<=60){
                this.numero_polegadas=numero_polegadas;
        }else{
            System.out.println("========impossivel============");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
