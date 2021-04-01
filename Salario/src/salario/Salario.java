package salario;

/**
 *
 * @author Domingos Machavane
 */
import java.io.*;
import java.util.Vector;


public class Salario {

    public static void main(String[] args) {
        SalarioInterface a = new Professor("Joao Paulo", 12, 500);
        System.out.println("\t\t PROFESSOR \nSalario Liquido: "+a.getSalarioLiquido()+" nQde de Salminimo "+ a.getQuantidadeSalariosMinimo());
    //Jose Bata",112233,32,300,50);
        SalarioInterface b = new Motorista("Joao Paulo", 112233,32,300,50);
        System.out.println(" \t\tMotorista \nSalario Liquido: "+b.getSalarioLiquido()+" nQde de Salminimo "+ b.getQuantidadeSalariosMinimo());
        
    }

}
