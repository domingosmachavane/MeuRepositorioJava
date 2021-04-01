package aula05;
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos personalizados
    public void estadoactual(){
        System.out.println("=============================================================");
            System.out.println("conta:"+this.getNumConta()+"\ndono:"+this.getDono()+"\ntipo:"+this.getTipo()+"\nSaldo:"+this.getSaldo()+"\nstatus:"+this.getStatus());
       System.out.println("=============================================================");
    }
    public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if(t=="CC")
        this.setSaldo(50);
    else if(t=="CP"){
    this.setSaldo(150);
    }   
    }
    public void fecharConta(){
    if(this.getSaldo()>0){
        System.out.println("conta nao pode ser fechada porque ainda tem saldo");
    }else{
        if(this.getSaldo()<0){
            System.out.println("conta nao pode ser fechada pois tem debito");
        }else{
        this.setStatus(false);
            System.out.println("Conta fechada com sucesso ");
        }
    
    }
    }
    public void depositar(float v){
    if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado com sucesso na conta de:"+this.getDono());
        }else{
            System.out.println("impossivel depositar em uma conta fechada");
    }
    }
    public void sacar(float v){
        if(this.getStatus()){
                if(this.getSaldo()>=v){
                    this.setSaldo(this.getSaldo()-v);
                        System.out.println("lenvatamento realizado na conta de "+this.getDono());
                }else{
                    System.out.println("saldo insuficiente para lenvatar");
                }
        }else{
            System.out.println("impossivel lenvantar numa conta fechada");
        }
    
    }
    public void pagarMensalidade(){
    int v=0;
        if (this.getTipo()=="CC") {
          v=12;  
            }else if(this.getTipo()=="CP"){
            v=20;
            }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso"+this.getDono());
        }else{
            System.out.println("impossivel pagar  mensalidade com conta fechada");
        
        }
    }
    //Metodos Especiais
    public ContaBanco(){
    this.setSaldo(0);
    this.setStatus(false);
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
