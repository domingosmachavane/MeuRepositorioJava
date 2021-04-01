package exercicio02;
public class Exercicio02 {
    public static void main(String[] args) {
        Televisor tc[] = new Televisor[4]; 
        //(short ano_fabrico, boolean televisao_smart, float preco, short numero_polegadas, String marca)
        tc[0]=new Televisor(2019,true,15000f,65," samusng");
        tc[0].preco_medio();
        tc[1]=new Televisor(2018,true,1500f,50," hisense");
        tc[2]=new Televisor(2017,true,1500f,52," sonyy");
        tc[0].apresentcao();
    }

 
    
}
