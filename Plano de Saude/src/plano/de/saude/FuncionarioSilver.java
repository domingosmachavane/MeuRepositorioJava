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
public class FuncionarioSilver extends Funcionario {

    public FuncionarioSilver(String nome, int idade, char sexo, int contacto, double salario) {
        super(nome, idade, sexo, contacto, salario);
    }

    @Override
    public void acessoMedicamentos(double salario) {
        //super.acessoMedicamentos(salario); //To change body of generated methods, choose Tools | Templates.
        
            System.out.print("Acessando a medicamentos: ");
    }

    @Override
    public void dependentes(double salario) {
        //super.dependentes(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Um dependente: ");
    }

    @Override
    public void internacoes(double salario) {
        //super.internacoes(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Internando: ");
    }

    @Override
    public void marcaConsulta(double salario) {
        //super.marcaConsulta(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Marcando Consulta....");
    }

    
    
    
}
