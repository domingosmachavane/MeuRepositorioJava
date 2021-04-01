
package preparacaoexame1;

public class Estudante extends Pessoa {
    private float nota1 ,  nota2 , media;
    
    public Estudante(String nome , int idade ,float nota1 , float nota2){
            super(nome , idade);
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.media = (nota1+nota2)/2;
    }
    public float getMedia(){
            return this.media ;
    }

    @Override
    public String toString() {
        return  super.toString()+" Estudante{" + "nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + '}';
    }
   
}
