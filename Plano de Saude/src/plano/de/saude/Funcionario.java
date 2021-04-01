/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano.de.saude;

/**
 *
 * @author Domingos Machavane
 */
public class Funcionario {
    
    private String nome;
    private int idade;
    private char sexo;
    private int contacto;
    private double salario;

    public Funcionario(String nome, int idade, char sexo, int contacto, double salario) {
      
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.contacto = contacto;
        this.salario = salario;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getContacto()
    {
        return contacto;
    }

    public void setContacto(int contacto) 
    {
        this.contacto = contacto;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }
    
    public void marcaConsulta(double salario)
    {
    }
    
    public void acessoMedicamentos(double salario)
    {
        
    }
    public void internacoes(double salario)
    {
        
    }
     public void dependentes(double salario)
    {
        
    }
      public void atendimentoExterior(double salario)
    {
        
    }
   
}
