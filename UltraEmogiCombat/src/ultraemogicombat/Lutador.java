
package ultraemogicombat;
public class Lutador {
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas,empates;
     
    //metodos publicos
    public void apresentar(){
        System.out.println("=======================================================");
        System.out.println("CHEGOU A HORA ! Apresenatmos o Lutador : "+this.getNome());
        System.out.println("Directamente de "+this.getNacionalidade());
        System.out.println("Com : "+this.getIdade()+" anos e : "+this.getAltura()+"m");
        System.out.println("Pesando : "+this.getPeso()+" Kg");
        System.out.println(this.getVitorias()+" Vitorias");
        System.out.println(this.getDerrotas()+" Derrotas e ");
        System.out.println(this.getEmpates()+" Empates!");
    
    }
    public void status(){
        System.out.println(this.getNome()+"E um peso "+this.getCategoria());
        System.out.println("ganhou : "+this.getVitorias()+"Vezes");
        System.out.println("Perdeu : "+this.getDerrotas()+"Vezes");
        System.out.println("Empates : "+this.getEmpates()+"Vezes");
    
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    
    }
    
    //metodos especiais

    public Lutador(String nome, String nacionalidade, int idade,
                float altura, float peso, int vitorias, int derrotas,
                int empates) {
        this.setNome( nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade( idade);
        this.setAltura( altura);
        this.setPeso(peso);
        this.setVitorias( vitorias);
        this.setDerrotas( derrotas);
        this.setEmpates(empates);
    }

     public String getNome() {
        return nome;
    }

     public void setNome(String nome) {
        this.nome = nome;
    }

     public String getNacionalidade() {
        return nacionalidade;
    }

     public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
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

     private float getPeso() {
        return peso;
    }

     private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

     public void setCategoria() {
        if(this.peso<52.2){
          this.categoria="invalido";  
         }else if(this.peso<=70.3){
                this.categoria="Leve";
         }else if(this.peso<=83.9){
                this.categoria="medio";
         }else if(this.peso<=120.2){
             this.categoria="Pesado";
         }else{
                this.categoria="Invalido";
            }
         }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
}
