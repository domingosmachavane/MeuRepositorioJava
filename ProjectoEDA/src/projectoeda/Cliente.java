 
package projectoeda;

public class Cliente 
{
    //Atributos do cliente
    
    private String nomeCliente;
    private int contactCliente;
    private String casaCliente, quarteirCliente;
    
    public Cliente()
    { }

    public void setNomeCliente(String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }

    public void setContactCliente(int contactCliente) 
    {
        this.contactCliente = contactCliente;
    }

    public void setCasaCliente(String casaCliente) 
    {
        this.casaCliente = casaCliente;
    }

    public void setQuarteirCliente(String quarteirCliente) 
    {
        this.quarteirCliente = quarteirCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nomeCliente=" + nomeCliente + ", contactCliente=" + 
                    contactCliente + ", casaCliente=" + casaCliente + ", quarteirCliente=" +
                    quarteirCliente + '}';
    }
    
}
