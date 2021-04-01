package hpolimorfismoanimal;

class Mamifero extends Animal {

    public
                Mamifero(String nome, int patas, String cor)
                 {
        super(
                    nome, patas, cor, "Terra");
    }

    class Urso extends Mamifero {

        private String alimento;

        public
                    Urso(String nome, int patas, String cor, String alimento)
                     {
            super(nome, patas, cor);
            this.alimento = alimento;
        }

        public String toString() 
            { return super.toString()+" "+this.alimento;

        }
    }
}