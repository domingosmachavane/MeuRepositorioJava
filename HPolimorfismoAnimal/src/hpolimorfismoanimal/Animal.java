package hpolimorfismoanimal;

class Animal 

    //todo codigo está gravado num unico ficheiro AnimalExHierarq java
{
protected String nome, cor, ambiente;
    protected int patas;

    public Animal(String nome, int patas, String cor, String ambiente)  {
        this.nome = nome;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", cor=" + cor + ", ambiente=" + ambiente + ", patas=" + patas + '}';
    }
    
}
