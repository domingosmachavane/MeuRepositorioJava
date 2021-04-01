
package ultraemogicombat;
import java.util.Random;
public class Luta {
    private int rounds;
    private boolean aprovado;
    private Lutador desafiante;
    private Lutador desafiado;
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!= l2){
            this.aprovado=true;
            this.desafiado=l1;
            this.desafiado=l2;
            
           }else{
            this.aprovado=false;
            this.desafiado=null;
            this.desafiado=null;
        }
    
    }
    public void lutar(){
        if(this.aprovado){
            System.out.println("###Desafiado###");
            this.desafiado.apresentar();
            this.desafiado.apresentar();
            Random aleatorio= new Random();
            int vencedor =aleatorio.nextInt(3);
            switch(vencedor){
                case 0://empate
                    System.out.println("Empatouuuu");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado vence
                    System.out.println(this.desafiado.getNome()+" Ganhouuuuu");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                case 2://desafiante vence
                    System.out.println(this.desafiante.getNome()+" Ganhouuuuuuu");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                break;
            
            }
        
        
        
        }else{
            System.out.println("a Luta nao pode acontecer");
        }
    
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador Desafiado) {
        this.desafiado = Desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    
    
}
