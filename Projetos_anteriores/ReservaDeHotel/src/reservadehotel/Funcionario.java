
package reservadehotel;

public class Funcionario extends Pessoa {
    private String Cargo;
    private int Num_reserva;
    private boolean ocup_quarto;
     private double valortotal;

    public Funcionario(String nome, String data_nasc, String Bi, int contato1, int contato2,String Cargo,int Num_reserva,boolean ocup_quarto) {
        super(nome, data_nasc, Bi, contato1, contato2);
        this.Cargo=Cargo;
        this.Num_reserva=Num_reserva;
        this.ocup_quarto=ocup_quarto;
    }
    public String Quarto_ocupado(){
     this.ocup_quarto=true;
     return "O quarto esta ocupado";
    }
    public String Quartoocupado(){
     this.ocup_quarto=false;
     return "O quarto nao esta ocupado";
    }
    public String toString(){
   return super.toString()+"\nCargo:"+this.Cargo+
               "\nNumero de reserva: "+this.Num_reserva+"\nOcupado?: "+this.ocup_quarto+"\nvalor total e: "+this.valortotal;
    
    }
    
  


    
    
}
