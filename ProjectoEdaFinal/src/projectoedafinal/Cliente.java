
package projectoedafinal;

public class Cliente extends Pessoa{
            private String pedido [] = new String[20];
            private double precoPagar;
    public Cliente(String nome, int casa, int quarteirao, int telefone) {
        super(nome, casa, quarteirao, telefone);
        
    }

    public String[] getPedido() {
        return pedido;
    }

    public void setPedido(String[] pedido) {
        this.pedido = pedido;
    }

    public double getPrecoPagar() {
        return precoPagar;
    }

    public void setPrecoPagar(double precoPagar) {
        this.precoPagar = precoPagar;
    }
    

    
}
