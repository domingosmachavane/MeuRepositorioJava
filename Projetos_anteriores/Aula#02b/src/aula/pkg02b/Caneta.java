
package aula.pkg02b;

public class Caneta {
 //atributos
  String modelo, cor;
  float ponta;
  int carga;
  boolean tampada;
  // constructor
  void status(){
      System.out.println("Uma caneta "+this.cor+ "\nPonta "+this.ponta);
  }
  void rabiscar(){
      if(this.tampada==true){
          System.out.println("Nao posso rabiscar porque a caneta esta tampada");
          
      }else{
          System.out.println("estou rabiscando");
      }
  }
  void tampar(){
      this.tampada=true;
  }
  void destampar(){
      this.tampada=false;
  }
  
  
}
