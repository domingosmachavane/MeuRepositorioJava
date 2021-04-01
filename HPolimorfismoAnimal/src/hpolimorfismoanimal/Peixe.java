package hpolimorfismoanimal;

class Peixe extends Animal {

    private String caract;

    public
                Peixe(String nome, String caract)
                 {
        super(nome, 0, "Cinzenta", "Mar");
        this.caract = caract;
    }
    public String toString()

    {
                return caract;
    }
}