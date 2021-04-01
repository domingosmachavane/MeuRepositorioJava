
package cursopooaula5a;
import java.io.*;
public class ContaBanco {
    //atributos
 public int numConta;
 protected String tipo;
 private String dono;
 private double Saldo;
 private boolean status;
//Constructor
 public ContaBanco(){
 this.Saldo=0;
 this.status=false;
 
 }
 public void AbrirConta(String dono,String tipo,int numConta){
     this.status=true;
     this.dono=dono;
     this.tipo=tipo;
     this.numConta=numConta;
    if("Conta Corrente".equals(tipo)){
      this.Saldo=50;
    }else if("Conta Poupanca".equals(tipo)){
        this.Saldo=150;
    }
     System.out.println("Conta aberta com Sucesso");
 }
 public void FecharConta(){
      if(this.Saldo>0){
          System.out.println("Conta nao pode ser fechada pois ainda tem saldo");
      }else if(this.Saldo<0){
          System.out.println("Nao e possivel fechar porque ainda tem debito");
      }else{
         this.status=false;
          System.out.println("Conta fechada Com sucesso");
      }
 }
 public void depositar(double valor){
     if(true!=this.getStatus()){
         System.out.println("Impossivel Depositar");
     }else{
         this.Saldo+=valor;
         System.out.println("Deposito Realizado com sucesso");
     }            
     
 }
 public void Sacar(double valor){
   if(valor<=this.Saldo){
       this.Saldo=this.Saldo-valor;
       System.out.println("Levatameento realizado com sucesso");
       }else{
       System.out.println("Saldo insuficiente");
   }
 }
 public void PagaMensal(){
 int v=0;
     if (this.tipo=="Conta Corrente") {
         v=12;
         }else if(this.tipo=="Conta Poupanca"){
         v=20;
      }
     if(this.getStatus()){
          this.setSaldo(this.getSaldo()-v);
          System.out.println("Mensalidade paga com sucesso por "+this.dono);
     }else{
         System.out.println("impossivel pagar Conta fechada");
     }
     
     
 }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void imprime(){
        System.out.println("dono: \t "+this.dono+"\n conta: \t"+this.numConta+" \n Saldo : \t"+this.Saldo+"\n tipo :"+this.tipo);
    }
 
    
}
