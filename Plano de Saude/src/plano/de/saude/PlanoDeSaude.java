/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plano.de.saude;

public class PlanoDeSaude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f = new FuncionarioGold("Domingos",19,'M',878904085,2000000);
        f.acessoMedicamentos(f.getSalario());
        f = new FuncionarioSilver("Domingos",19,'M',878904085,2000000);
        f.atendimentoExterior(f.getSalario());
    }
    
}
