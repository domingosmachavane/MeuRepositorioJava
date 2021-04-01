import java.io.*;
public class appConta {
public static void main(String[] args) {
    Conta c1= new Conta();
    c1.setCorrentlista("Fulano");
    c1.setnumConta(12345);
    c1.setValor(1237);
    System.out.println(" o numero da corrente lista e "+c1.getCorrentlista()+"");
    }
    
}
