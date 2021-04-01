/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste1;

import java.util.Vector;

public class Teste1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Pessoa> vetor = new Vector<>();
      
        
        Pessoa pe= new Pessoa();
        pe.setNome("Joao");
        pe.setIdade(15);
         Pessoa pe2= new Pessoa();
        pe2.setNome("Fernanada");
        pe2.setIdade(15);
        vetor.addElement(pe2);
        vetor.addElement(pe);
        
        
        for(int i=0;i<vetor.size();i++){
            System.out.println(vetor.get(i).getNome());
            System.out.println(vetor.get(i).getIdade());
        } 
    }
    
}
