
package sistema_de_gestao_escolar;

public class Teste {
    private float teste1;
    private float teste2;
    private float trabalhos[]=new float[4];

    public Teste(float teste1, float teste2) {
        this.teste1 = teste1;
        this.teste2 = teste2;
    }
    public float Media(float teste1,float teste2,float [] trabalhos){
            float media,soma1=0;
            for(int i=0;i<trabalhos.length;i++){
                    soma1+=trabalhos[i];
            }
            media=(float) (teste1*0.4+teste2*0.4+soma1*0.20);
            
         return media;   
    }

    public float getTeste1() {
        return teste1;
    }

    public void setTeste1(float teste1) {
        this.teste1 = teste1;
    }

    public float getTeste2() {
        return teste2;
    }

    public void setTeste2(float teste2) {
        this.teste2 = teste2;
    }

    public float[] getTrabalho() {
        return trabalhos;
    }

    public void setTrabalho(float[] trabalho) {
        this.trabalhos = trabalho;
    }
    
    
}
