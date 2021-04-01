
package classthreadprincipal;

public class ThreadHeranca extends java.lang.Thread {
    private StringBuffer buf;
    private String texto;
    public ThreadHeranca(StringBuffer buf, String texto){
                super();
                this.buf = buf;
                this.texto = texto;
    }
    public void run(){
                for(int i = 0; i<10 ; i++){
                        buf.append(texto);
                }
                try{
                    sleep((long)Math.random()*100);
                }catch(InterruptedException ie){}
    }

}
 
  
