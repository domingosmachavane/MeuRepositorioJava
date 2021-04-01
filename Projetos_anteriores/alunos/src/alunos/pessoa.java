
package alunos;


public class pessoa {
    //atributos
    private int idade;
    private float altura;
    private String nome;
    private char sexo;
    //constructor
    
    public pessoa(float altura, char sexo, String nome) {
        this.altura = altura;
        this.sexo = sexo;
        this.nome = nome;
    }

    pessoa() {
         }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
public String toString() { 
    return  "Pessoa{" + "altura=" + altura + ", sexo=" + sexo + ", nome=" + nome + '}';

    }

}

