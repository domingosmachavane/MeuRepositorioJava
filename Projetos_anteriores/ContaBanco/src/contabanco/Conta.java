
package contabanco;
import java.io.*;
public class Conta {
    //Local declaracao de atributos
    int numero;
    String titular;
    double Saldo;
//constructor
    public Conta(int numero, String titular, double Saldo) {
        this.numero = numero;
        this.titular = titular;
        this.Saldo = Saldo;
    }
 //metodos
    void Saca(double quantidade){
       if(quantidade< this.Saldo){
        double novoSaldo=this.Saldo-quantidade;
       }else{
           System.out.println("Impossivel Sacar pois o saldo e inssuficiente");
       }
    }
    void Deposita(double quantidade){
        this.Saldo+=quantidade;
    }
}
