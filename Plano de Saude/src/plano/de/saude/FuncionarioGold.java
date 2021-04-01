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
public class FuncionarioGold extends Funcionario{

    public FuncionarioGold(String nome, int idade, char sexo, int contacto, double salario) {
        super(nome, idade, sexo, contacto, salario);
    }
  
    @Override
    public void marcaConsulta(double salario) {
       // super.marcaConsulta(salario);
        System.out.print("Marcando consultando: ");
    }

    @Override
    public void acessoMedicamentos(double salario) {
        //super.acessoMedicamentos(salario); 
        System.out.print("Acessando medicamentos: ");
    }

    @Override
    public void internacoes(double salario) {
       // super.internacoes(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Internando: ");
    }

    @Override
    public void dependentes(double salario) {
        //super.dependentes(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Dois depentes: ");
    }

    @Override
    public void atendimentoExterior(double salario) {
        //super.atendimentoExterior(salario); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Tem acesso a atendimento exterior.");
    }

    
}
