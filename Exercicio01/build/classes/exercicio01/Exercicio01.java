package exercicio01;
public class Exercicio01 {
    public static void main(String[] args) {
        CalculoArea mz = new CalculoArea(12.4f,14);
        mz.Apresentacao();
        mz.TrocaValores(14, 12.4f);
        System.out.println(mz.getApotema()+" \n "+mz.getLado());
    }
    
}
