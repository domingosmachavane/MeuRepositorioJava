package aula06;
public class Controle_Remoto implements Controlador {
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Metodos especiais
    public Controle_Remoto(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    //abstractos

    @Override
    public void Ligar() {
        this.setLigado(true);
    }

    @Override
    public void Desligar() {
        this.setLigado(false);
    }

    @Override
    public void AbrirMenu() {
        if(getLigado()){
        System.out.println("=========Menu==========");
        System.out.println("esta ligado?\t"+this.getLigado());
        System.out.println("Esta tocando \t "+this.getTocando());
        System.out.print("Volume \t"+this.getVolume());
            for(int i=0;i<this.getVolume();i+=10){
                System.out.print("|");
        }
       }else{
            System.out.println("Impossivel abrir menu com tv desligada");
        }
    }

    @Override
    public void FecharMenu() {
        if(getLigado()){
            System.out.println("Fechando Menu.....");
        }else{
            System.out.println("impossivel fechar menu com tv desligada");
        }
    }

    @Override
    public void MaisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else{
            System.out.println("impossivel aumentar volume");
        }
    }

    @Override
    public void MenosVolume() {
         if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else{
            System.out.println("impossivel diminuir volume");
        }
    }

    @Override
    public void LigarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }else{
            System.out.println("impossivel LigarMudo");
        }
    }

    @Override
    public void DesligarMudo() {
         if(this.getLigado()&& this.getVolume()==0){
            this.setVolume(50);
        }else{
         System.out.println("impossivel desligarMudo");
         }
    }

    @Override
    public void Play() {
        if(this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }else{
           System.out.println("impossivel........"); 
        }
    }

    @Override
    public void Pause() {
         if(this.getLigado()&& (this.getTocando())){
            this.setTocando(false);
        }else{
         System.out.println("impossivel......."); 
         }
    }
    
}
