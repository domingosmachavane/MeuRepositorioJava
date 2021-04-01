
package aula06b;

public class ControleRemote implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemote() {
       this.volume=50;
       this.ligado=false;
       this.tocando=false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void Ligar() {
        this.setLigado(true);
        
    }

    @Override
    public void Desligar() {
         this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("======Menu=====");
        System.out.println("Esta ligado?\t" +this.getLigado());
        System.out.println("Esta Tocando?\t"+this.getTocando());
        System.out.print("Volume:"+this.getVolume());
        for(int i=0;i<=this.getVolume();i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void MaisVolume() {
        if(this.getLigado()){
                this.setVolume(this.getVolume()+5);
        }
    }

    @Override
    public void MenusVolume() {
         if(this.getLigado()){
                this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void LigarMudo() {
        if(this.getLigado()&&this.getVolume()>0)
            this.setVolume(0);
    }

    @Override
    public void DesligarMudo() {
            if(this.getLigado()&&this.getVolume()==0){
            this.setVolume(50);
    }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
         if(this.getLigado() && !this.getTocando()){
            this.setTocando(false);
        }
     }
    
    
}
