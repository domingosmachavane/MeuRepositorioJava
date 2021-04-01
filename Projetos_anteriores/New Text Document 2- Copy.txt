
package javaapplication65;


public class Pessoa {
    private float altura;
    private char sexo;
    private String nome;
    
    public Pessoa(){
        
    }
    public Pessoa(float altura, char sexo, String nome) {
        this.altura = altura;
        this.sexo = sexo;
        this.nome = nome;
    }
   
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   

    @Override
    public String toString() {
        return "Pessoa{" + "altura=" + altura + ", sexo=" + sexo + ", nome=" + nome + '}';
    }
    
}
