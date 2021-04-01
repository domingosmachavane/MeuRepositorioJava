package ultraemogicombat;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class UltraEmogiCombat {
    public static void main(String[] args) {
        Lutador mz[] =new Lutador[5];
        mz[0]=new Lutador("pretty Boy","Franca",31,1.75f,68.9f,11,3,1);
        mz[1]=new Lutador("putScript","Brasil",29,1.68f,57.8f,14,2,3);
        mz[2]=new Lutador("putScript","Brasil",29,1.68f,57.8f,14,2,3);
        mz[3]=new Lutador("putScript","Brasil",29,1.68f,57.8f,14,2,3);
        mz[4]=new Lutador("putScript","Brasil",29,1.68f,57.8f,14,2,3);
       Luta  UEMC= new Luta();
       UEMC.marcarLuta(mz[0], mz[1]);
       UEMC.lutar();
       mz[0].status();
       mz[1].status();
    }
    
}
